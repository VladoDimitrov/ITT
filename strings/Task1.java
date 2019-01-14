package strings;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String strOne = in.nextLine();
		while (strOne.length() > 40) {
			strOne = in.nextLine();
		}
		String strTwo = in.nextLine();
		while (strTwo.length() > 40) {
			strTwo = in.nextLine();
		}
		System.out.println(strOne.toLowerCase());
		System.out.println(strOne.toUpperCase());
		System.out.println(strTwo.toLowerCase());
		System.out.println(strTwo.toUpperCase());

	}

}
