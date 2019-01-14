package ArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int check = num;
		int dig = 0;
		while (check != 0) {
			check /= 2;
			dig += 1;
		}
		check = num;
		int rem = 0;
		int[] array = new int[dig];
		for (int i = 0; i < array.length; i++) {
			rem = check % 2;
			array[array.length - i - 1] = rem;
			check /= 2;
		}
		System.out.println(num);
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Arrays.toString(array));
	}

}
