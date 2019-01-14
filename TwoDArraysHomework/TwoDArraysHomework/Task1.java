package TwoDArraysHomework;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[][] array = new int[6][5];
		for(int row = 0; row < array.length; row++) {
			System.out.println("Enter values for " + (row + 1) + ". row");
			for(int col = 0; col < array[row].length; col++) {
				array[row][col] = in.nextInt();
			}
		}
		int min = array[0][0];
		int max = 0;
		for(int row = 0; row < array.length; row++) {
			for(int col = 0; col < array[row].length; col++) {
				if(array[row][col] < min) {
					min = array[row][col];
				}
				if(array[row][col] > max) {
					max = array[row][col];
				}
			}
		}
		System.out.println("Min " + min);
		System.out.println("Max " + max);
	}

}
