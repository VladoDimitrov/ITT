package ArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(array));

		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;

		array[2] += array[3];
		array[3] = Math.abs(array[3] - array[2]);
		array[2] = Math.abs(array[3] - array[2]);

		array[4] *= array[5];
		array[5] = array[4] / array[5];
		array[4] = array[4] / array[5];

		System.out.println(Arrays.toString(array));

	}

}
