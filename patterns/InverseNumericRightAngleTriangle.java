
//Java Program to Print the Right Angle Triangle Star Pattern
import java.util.Scanner;

public class InverseNumericRightAngleTriangle {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of rows: ");
			int n = sc.nextInt();
			System.out.println("The Pattern:");
			for (int i = 0; i < n; i++) {
				for (int j = 1; j <= n - i; j++) {
					System.out.print(j + " ");
				}
				System.out.print("\n");
			}
		}
	}
}