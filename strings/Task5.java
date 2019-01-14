package strings;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String strOne = in.next();
		String strTwo = in.next();
		boolean match = false;
		int matchIndOne = 0;
		int matchIndTwo = 0;
		do {

			for (int index2 = 0; index2 < strTwo.length(); index2++) {
				for (int index1 = 0; index1 < strOne.length(); index1++) {
					if (strTwo.charAt(index2) == strOne.charAt(index1)) {
						match = true;
						matchIndOne = index1;
						matchIndTwo = index2;
						break;
					}
				}
				if (match) {
					break;
				}
			}

			if (!match) {
				break;
			}

		} while (match == false);

		if (match) {
			String space = new String();
			for (int spaces = 0; spaces < matchIndOne; spaces++) {
				space += " ";
			}

			for (int index = 0; index < strTwo.length(); index++) {
				System.out.println(
						index == matchIndTwo ? strOne : (space.concat(Character.toString(strTwo.charAt(index)))));
			}
		} else {
			System.out.println("No matching letters");
		}

	}

}
