package ArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter array length");
		double[] array = new double[in.nextInt()];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array[i] = in.nextDouble();
		}
		System.out.println(Arrays.toString(array));

		double one = 0;
		double two = 0;
		double three = 0;

		for (int u = 0; u < array.length; u++) {
			if (Math.abs(array[u]) > one) {
				three = two;
				two = one;
				one = array[u];
				continue;
			}
			if (Math.abs(array[u]) > two) {
				three = two;
				two = array[u];
				continue;
			}
			if (Math.abs(array[u]) > three) {
				three = array[u];
				continue;
			}
		}
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);

	}

}
