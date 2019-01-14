package LoopsHomework;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int sum = 0;
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		while (num1 <= num2) {
			if ((num1 * num1) % 3 == 0) {
				System.out.println("Skip " + num1 * num1);
			} else {
				System.out.println(num1 * num1);
				sum += (num1 * num1);
			}
			if (sum > 200) {
				break;
			}
			num1 += 1;
		}
	}

}
