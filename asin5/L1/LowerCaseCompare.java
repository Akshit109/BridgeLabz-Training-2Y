import java.util.Scanner;

public class LowerCaseCompare {

    // Method to manually convert text to lowercase using charAt()
    public static String manualToLowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if uppercase letter (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32
                result.append((char) (ch + 32));
            } else {
                // Leave unchanged (lowercase letters, digits, symbols, spaces)
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

        // Convert to lowercase manually
        String manualLower = manualToLowerCase(text);

        // Convert using built-in method
        String builtInLower = text.toLowerCase();

        // Compare results
        boolean isSame = compareStrings(manualLower, builtInLower);

        // Display results
        System.out.println("\nManual Lowercase: " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Comparison Result: " + isSame);

        sc.close();
    }
}
