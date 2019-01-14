package LoopsHomework;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long num = in.nextLong();
		long rem = 0;
		long sum = 0;
		long temp = num;
		do {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		} while (num > 0);
		if (temp == sum) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
}
