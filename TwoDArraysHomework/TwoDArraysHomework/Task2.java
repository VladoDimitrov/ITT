package TwoDArraysHomework;
import java.util.Arrays;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size");
		int side = in.nextInt();
		int[][] array = new int[side][side];
		for (int row = 0; row < array.length; row++) {
			System.out.println("Enter values for row " + (row + 1));
			for (int col = 0; col < array.length; col++) {
				array[row][col] = in.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(array));
		for (int dia1 = 0; dia1 < array.length; dia1++) {
			System.out.println(array[dia1][dia1]);
		}
		int place = array.length - 1;
		for (int dia2 = 0; dia2 < array.length; dia2++) {			
			System.out.println(array[dia2][place]);
			place--;
		}
		
	}

}
