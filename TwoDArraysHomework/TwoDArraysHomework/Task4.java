package TwoDArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// System.out.println("Enter array dimensions");
		// int[][] array1 = new int[in.nextInt()][in.nextInt()];
		// for (int row = 0; row < array1.length; row++) {
		// System.out.println("Enter values for " + (row + 1) + ". row");
		// for (int col = 0; col < array1.length; col++) {
		// array1[row][col] = in.nextInt();
		//
		// }
		// }
		int[][] array1 = { { 5, 7, 3, 5, 7, 9, 4 }, { 8, 6, 3, 7, 7, 1, 2 }, { 7, 9, 3, 6, 6, 5, 8 }, { 6, 3, 3, 8, 9, 5, 1 }, { 6, 9, 1, 2, 2, 5, 1 } };
		int[][] array2 = new int[array1[0].length][array1.length];
		
		for(int row = 0; row < array2.length; row++) {
			for(int col = 0; col < array2[0].length; col++) {
				array2[row][col] = array1[(array1.length - 1) - col][row];
			}
		}
		System.out.println(Arrays.deepToString(array1));
		System.out.println(Arrays.deepToString(array2));

	}

}
