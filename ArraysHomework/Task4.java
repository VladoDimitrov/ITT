package ArraysHomework;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array length");
		int[] array = new int[in.nextInt()];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array[i] = in.nextInt();
		}
		boolean mirror = false;

		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] == array[array.length - i - 1]) {
				mirror = true;
				continue;
			} else {
				mirror = false;
				break;
			}
		}
		if (mirror) {
			System.out.println("Mirror");
		} else {
			System.out.println("Not mirror");
		}
	}

}
