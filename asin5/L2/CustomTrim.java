import java.util.Scanner;

public class CustomTrim {

    // Method to find start and end index (ignoring leading & trailing spaces)
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean customCompare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();

        // Find start and end index
        int[] indexes = findTrimIndexes(text);

        // Get trimmed string using custom method
        String customTrimmed = customSubstring(text, indexes[0], indexes[1]);

        // Get trimmed string using built-in trim()
        String builtInTrimmed = text.trim();

        // Compare both
        boolean isSame = customCompare(customTrimmed, builtInTrimmed);

        // Display results
        System.out.println("Original String: [" + text + "]");
        System.out.println("Custom Trimmed: [" + customTrimmed + "]");
        System.out.println("Built-in Trimmed: [" + builtInTrimmed + "]");
        System.out.println("Are both equal? " + isSame);
    }
}
