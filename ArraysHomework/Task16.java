package ArraysHomework;

import java.util.Arrays;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.*;

public class Task16 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		df.setRoundingMode(RoundingMode.FLOOR);
		double[] array = new double[10];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter the " + (i + 1) + ". number");
			array[i] = in.nextDouble();
		}
		System.out.println(Arrays.toString(array));

		for (int u = 0; u < array.length; u++) {
			double low = u * u + 41.25;
			double hi = (u + 1) * array[u];
			if (array[u] < -0.231) {
				array[u] = new Double(df.format(low));
			} else {
				array[u] = new Double(df.format(hi));
			}
		}
		System.out.println(Arrays.toString(array));

		double sum = 0;
		int count = 0;
		for (int o = 0; o < array.length; o++) {
			if (array[o] != 0) {
				sum += array[o];
				count += 1;
			}
		}
		System.out.println("The average excluding 0 is " + df.format((sum / count)));
	}
	// -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
}
