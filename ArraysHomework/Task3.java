package ArraysHomework;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] row = new int[10];
		for (int i = 0; i <= 9; i++) {
			if (i == 0 || i == 1) {
				row[i] = num;
			} else {
				row[i] = row[i - 1] + row[i - 2];
			}
			System.out.println(row[i]);
		}

	}

}
