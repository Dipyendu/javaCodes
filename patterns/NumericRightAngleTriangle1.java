
//Java Program to Print the Square Star Pattern
import java.util.Scanner;

public class NumericRightAngleTriangle1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of rows: ");
			int n = sc.nextInt();
			System.out.println("The Pattern:");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print((j + 1) + " ");
				}
				System.out.print("\n");
			}
		}
	}
}