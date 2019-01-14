package TwoDArraysHomework;

import java.util.Scanner;

public class Evo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter area dimensions");
		int rows = in.nextInt();
		int cols = in.nextInt();
		System.out.println("Enter chance of life popping up (%)");
		double chance = in.nextDouble();
		System.out.println("How many generations?");
		int genMax = in.nextInt();
		in.close();
		String[][] array1 = new String[rows][cols];
		String[][] array2 = new String[rows][cols];
		for (int seedR = 0; seedR < array1.length; seedR++) {
			for (int seedC = 0; seedC < array1[seedR].length; seedC++) {
				double life = Math.random();
				if (life < chance / 100) {
					array1[seedR][seedC] = "@";
					array2[seedR][seedC] = "@";
				} else {
					array1[seedR][seedC] = " ";
					array2[seedR][seedC] = " ";
				}
			}
		}
		for (int gen = 1; gen <= genMax; gen++) {
			System.out.println("Generation " + gen);
			for (int showR = 0; showR < array1.length; showR++) {
				for (int dash = 0; dash <= (cols * 2); dash++) {
					System.out.print("-");
				}
				System.out.println();
				for (int showC = 0; showC < array1[showR].length; showC++) {
					System.out.print("|");
					System.out.print(array1[showR][showC]);
				}
				System.out.println("|");
				if (showR == array1.length - 1) {
					for (int dash = 0; dash <= (cols * 2); dash++) {
						System.out.print("-");
					}
					System.out.println();
				}
			}
			for (int row = 0; row < array1.length; row++) {
				for (int col = 0; col < array1[row].length; col++) {
					if (array1[row][col] == "#") {
						array2[row][col] = " ";
						array1[row][col] = " ";
					}
					if (array1[row][col] == "@") {
						int neigh = 0;
						for (int newR = row - 1; newR <= row + 1; newR++) {
							for (int newC = col - 1; newC <= col + 1; newC++) {
								if (newR == row && newC == col) {
									continue;
								}
								if (newR >= 0 && newR < rows && newC >= 0 && newC < cols && array1[newR][newC] == "@") {
									neigh++;
								}
							}
						}
						if (neigh >= 2 && neigh <= 4) {
							if ((row == 0 || row == rows - 1) && (col == 0 || col == cols - 1)) {
								array1[row][col] = "#";
								continue;
							}
							int spawnR = 0;
							int spawnC = 0;
							boolean spawn = false;
							while (!spawn) {
								if (row + spawnR >= 0 && row + spawnR < rows && col + spawnC >= 0
										&& col + spawnC < cols) {
									if (array1[row + spawnR][col + spawnC] == "#") {
										array1[row + spawnR][col + spawnC] = " ";
										array2[row + spawnR][col + spawnC] = " ";
									}
									if ((spawnR == 0 && spawnC == 0) || (array1[row + spawnR][col + spawnC] != " ")) {
										spawnR = (int) Math.ceil(Math.random() * 3) - 2;
										spawnC = (int) Math.ceil(Math.random() * 3) - 2;
										continue;
									} else {
										array2[row + spawnR][col + spawnC] = "@";
										spawn = true;
										break;
									}
								} else {
									spawnR = (int) Math.ceil(Math.random() * 3) - 2;
									spawnC = (int) Math.ceil(Math.random() * 3) - 2;
									continue;
								}
							}
						} else {
							array2[row][col] = "#";
						}
					}
				}
			}
			for (int nextR = 0; nextR < array1.length; nextR++) {
				for (int nextC = 0; nextC < array1[nextR].length; nextC++) {
					array1[nextR][nextC] = array2[nextR][nextC];
				}
			}
		}
	}
}
