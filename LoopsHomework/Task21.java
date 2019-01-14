package LoopsHomework;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		for (int card = num; card <= 52; card++) {
			int color = card % 4;
			String value = "";
			if (card <= 4) {
				value = "2";
			}
			if (card > 4 && card <= 8) {
				value = "3";
			}
			if (card > 8 && card <= 12) {
				value = "4";
			}
			if (card > 12 && card <= 16) {
				value = "5";
			}
			if (card > 16 && card <= 20) {
				value = "6";
			}
			if (card > 20 && card <= 24) {
				value = "7";
			}
			if (card > 24 && card <= 28) {
				value = "8";
			}
			if (card > 28 && card <= 32) {
				value = "9";
			}
			if (card > 32 && card <= 36) {
				value = "10";
			}
			if (card > 36 && card <= 40) {
				value = "Jack";
			}
			if (card > 40 && card <= 44) {
				value = "Queen";
			}
			if (card > 44 && card <= 48) {
				value = "King";
			}
			if (card > 48) {
				value = "Ace";
			}
			System.out.print(value);
			switch (color) {
			case 1:
				System.out.println(" of Spades");
				break;
			case 2:
				System.out.println(" of Diamonds");
				break;
			case 3:
				System.out.println(" of Hearts");
				break;
			case 0:
				System.out.println(" of Clubs");
				break;
			}

		}
		

	}

}
