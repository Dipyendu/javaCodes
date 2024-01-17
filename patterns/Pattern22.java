
//Java Program to Print the Square Star Pattern
import java.util.Scanner;
import static java.lang.Math.min;

public class Pattern22 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of rows: ");
			int n = sc.nextInt();
			System.out.println("The Pattern:");
			for (int i = 0; i < (2 * n) - 1; i++) {
				for (int j = 0; j < (2 * n) - 1; j++) {
					int top = i;
					int left = j;
					int right = (2 * n - 2) - j;
					int bottom = (2 * n - 2) - i;
					System.out.print(n - min(min(top, bottom), min(left, right)));
				}
				System.out.print("\n");
			}
		}
	}
}
