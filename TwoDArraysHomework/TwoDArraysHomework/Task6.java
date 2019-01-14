package TwoDArraysHomework;

public class Task6 {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// System.out.println("Enter array dimensions");
		// int[][] array = new int[in.nextInt()][in.nextInt()];
		// for (int row = 0; row < array.length; row++) {
		// System.out.println("Enter values for " + (row + 1) + ". row");
		// for (int col = 0; col < array.length; col++) {
		// array[row][col] = in.nextInt();
		//
		// }
		// }
		int[][] array = { { 5, 7, 3, 5, 7, 9 }, { 8, 6, 3, 7, 7, 1 }, { 7, 9, 3, 6, 6, 5 }, { 6, 3, 3, 8, 9, 5 },
				{ 6, 9, 1, 2, 2, 5 }, { 8, 5, 7, 2, 3, 5 } };
		int sum = 0;
		int sumRow = 0;
		for (int row = 1; row < array.length; row += 2) {
			for (int col = 0; col < array[row].length; col++) {
				sumRow += array[row][col];
			}
			System.out.println("Sum of row " + (row + 1) + " - " + sumRow);
			sum += sumRow;
			sumRow = 0;
		}
		System.out.println("Total sum of even rows - " + sum);
	}

}
