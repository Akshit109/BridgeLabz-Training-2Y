import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate the Exception (without handling)
    public static void generateException(String[] names) {
        // Access index beyond the length of array
        System.out.println("Accessing index " + names.length + ": " + names[names.length]);
        // This will throw ArrayIndexOutOfBoundsException
    }

    // Method to handle the Exception with try-catch
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing index " + names.length + ": " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠️ Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠️ Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array input
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        // 1. Generate the Exception (will crash if uncommented)
        // generateException(names);

        // 2. Handle the Exception safely
        handleException(names);

        sc.close();
    }
}
