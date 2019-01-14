package ArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter array length");
		int[] array = new int[in.nextInt()];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array[i] = in.nextInt();
		}
		int[] arrayNew = new int[array.length];
		for (int i = 0; i < array.length; i++) {

			if (i == 0) {
				arrayNew[i] = array[i + 1];
			}
			if (i > 0 && i < array.length - 1) {
				arrayNew[i] = array[i - 1] + array[i + 1];
			}
			if (i == array.length - 1) {
				arrayNew[i] = array[i - 1];
			}

		}
		System.out.println(Arrays.toString(arrayNew));

	}

}
