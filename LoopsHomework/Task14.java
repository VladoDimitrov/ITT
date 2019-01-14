package LoopsHomework;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = 0;
		while (num < 10 || num > 200) {
			System.out.println("Enter a number between 10 and 200");
			num = in.nextInt();
		}
		for (int i = num - 1; i > 0; i--) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
	}

}
