import java.util.Scanner;

public class q3 {

    // Method to return characters in a string without using toCharArray()
    public static char[] manualToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
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

        // Get char arrays
        char[] manualArr = manualToCharArray(text);
        char[] builtInArr = text.toCharArray();

        // Compare arrays
        boolean result = compareCharArrays(manualArr, builtInArr);

        // Display results
        System.out.print("\nManual Char Array: ");
        for (char c : manualArr) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in Char Array: ");
        for (char c : builtInArr) {
            System.out.print(c + " ");
        }

        System.out.println("\nComparison Result: " + result);

        sc.close();
    }
}
