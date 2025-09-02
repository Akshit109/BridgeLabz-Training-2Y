package L3;

import java.util.Scanner;

public class q3 {
	// Method to find the first non-repeating character in a string
	public static char firstNonRepeatingChar(String str) {
		int[] freq = new int[256]; // ASCII character frequency
		int len = 0;
		try {
			while (true) {
				str.charAt(len);
				len++;
			}
		} catch (IndexOutOfBoundsException e) {}
		// Count frequency
		for (int i = 0; i < len; i++) {
			freq[str.charAt(i)]++;
		}
		// Find first non-repeating
		for (int i = 0; i < len; i++) {
			if (freq[str.charAt(i)] == 1) {
				return str.charAt(i);
			}
		}
		return '\0'; // If no non-repeating character found
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		char result = firstNonRepeatingChar(input);
		if (result != '\0') {
			System.out.println("First non-repeating character: " + result);
		} else {
			System.out.println("No non-repeating character found.");
		}
	}
}
