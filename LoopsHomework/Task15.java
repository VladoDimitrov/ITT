package LoopsHomework;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int sum = 0;
		int i = 0;
		do {
			sum += i;
			i++;
		} while (i <= num);
		System.out.println(sum);
	}

}
