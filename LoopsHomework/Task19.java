package LoopsHomework;

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		while (num < 10 || num > 99) {
			num = in.nextInt();
		}
		do {
			if (num % 2 == 0) {
				num *= 0.5;
			} else {
				num = num * 3 + 1;
			}
			System.out.println(num);
		} while (num > 1);

	}

}
