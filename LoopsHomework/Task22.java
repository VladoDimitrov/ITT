package LoopsHomework;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 1;
		while (count <= 10) {
			num += 1;
			if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
				System.out.println(count + ":" + num);
				count += 1;
			} else {
				continue;
			}
		}
	}

}
