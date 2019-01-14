package ArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter array length");
		int[] array = new int[in.nextInt()];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array[i] = in.nextInt();
		}
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				if (min == 0) {
					min = array[i];
				}
				if (array[i] < min) {
					min = array[i];
				}
			}
		}
		System.out.println(Arrays.toString(array));
		if (min != 0) {
			System.out.println("The lowest number divisible by 3 is " + min);
		} else {
			System.out.println("There are no numbers in the array, that are divisible by 3");
		}
	}

}
