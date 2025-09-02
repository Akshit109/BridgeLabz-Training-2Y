import java.util.Scanner;

public class CharFrequencyFinder {

    // Method to find frequency of characters using charAt()
    public static int[][] findFrequency(String text) {
        int[] freq = new int[256];  // ASCII has 256 possible characters

        // Count frequencies
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Store results in a 2D array [uniqueCount][2]
        int[][] result = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;        // store ASCII value
                result[index][1] = freq[i]; // store frequency
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method to get frequencies
        int[][] frequencies = findFrequency(input);

        // Display result
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            char character = (char) frequencies[i][0];
            int count = frequencies[i][1];
            System.out.println(character + " -> " + count);
        }
    }
}
