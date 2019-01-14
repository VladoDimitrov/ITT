package LoopsHomework;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 3;
		for (int i = num; i > 0; i--) {
			if (i > 1) {
				System.out.print(count + ",");
				count += 3;
			} else {
				System.out.println(count);
			}
		}
	}

}
