package ArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] array = new int[7];
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(array));
		for (int u = 0; u < array.length; u++) {
			sum += array[u];
		}
		int average = sum / array.length;
		System.out.println("Average value " + average);
		int closest = sum;
		int closestNum = 0;
		for (int o = 0; o < array.length; o++) {
			int temp = Math.abs(average - Math.abs(array[o]));
			if (temp < closest) {
				closest = Math.abs(temp);
				closestNum = array[o];
			}
		}
		System.out.println("Closest value " + closestNum);
	}

}
