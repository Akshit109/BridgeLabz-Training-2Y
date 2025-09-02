import java.util.Scanner;

public class UpperCaseCompare {

    // Method to manually convert text to uppercase using charAt()
    public static String manualToUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if lowercase letter (a-z)
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32
                result.append((char) (ch - 32));
            } else {
                // Leave unchanged (uppercase letters, digits, symbols, spaces)
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take full text input
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Convert to uppercase manually
        String manualUpper = manualToUpperCase(text);

        // Convert using built-in method
        String builtInUpper = text.toUpperCase();

        // Compare results
        boolean isSame = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("\nManual Uppercase: " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Comparison Result: " + isSame);

        sc.close();
    }
}
