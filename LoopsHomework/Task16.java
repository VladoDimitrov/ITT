package LoopsHomework;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int num1 = in.nextInt();
		int num2 = in.nextInt();

		while (num1 < 10 || num1 > 5555 || num2 < 10 || num2 > 5555) {
			System.out.println("Enter two numbers between 10 and 5555");
			num1 = in.nextInt();
			num2 = in.nextInt();
		}
		int hi = (num1 > num2) ? num1 : num2;
		int lo = (num1 < num2) ? num1 : num2;
		for (int i = hi; i >= lo; i--) {
			if (i % 50 == 0) {
				System.out.println(i);
			}
		}
	}

}
