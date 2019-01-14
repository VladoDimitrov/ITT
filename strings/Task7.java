package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] strNew = str.split(" ");
		int longest = 0;
		for (String strTest : strNew) {
			if (strTest.length() > longest) {
				longest = strTest.length();

			}
		}
		System.out.println(
				"The string has " + strNew.length + " words and the longest word has " + longest + " letters.");
	}

}
