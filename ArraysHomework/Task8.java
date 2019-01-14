package ArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter array length");
		int[] array = new int[in.nextInt()];
		int longest = 1;
		int num = 0;
		int current = 1;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array[i] = in.nextInt();
		}
		num = array[0];
		for (int u = 1; u < array.length; u++) {
			if (array[u] == array[u - 1]) {
				current += 1;
				if (current > longest) {
					longest = current;
					num = array[u];
				}
			} else {
				current = 1;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.print("The longest chain is ");
		for (int o = 1; o <= longest; o++) {
			System.out.print(num + " ");
		}

	}

}
