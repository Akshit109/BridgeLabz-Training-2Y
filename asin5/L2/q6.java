package L2;

import java.util.Scanner;

public class q6 {
	// Method to check if a character is a vowel, consonant, or not a letter
	public static String getCharType(char ch) {
		// Convert to lowercase using ASCII values
		if (ch >= 'A' && ch <= 'Z') {
			ch = (char)(ch + 32);
		}
		if (ch >= 'a' && ch <= 'z') {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				return "Vowel";
			} else {
				return "Consonant";
			}
		} else {
			return "Not a Letter";
		}
	}

	// Method to find vowels and consonants in a string
	public static String[][] findVowelsConsonants(String str) {
		int len = 0;
		try {
			while (true) {
				str.charAt(len);
				len++;
			}
		} catch (IndexOutOfBoundsException e) {}
		String[][] result = new String[len][2];
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			result[i][0] = String.valueOf(ch);
			result[i][1] = getCharType(ch);
		}
		return result;
	}

	// Method to display the 2D array in tabular format
	public static void displayTable(String[][] arr) {
		System.out.println("Char\tType");
		for (String[] row : arr) {
			System.out.println(row[0] + "\t" + row[1]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		String[][] table = findVowelsConsonants(input);
		displayTable(table);
	}
}
