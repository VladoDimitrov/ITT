package LoopsHomework;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		while (num < 2 || num > 27) {
			System.out.println("Enter a number between 2 and 27");
			num = in.nextInt();
		}
		int dig1 = 0;
		int dig2 = 0;
		int dig3 = 0;
		int temp = 0;
		for (int i = 100; i < 1000; i++) {
			temp = i;
			dig3 = temp % 10;
			temp = temp / 10;
			dig2 = temp % 10;
			temp = temp / 10;
			dig1 = temp;
			if (dig1 + dig2 + dig3 == num) {
				System.out.println(i);
			}
		}
	}

}
