package ArraysHomework;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array1 length");
		int[] array1 = new int[in.nextInt()];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array1[i] = in.nextInt();
		}
		int[] array2 = new int[array1.length * 2];
		for (int i = 0; i < array2.length; i++) {
			if (i < array1.length) {
				array2[i] = array1[i];
			} else {

				array2[i] = array2[array2.length - i - 1];

			}
			System.out.println(array2[i]);
		}

	}

}
