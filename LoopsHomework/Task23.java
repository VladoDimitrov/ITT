package LoopsHomework;

public class Task23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		while (num <= 9) {
			for (int i = 1; i <= 9; i++) {
				if (num > i) {
					continue;
				} else {
					System.out.print(num + "*" + i + "; ");
				}
			}
			System.out.println();
			num += 1;
		}
	}

}
