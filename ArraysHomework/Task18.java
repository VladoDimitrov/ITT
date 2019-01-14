package ArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter array length");
		int[] array1 = new int[in.nextInt()];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array1[i] = in.nextInt();
		}
		int[] array2 = new int[array1.length];
		System.out.println("Second array");
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array2[i] = in.nextInt();
		}
		int[] array3 = new int[array2.length];
		for (int i = 0; i < array3.length; i++) {
			array3[i] = (array1[i] > array2[i]) ? array1[i] : array2[i];
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));

	}

}
