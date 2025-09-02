import java.util.Scanner;

public class q5 {

    // Method to generate the Exception (without handling)
    public static void generateException(String text) {
        // Access index beyond length of the string
        System.out.println("Character at index " + text.length() + " is: " + text.charAt(text.length()));
        // This will throw StringIndexOutOfBoundsException
    }

    // Method to handle the Exception with try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Character at index " + text.length() + " is: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("⚠️ Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // 1. Generate the Exception (this will crash if uncommented)
        // generateException(text);

        // 2. Handle the Exception safely
        handleException(text);

        sc.close();
    }
}
