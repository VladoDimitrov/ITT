package LoopsHomework;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		for (int i = 1; i <= num1; i++) {
			for (int u = 1; u <= num2; u++)
				if (i == u) {
					System.out.println(i + "*" + u + "=" + (i * u));
				} else {
					System.out.println(i + "*" + u + "=" + (i * u));

				}
		}
	}

}
