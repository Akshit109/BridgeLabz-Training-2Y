import java.util.Scanner;

public class Stringcompare {

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        // If lengths are different, they cannot be equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare character by character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;  // mismatch found
            }
        }
        return true;  // all characters matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using custom method
        boolean manualCompare = compareStrings(str1, str2);

        // Compare using built-in equals()
        boolean builtInCompare = str1.equals(str2);

        // Display results
        System.out.println("\nComparison using charAt() method: " + manualCompare);
        System.out.println("Comparison using equals() method: " + builtInCompare);

        // Check if both results are the same
        if (manualCompare == builtInCompare) {
            System.out.println("✅ Both methods give the same result.");
        } else {
            System.out.println("❌ Results are different.");
        }

        sc.close();
    }
}
