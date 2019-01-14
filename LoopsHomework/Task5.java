
package LoopsHomework;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = in.nextInt();
		System.out.println("Enter second number");
		int num2 = in.nextInt();
		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.println(i);
			}
		} else {
			if (num2 > num1) {
				for (int i = num1; i <= num2; i++) {
					System.out.println(i);
				}
			} else {
				System.out.println(num1);
			}
		}
	}

}
