package strings;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		String strOne = in.nextLine();
		while (strOne.length() > 20 || strOne.length() < 6) {
			strOne = in.nextLine();
		}
		String strTwo = in.nextLine();
		while (strTwo.length() > 20 || strTwo.length() < 6) {
			strTwo = in.nextLine();
		}
		System.out.println(strOne.length() > strTwo.length() ? strOne.length() : strTwo.length());
		String strInvOne = "" + strOne.substring(0, 5) + strTwo.substring(5, strTwo.length());
		String strInvTwo = "" + strTwo.substring(0, 5) + strOne.substring(5, strOne.length());
		System.out.println(strInvOne);
		System.out.println(strInvTwo);

	}

}
