package L3;

import java.util.Scanner;

public class Q7 {
	// Logic 1: Compare start and end indexes
	public static boolean isPalindromeIterative(String str) {
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	// Logic 2: Recursive method
	public static boolean isPalindromeRecursive(String str, int start, int end) {
		if (start >= end) return true;
		if (str.charAt(start) != str.charAt(end)) return false;
		return isPalindromeRecursive(str, start + 1, end - 1);
	}

	// Logic 3: Using character arrays and reversal
	public static boolean isPalindromeArray(String str) {
		char[] original = str.toCharArray();
		char[] reversed = reverseString(str);
		for (int i = 0; i < original.length; i++) {
			if (original[i] != reversed[i]) return false;
		}
		return true;
	}

	// Method to reverse a string using charAt()
	public static char[] reverseString(String str) {
		int len = str.length();
		char[] rev = new char[len];
		for (int i = 0; i < len; i++) {
			rev[i] = str.charAt(len - 1 - i);
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text: ");
		String input = sc.nextLine();

		boolean result1 = isPalindromeIterative(input);
		boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
		boolean result3 = isPalindromeArray(input);

		System.out.println("Palindrome check (Iterative): " + result1);
		System.out.println("Palindrome check (Recursive): " + result2);
		System.out.println("Palindrome check (Array): " + result3);
	}
}
