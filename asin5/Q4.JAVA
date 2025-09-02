public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;  // String is null
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException with try-catch
    public static void handleException() {
        String text = null;  // String is null
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("⚠️ Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // 1. Generate the Exception (this will crash without handling)
        // Uncomment below line to see the exception
        // generateException();

        // 2. Handle the Exception safely
        handleException();
    }
}
