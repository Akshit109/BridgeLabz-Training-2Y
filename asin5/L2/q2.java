package L2;

import java.util.Scanner;

public class q2 {
	// Method to find the length of the String without using length()
	public static int getLength(String str) {
		int count = 0;
		try {
			while (true) {
				str.charAt(count);
				count++;
			}
		} catch (IndexOutOfBoundsException e) {
			// End of string
		}
		return count;
	}

	// Method to split the text into words using charAt()
	public static String[] customSplit(String str) {
		int len = getLength(str);
		int wordCount = 0;
		boolean inWord = false;
		// Count words
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) != ' ' && !inWord) {
				wordCount++;
				inWord = true;
			} else if (str.charAt(i) == ' ') {
				inWord = false;
			}
		}
		// Store indexes of spaces
		int[] spaceIndexes = new int[wordCount + 1];
		int idx = 0;
		spaceIndexes[idx++] = -1; // Start before first char
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == ' ') {
				spaceIndexes[idx++] = i;
			}
		}
		spaceIndexes[idx] = len; // End after last char
		// Extract words
		String[] words = new String[wordCount];
		for (int i = 0; i < wordCount; i++) {
			int start = spaceIndexes[i] + 1;
			int end = spaceIndexes[i + 1];
			StringBuilder sb = new StringBuilder();
			for (int j = start; j < end; j++) {
				sb.append(str.charAt(j));
			}
			words[i] = sb.toString();
		}
		return words;
	}

	// Method to compare two String arrays
	public static boolean compareArrays(String[] arr1, String[] arr2) {
		if (arr1.length != arr2.length) return false;
		for (int i = 0; i < arr1.length; i++) {
			if (!arr1[i].equals(arr2[i])) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String input = sc.nextLine();

		String[] customWords = customSplit(input);
		String[] splitWords = input.split(" ");

		System.out.println("Custom split result:");
		for (String word : customWords) {
			System.out.println(word);
		}

		System.out.println("\nBuilt-in split() result:");
		for (String word : splitWords) {
			System.out.println(word);
		}

		boolean areEqual = compareArrays(customWords, splitWords);
		System.out.println("\nAre both split results equal? " + areEqual);
	}
}
