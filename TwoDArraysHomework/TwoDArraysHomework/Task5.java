package TwoDArraysHomework;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// System.out.println("Enter array dimensions");
		// int[][] array = new int[in.nextInt()][in.nextInt()];
		// for (int row = 0; row < array.length; row++) {
		// System.out.println("Enter values for " + (row + 1) + ". row");
		// for (int col = 0; col < array.length; col++) {
		// array[row][col] = in.nextInt();
		//
		// }
		// }

		int[][] array = { { 5, 12, 76, 3 }, { 7, 45, 26, 16 }, { 87, 51, 3, 18 }, { 9, 11, 56, 27 } };
		int maxRow = 0;
		int maxCol = 0;
		for (int row = 0; row < array.length; row++) {
			int sumRow = 0;
			int sumCol = 0;
			for (int col = 0; col < array.length; col++) {
				sumRow += array[row][col];
				sumCol += array[col][row];
			}
			System.out.println("Sum of Row " + (row + 1) + " - " + sumRow);
			System.out.println("Sum of Column " + (row + 1) + " - " + sumCol);
			if (sumRow > maxRow) {
				maxRow = sumRow;
			}
			if (sumCol > maxCol) {
				maxCol = sumCol;
			}
		}
		System.out.println("Max Sum of Rows " + maxRow);
		System.out.println("Max Sum of Columns " + maxCol);
		if (maxCol > maxRow) {
			System.out.println("Max Sum of Columns is bigger than Max Sum of Rows");
		}else {
			if (maxCol < maxRow) {
				System.out.println("Max Sum of Rows is bigger than Max Sum of Columns");
			}else {
				System.out.println("Max Sum of Columns is equal to Max Sum of Rows");
			}
		}
	}

}
