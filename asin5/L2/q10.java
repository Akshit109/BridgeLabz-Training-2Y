package L2;

import java.util.Random;
import java.util.Scanner;

public class q10 {
	// Method to generate random 2-digit scores for PCM for n students
	public static int[][] generateScores(int n) {
		int[][] scores = new int[n][3];
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				scores[i][j] = rand.nextInt(90) + 10; // 2-digit score: 10 to 99
			}
		}
		return scores;
	}

	// Method to calculate total, average, percentage for each student
	public static double[][] calculateStats(int[][] scores) {
		int n = scores.length;
		double[][] stats = new double[n][3]; // total, average, percentage
		for (int i = 0; i < n; i++) {
			int total = scores[i][0] + scores[i][1] + scores[i][2];
			double average = Math.round((total / 3.0) * 100) / 100.0;
			double percentage = Math.round((total / 300.0 * 100) * 100) / 100.0;
			stats[i][0] = total;
			stats[i][1] = average;
			stats[i][2] = percentage;
		}
		return stats;
	}

	// Method to calculate grade based on percentage
	public static String[] calculateGrades(double[][] stats) {
		int n = stats.length;
		String[] grades = new String[n];
		for (int i = 0; i < n; i++) {
			double perc = stats[i][2];
			if (perc >= 80) grades[i] = "A";
			else if (perc >= 70) grades[i] = "B";
			else if (perc >= 60) grades[i] = "C";
			else if (perc >= 50) grades[i] = "D";
			else if (perc >= 40) grades[i] = "E";
			else grades[i] = "R";
		}
		return grades;
	}

	// Method to display scorecard in tabular format
	public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
		System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2]
				+ "\t" + (int)stats[i][0] + "\t" + String.format("%.2f", stats[i][1]) + "\t" + String.format("%.2f", stats[i][2])
				+ "\t" + grades[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();

		int[][] scores = generateScores(n);
		double[][] stats = calculateStats(scores);
		String[] grades = calculateGrades(stats);
		displayScorecard(scores, stats, grades);
	}
}
