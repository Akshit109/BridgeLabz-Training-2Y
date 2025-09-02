import java.util.Scanner;

public class SubstringCompare {

    // Method to create a substring manually using charAt()
    public static String manualSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < text.length(); i++) {
            result += text.charAt(i);
        }
        return result;
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

        // User input
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Manual substring using charAt()
        String manualSub = manualSubstring(text, start, end);

        // Built-in substring
        String builtInSub = "";
        if (start >= 0 && end <= text.length() && start < end) {
            builtInSub = text.substring(start, end);
        } else {
            System.out.println("⚠️ Invalid indices for substring!");
            sc.close();
            return;
        }

        // Compare substrings
        boolean comparisonResult = compareStrings(manualSub, builtInSub);

        // Display results
        System.out.println("\nManual Substring (charAt): " + manualSub);
        System.out.println("Built-in Substring (substring()): " + builtInSub);
        System.out.println("Comparison Result: " + comparisonResult);

        sc.close();
    }
}
