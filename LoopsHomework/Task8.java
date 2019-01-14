package LoopsHomework;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int dig = num - 1;
		for (int i = 1; i <= num; i++) {
			for (int u = 1; u <= num; u += 1) {
				System.out.print(dig);

			}
			System.out.println();
			dig += 2;
		}
	}

}
