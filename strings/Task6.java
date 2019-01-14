package strings;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = in.nextLine().toLowerCase();
		String str2 = new String();
		for (int index = 0; index < str.length(); index++) {
			if (index == 0 || str.charAt(index - 1) == ' ') {
				str2 += Character.toString(str.charAt(index)).toUpperCase();
			} else {
				str2 += Character.toString(str.charAt(index));
			}
		}
		System.out.println(str2);
	}

}
