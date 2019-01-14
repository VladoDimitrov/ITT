package strings;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String strOne = in.nextLine();// .replaceAll("\\s", "");

		int sumOne = 0;
		for (int index = 0; index < strOne.length(); index++) {
			sumOne += strOne.charAt(index);
		}
		String strTwo = in.nextLine();// .replaceAll("\\s", "");

		int sumTwo = 0;
		for (int index = 0; index < strTwo.length(); index++) {
			sumTwo += strTwo.charAt(index);
		}

		System.out.println(sumOne == sumTwo ? strOne + "\n" + strTwo : (sumOne > sumTwo ? strOne : strTwo));

	}

}
