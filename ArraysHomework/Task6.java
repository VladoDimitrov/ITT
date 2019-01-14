package ArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter array1 length");
		int[] array1 = new int[in.nextInt()];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array1[i] = in.nextInt();
		}
		System.out.println("Please enter array2 length");
		int[] array2 = new int[in.nextInt()];
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array2[i] = in.nextInt();
		}
		boolean nums = false;
		int lowestLength = (array1.length > array2.length) ? array2.length : array1.length;
		boolean length = (array1.length == array2.length) ? true : false;
		for (int i = 0; i < lowestLength; i++) {
			if (array1[i] == array2[i]) {
				nums = true;
				continue;
			} else {
				nums = false;
				break;
			}

		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		if (nums) {
			System.out.println("Same values");
		} else {
			System.out.println("Different values");
		}
		if (length) {
			System.out.println("Same length");
		} else {
			System.out.println("Different length");
		}
	}

}
