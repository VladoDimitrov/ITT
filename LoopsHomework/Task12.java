package LoopsHomework;

public class Task12 {

	public static void main(String[] args) {

		int num = 100;
		int dig1 = 0;
		int dig2 = 0;
		int dig3 = 0;
		int temp = num;
		for (int i = num; i < 1000; i++) {
			temp = i;
			dig3 = temp % 10;
			temp = temp / 10;
			dig2 = temp % 10;
			temp = temp / 10;
			dig1 = temp;
			if (dig1 == dig2 || dig1 == dig3 || dig2 == dig3) {
				if (dig1 == dig2) {
					i += 10;
					continue;
				} else {
					continue;

				}
			} else {
				System.out.print(i + ", ");
			}

		}

	}
}
