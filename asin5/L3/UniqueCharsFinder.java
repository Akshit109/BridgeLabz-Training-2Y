import java.util.Scanner;

public class UniqueCharsFinder {

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // when index exceeds -> exception
                count++;
            }
        } catch (Exception e) {
            // End of string reached
        }
        return count;
    }

    // Method to find unique characters
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);

        // Temporary array to hold unique characters
        char[] tempArray = new char[length];
        int uniqueCount = 0;

        // Outer loop for each character
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if already appeared
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to temp array
            if (isUnique) {
                tempArray[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Copy unique characters into new array of correct size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempArray[i];
        }

        return uniqueChars;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method to get unique characters
        char[] unique = findUniqueCharacters(input);

        // Display result
        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
    }
}
