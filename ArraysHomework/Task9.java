package ArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter array length");
		int[] array = new int[in.nextInt()];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(array));

		// int[] arrayBack = new int[array.length];
		// for (int i = 0; i < array.length; i++) {
		// arrayBack[i] = array[array.length - 1 - i];
		// }
		// System.out.println(Arrays.toString(arrayBack));

		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[(array.length - i - 1)] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
