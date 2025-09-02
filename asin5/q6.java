import java.util.Scanner;

public class q6 {

    // Method to generate the Exception (without handling)
    public static void generateException(String text) {
        // Start index > End index => IllegalArgumentException
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle the Exception with try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("⚠️ Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠️ Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // 1. Generate the Exception (will crash if uncommented)
        // generateException(text);

        // 2. Handle the Exception safely
        handleException(text);

        sc.close();
    }
}
