package LoopsHomework;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int side = in.nextInt();
		char fill = in.next().charAt(0);

		for (int row = 1; row <= side; row++) {
			if (row == 1 || row == side) {
				for (int place = 1; place <= side; place++) {
					System.out.print("*");
				}
				System.out.println(" ");
			} else {
				for (int place = 1; place <= side; place++) {
					if (place == 1 || place == side) {
						System.out.print("*");
					} else {
						System.out.print(fill);
					}
				}
				System.out.println(" ");
			}

		}
	}

}
