
//Java Program to Print the Square Star Pattern
import java.util.Scanner;

public class NumericRectangle {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of rows: ");
			int n = sc.nextInt();
			System.out.println("The Pattern:");
			for (int i = 0; i < n; i++) {
				// Number
				for (int j = 0; j <= i; j++) {
					System.out.print((j + 1) + " ");
				}

				// Space
				for (int j = 0; j < 4 * (n - (i + 1)); j++) {
					System.out.print(" ");
				}

				// Number
				for (int j = i; j >= 0; j--) {
					System.out.print((j + 1) + " ");
				}
				System.out.println();
			}
		}
	}
}

// 8 -> i = 0, n = 3
// 4 -> i = 1, n = 3
// 0 -> i = 2, n = 3