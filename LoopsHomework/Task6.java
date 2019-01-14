package LoopsHomework;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = 0;
		while (num <= 0) {
			System.out.println("Enter a positive number");
			num = in.nextInt();
		}
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println("The result is " + sum);
	}

}
