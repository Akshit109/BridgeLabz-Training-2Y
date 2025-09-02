import java.util.Scanner;

public class StringLengthDemo {

    // Method to find length of string without using length()
    public static int manualLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception when index is out of range
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // When exception occurs, count has the length
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Find length manually
        int manualLen = manualLength(text);

        // Find length using built-in method
        int builtInLen = text.length();

        // Display results
        System.out.println("\nManual Length (charAt + exception): " + manualLen);
        System.out.println("Built-in Length (length()): " + builtInLen);

        sc.close();
    }
}
