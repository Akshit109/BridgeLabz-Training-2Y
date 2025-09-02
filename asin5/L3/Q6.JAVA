import java.util.Scanner;

public class FrequencyUsingNestedLoops {

    // Method to find frequency of characters using nested loops
    public static String[] findFrequencies(String text) {
        char[] chars = text.toCharArray();   // Convert string to char array
        int[] freq = new int[chars.length];  // Frequency array

        // Outer loop → go through each character
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;   // Initialize frequency to 1

            if (chars[i] == '0') {  // Skip already counted characters
                continue;
            }

            // Inner loop → check for duplicate characters
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';  // Mark as counted
                }
            }
        }

        // Count how many unique characters (not marked as '0')
        int uniqueCount = 0;
        for (char c : chars) {
            if (c != '0') {
                uniqueCount++;
            }
        }

        // Store result in 1D String array
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " = " + freq[i];
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method to get frequencies
        String[] frequencies = findFrequencies(input);

        // Display result
        System.out.println("\nCharacter Frequencies:");
        for (String s : frequencies) {
            System.out.println(s);
        }

        sc.close();
    }
}
