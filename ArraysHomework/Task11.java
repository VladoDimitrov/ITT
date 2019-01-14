package ArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(array));
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 5 && array[i] % 5 == 0) {
				System.out.print(array[i] + " ");
				count += 1;
			}
		}

		System.out.println("- " + count + " numbers");
	}

}
