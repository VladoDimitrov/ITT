package strings;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String strOne = in.nextLine().toLowerCase();
		while (strOne.length() > 20 || strOne.length() < 6 || strOne.contains(" ")) {
			strOne = in.nextLine().toLowerCase();
		}
		String strTwo = in.nextLine().toLowerCase();
		while (strTwo.length() > 20 || strTwo.length() < 6 || strTwo.contains(" ")) {
			strTwo = in.nextLine().toLowerCase();
		}

		System.out.println(
				strOne.length() == strTwo.length() ? "Strings are the same length" : "Strings are different sizes");
		for (int len = 0; len < (strOne.length() > strTwo.length() ? strTwo.length() : strOne.length()); len++) {
			System.out.print(strOne.charAt(len) == strTwo.charAt(len) ? ""
					: (len + 1) + " " + strOne.charAt(len) + "-" + strTwo.charAt(len) + "\n");
		}

	}

}
