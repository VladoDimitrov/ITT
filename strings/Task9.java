package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = in.next();
		str = str.replaceAll("[^-?0-9]+", " ");
		String[] nums = new String[str.length() / 2];
		Arrays.fill(nums, "");
		int numRow = 0;
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
				if (index > 0 && str.charAt(index - 1) == '-') {
					nums[numRow] += "-";
					nums[numRow] += str.charAt(index);
				} else {
					nums[numRow] += str.charAt(index);
					if (index == str.length() - 1 || str.charAt(index + 1) < '0' || str.charAt(index + 1) > '9') {
						sum += Integer.parseInt(nums[numRow]);
						numRow++;
						continue;
					}
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(sum);
	}
}
