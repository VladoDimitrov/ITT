package TwoDArraysHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Holidays {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// int[][] holidays = new int[12][];
		// for (int month = 0; month < holidays.length; month++) {
		// System.out.println("How many holidays in month " + (month + 1));
		// holidays[month] = new int[in.nextInt()];
		// System.out.println("Which dates?");
		// for (int days = 0; days < holidays[month].length; days++) {
		// holidays[month][days] = in.nextInt();
		// }
		// }
		int[][] holidays = { { 4, 6, 17, 18, 19 }, { 7, 8, 16, 17, 22 }, { 15, 16, 24, 25 }, { 7, 10, 11 },
				{ 1, 4, 7, 14, 25, 30 }, { 17, 20, 24, 30 }, { 6, 10, 16, 22 }, { 8, 9, 14, 18 }, { 10, 11, 19, 20 },
				{ 6, 8, 11, 17 }, { 15, 16, 20, 21, 26 }, { 1, 5, 8, 19, 23 } };

		int mostDays = 0;
		int[][] mostDate = new int[31][];
		int[][] topMonth = new int[12][];
		int longHoliday = 0;
		int longHolEnd = 0;
		for (int month = 1; month <= holidays.length; month++) {
			if (holidays[month - 1].length >= mostDays) {
				if (holidays[month - 1].length > mostDays) {
					topMonth = new int[12][];
				}
				topMonth[month - 1] = Arrays.copyOf(holidays[month - 1], holidays[month - 1].length);
				mostDays = holidays[month - 1].length;
			}
			for (int day = 1; day <= holidays[month - 1].length; day++) {
				mostDate[month - 1][day - 1]++;
				if (holidays[month - 1][day - 1] + 1 == holidays[month - 1][day]) {
					longHoliday++;
				} else {
//					if ()
					longHolEnd = holidays[month - 1][day - 1];
					longHoliday = 0;
				}
			}

		}

	}

}
