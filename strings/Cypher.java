package strings;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Cypher {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		char[][] letters = new char[5][5];
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXY";
		char[] beta = alpha.toCharArray();
		int zCol = 0;
		int index = 0;
		for (; index < alpha.length(); index++) {
			int randInd = (int) (Math.random() * alpha.length());
			char temp = beta[index];
			beta[index] = beta[randInd];
			beta[randInd] = temp;
		}
		index = 0;
		for (int row = 0; row < letters.length; row++) {
			for (int col = 0; col < letters[row].length; col++) {
				letters[row][col] = beta[index];
				index++;
			}
			System.out.println(Arrays.toString(letters[row]));
		}
		index = 0;
		String text = in.next().toUpperCase();
		char[][] pairs = new char[(int) Math.ceil(text.length() / 2.0)][2];
		for (int pairInd = 0; pairInd < pairs.length; pairInd++) {
			pairs[pairInd][0] = text.charAt(index);
			if (pairInd == pairs.length - 1 && text.length() % 2 != 0) {
				pairs[pairInd][1] = (char) Math.ceil(text.length() / 2.0);
				break;
			}
			pairs[pairInd][1] = text.charAt(index + 1);
			index += 2;
		}
		index = 0;
		System.out.println(Arrays.deepToString(pairs));
		String newText = "";
		for (int checkOne = 0; checkOne < pairs.length; checkOne++) {
			int rowOne = 0;
			int colOne = 0;
			int rowTwo = 0;
			int colTwo = 0;
			for (int checkTwo = 0; checkTwo < pairs[checkOne].length; checkTwo++) {
				for (int row = 0; row < letters.length; row++) {
					for (int col = 0; col < letters[row].length; col++) {
						if (pairs[checkOne][checkTwo] == letters[row][col]) {
							if (checkTwo == 0) {
								rowOne = row;
								colOne = col;
							} else {
								rowTwo = row;
								colTwo = col;
							}
						}
					}
				}
			}
			if (rowOne == rowTwo) {
				colOne++;
				colTwo++;
				if (colOne > 4) {
					colOne -= 5;
				}
				if (colTwo > 4) {
					colTwo -= 5;
				}
				newText += letters[rowOne][colOne];
				newText += letters[rowTwo][colTwo];
			} else {
				if (colOne == colTwo) {
					rowOne++;
					rowTwo++;
					if (rowOne > 4) {
						rowOne -= 5;
					}
					if (rowTwo > 4) {
						rowTwo -= 5;
					}
					newText += letters[rowOne][colOne];
					newText += letters[rowTwo][colTwo];
				} else {
					int colTemp = colOne;
					colOne = colTwo;
					colTwo = colTemp;
					newText += letters[rowOne][colOne];
					newText += letters[rowTwo][colTwo];
				}
			}
		}
		System.out.println(text.length() % 2 == 0 ? newText : newText.substring(0, newText.length() - 1));
		String revText = "";
		char[][] newPairs = new char[(int) Math.ceil(newText.length() / 2.0)][2];
		for (int pairInd = 0; pairInd < newPairs.length; pairInd++) {
			newPairs[pairInd][0] = newText.charAt(index);
			if (pairInd == newPairs.length - 1 && newText.length() % 2 != 0) {
				pairs[pairInd][1] = (char) Math.ceil(text.length() / 2.0);
				break;
			}
			newPairs[pairInd][1] = newText.charAt(index + 1);
			index += 2;
		}
		index = 0;
		System.out.println(Arrays.deepToString(newPairs));
		for (int checkOne = 0; checkOne < newPairs.length; checkOne++) {
			int rowOne = 0;
			int colOne = 0;
			int rowTwo = 0;
			int colTwo = 0;
			for (int checkTwo = 0; checkTwo < newPairs[checkOne].length; checkTwo++) {
				for (int row = 0; row < letters.length; row++) {
					for (int col = 0; col < letters[row].length; col++) {
						if (newPairs[checkOne][checkTwo] == letters[row][col]) {
							if (checkTwo == 0) {
								rowOne = row;
								colOne = col;
							} else {
								rowTwo = row;
								colTwo = col;
							}
						}
					}
				}
			}
			if (rowOne == rowTwo) {
				colOne--;
				colTwo--;
				if (colOne < 0) {
					colOne += 5;
				}
				if (colTwo < 0) {
					colTwo += 5;
				}
				revText += letters[rowOne][colOne];
				revText += letters[rowTwo][colTwo];
			} else {
				if (colOne == colTwo) {
					rowOne--;
					rowTwo--;
					if (rowOne < 0) {
						rowOne += 5;
					}
					if (rowTwo < 0) {
						rowTwo += 5;
					}
					revText += letters[rowOne][colOne];
					revText += letters[rowTwo][colTwo];
				} else {
					int colTemp = colOne;
					colOne = colTwo;
					colTwo = colTemp;
					revText += letters[rowOne][colOne];
					revText += letters[rowTwo][colTwo];
				}
			}
		}
		System.out.println(text.length() % 2 == 0 ? revText : revText.substring(0, revText.length() - 1));
	}
}
