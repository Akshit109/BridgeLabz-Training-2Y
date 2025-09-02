package L2;

import java.util.Random;
import java.util.Scanner;

public class q8 {
	// Method to generate random 2-digit ages for n students
	public static int[] generateAges(int n) {
		int[] ages = new int[n];
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			ages[i] = rand.nextInt(90) + 10; // 2-digit age: 10 to 99
		}
		return ages;
	}

	// Method to check voting eligibility
	public static String[][] canVoteTable(int[] ages) {
		String[][] result = new String[ages.length][2];
		for (int i = 0; i < ages.length; i++) {
			result[i][0] = String.valueOf(ages[i]);
			if (ages[i] < 0) {
				result[i][1] = "false";
			} else if (ages[i] >= 18) {
				result[i][1] = "true";
			} else {
				result[i][1] = "false";
			}
		}
		return result;
	}

	// Method to display the 2D array in tabular format
	public static void displayTable(String[][] arr) {
		System.out.println("Age\tCan Vote");
		for (String[] row : arr) {
			System.out.println(row[0] + "\t" + row[1]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = 10; // Fixed to 10 as per question
		// If you want to allow user input for n, uncomment below:
		// n = sc.nextInt();

		int[] ages = generateAges(n);
		String[][] table = canVoteTable(ages);
		displayTable(table);
	}
}
