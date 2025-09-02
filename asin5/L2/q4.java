package L2;

import java.util.Scanner;

public class q4 {
	// Method to find the length of a String without using length()
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
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) != ' ' && !inWord) {
				wordCount++;
				inWord = true;
			} else if (str.charAt(i) == ' ') {
				inWord = false;
			}
		}
		int[] spaceIndexes = new int[wordCount + 1];
		int idx = 0;
		spaceIndexes[idx++] = -1;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == ' ') {
				spaceIndexes[idx++] = i;
			}
		}
		spaceIndexes[idx] = len;
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

	// Method to create a 2D String array with word and its length
	public static String[][] wordsWithLengths(String[] words) {
		String[][] result = new String[words.length][2];
		for (int i = 0; i < words.length; i++) {
			result[i][0] = words[i];
			result[i][1] = String.valueOf(getLength(words[i]));
		}
		return result;
	}

	// Method to find shortest and longest word lengths and their indexes
	public static int[] findShortestLongest(String[][] wordTable) {
		int minLen = Integer.MAX_VALUE, maxLen = Integer.MIN_VALUE;
		int minIdx = -1, maxIdx = -1;
		for (int i = 0; i < wordTable.length; i++) {
			int len = Integer.parseInt(wordTable[i][1]);
			if (len < minLen) {
				minLen = len;
				minIdx = i;
			}
			if (len > maxLen) {
				maxLen = len;
				maxIdx = i;
			}
		}
		return new int[]{minIdx, maxIdx};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String input = sc.nextLine();

		String[] words = customSplit(input);
		String[][] wordTable = wordsWithLengths(words);

		System.out.println("Word\tLength");
		for (String[] row : wordTable) {
			int length = Integer.parseInt(row[1]);
			System.out.println(row[0] + "\t" + length);
		}

		int[] minMaxIdx = findShortestLongest(wordTable);
		System.out.println("\nShortest word: " + wordTable[minMaxIdx[0]][0] + " (Length: " + wordTable[minMaxIdx[0]][1] + ")");
		System.out.println("Longest word: " + wordTable[minMaxIdx[1]][0] + " (Length: " + wordTable[minMaxIdx[1]][1] + ")");
	}
}
