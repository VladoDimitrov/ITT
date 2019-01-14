package LoopsHomework;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int height = in.nextInt();
		for (int row = 1; row <= height; row++) {
			for (int space = 0; space < height - row; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= row; star++) {
				if (star == 1 || row == height) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			for (int star = 1; star < row; star++) {
				if (star == row - 1 || row == height) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}
			}
			System.out.println();
		}
	}

}
