import java.util.Scanner;

public class UniqueCharFrequency {

    // Method to find unique characters using charAt() and nested loops
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Check if character already exists in temp
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Copy only unique characters into final array
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency of characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII size

        // Count frequencies
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Store result in 2D String array
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);   // character
            result[i][1] = String.valueOf(freq[uniqueChars[i]]); // frequency
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Get frequencies
        String[][] frequencies = findFrequency(input);

        // Display result
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + " -> " + frequencies[i][1]);
        }
    }
}
