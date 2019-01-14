package LoopsHomework;

public class Task20 {

	public static void main(String[] args) {

		for (int row = 1; row <= 10; row++) {
			for (int place = row; place < 10; place++) {
				System.out.print(place);
			}
			System.out.print("0");
			for (int place = 1; place < row; place++) {
				System.out.print(place);
			}
			System.out.println();
		}

	}

}
