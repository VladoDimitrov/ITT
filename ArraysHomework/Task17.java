package ArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter array length");
		int[] array = new int[in.nextInt()];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(array));
		boolean zigZag = true;
		for (int i = 0; i < array.length; i += 2) {
			if (i == 0 || i == array.length - 1) {
				continue;
			}else {
				if (i % 2 != 0 && array[i] > array[i - 1] && array[i] > array[i + 1]) {
					zigZag = true;
					continue;
				} else {
					if (i % 2 == 0 && array[i] < array[i - 1] && array[i] < array[i + 1]) {
						zigZag = true;
						continue;
					} else {
						zigZag = false;
						break;
					}
				}
			}
			
		}
		if (zigZag) {
			System.out.println("Zig-Zag");
		} else {
			System.out.println("Not Zig-Zag");
		}

	}

}
