import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate the Exception (without handling)
    public static void generateException(String text) {
        // Try to parse text that may not be a number
        int num = Integer.parseInt(text); 
        System.out.println("Converted number: " + num);
    }

    // Method to handle the Exception with try-catch
    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text); 
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠️ Caught RuntimeException: " + e.getMessage());
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
