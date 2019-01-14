package strings;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str = str.replace(" ", "").replace(".", "").replace("-", "").replace("!", "").replace("?", "").replace(",", "")
				.toLowerCase();
		System.out.println(palin(str) ? "Palindrome" : "Not palindrome");

	}

	static boolean palin(String str) {
		if (str.length() <= 1) {
			return true;
		} else {
			if (str.charAt(0) == str.charAt(str.length() - 1)) {
				str = str.substring(1, str.length() - 1);
				return palin(str);
			} else {
				return false;
			}
		}
	}

}
