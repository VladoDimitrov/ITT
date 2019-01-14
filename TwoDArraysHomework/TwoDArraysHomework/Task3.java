package TwoDArraysHomework;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array dimensions");
		int[][] array = new int[in.nextInt()][in.nextInt()];
		int sum = 0;
		int count = 0;
		double average = 0;
		for (int row = 0; row < array.length; row++) {
			System.out.println("Enter values for " + (row + 1) + ". row");
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = in.nextInt();
				sum += array[row][col];
				count++;
			}
		}
		average = sum / count;
		System.out.println("Sum " + sum);
		System.out.println("Average" + average);
	}

}
