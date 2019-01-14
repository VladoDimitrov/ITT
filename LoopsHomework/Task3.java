package LoopsHomework;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num = -10; num <= 10; num++) {
			if (num % 2 == 0) {
				continue;
			} else {
				System.out.println(num);
			}
		}
	}

}
