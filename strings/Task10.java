package strings;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String str = in.next();
		String str2 = "";
		for (int index = 0; index < str.length(); index++) {
			char cha = (char) (str.charAt(index) + 5);
			str2 += cha;
		}
		System.out.println(str2);
	}

}
