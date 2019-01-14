package TwoDArraysHomework;

import java.util.Arrays;

public class Sudoku {

	public static void main(String[] args) {

		int[][] sudoku = { 	{ 5, 3, 4, 6, 7, 8, 9, 1, 2 }, 
							{ 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
							{ 1, 9, 8, 3, 4, 2, 5, 6, 7 },
							{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
							{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
							{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
							{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
							{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
							{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		boolean isSudoku = true;

		int[] check = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int a = Arrays.stream(check).sum();

		while (isSudoku) {

			// Check squares
			for (int row = 1; row <= sudoku.length - 2; row += 3) {
				for (int col = 1; col <= sudoku[row].length - 2; col += 3) {
					for (int checkR = (row - 1); checkR <= (row + 1); checkR++) {
						for (int checkC = col - 1; checkC <= col + 1; checkC++) {
							for (int ch = 0; ch < 9; ch++) {
								if (sudoku[checkR][checkC] == check[ch]) {
									check[ch] = 0;
								}
							}							
						}
					}
				}
				if (Arrays.stream(check).sum() != 0) {
					isSudoku = false;
				} else {
					check = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
				}
			}

			// Check rows
			for (int rowR = 0; rowR < 9; rowR++) {
				for (int colR = 0; colR < 9; colR++) {
					for (int ch = 0; ch < 9; ch++) {
						if (sudoku[rowR][colR] == check[ch]) {
							check[ch] = 0;
						}
					}
				}
				if (Arrays.stream(check).sum() != 0) {
					isSudoku = false;
				} else {
					check = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
				}
			}

			// Check columns
			for (int colC = 0; colC < 9; colC++) {
				for (int rowC = 0; rowC < 9; rowC++) {
					for (int ch = 0; ch < 9; ch++) {
						if (sudoku[rowC][colC] == check[ch]) {
							check[ch] = 0;
						}
					}

				}
				if (Arrays.stream(check).sum() != 0) {
					isSudoku = false;
				} else {
					check = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
				}
			}
			if (isSudoku) {
				System.out.println("This is a Sudoku");
			} else {
				System.out.println("This is not a Sudoku");
			}
			break;
		}

	}

}
