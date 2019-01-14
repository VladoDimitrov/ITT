package ArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter array length");
		double[] array = new double[in.nextInt()];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array[i] = in.nextDouble();
		}
		System.out.println(Arrays.toString(array));
		for (int u = 0; u < array.length; u++) {
			if (array[u] > -3 && array[u] < 3) {
				System.out.println(array[u]);
			}
		}
	}

}
