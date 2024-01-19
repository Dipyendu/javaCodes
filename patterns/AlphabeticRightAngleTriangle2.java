
//Java Program to Print the Square Star Pattern
import java.util.Scanner;

public class AlphabeticRightAngleTriangle2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of rows: ");
			int n = sc.nextInt();
			System.out.println("The Pattern:");
			for (int i = 0; i < n; i++) {
				for (int j = n - (i + 1); j < n; j++) {
					char c = (char) (j + 65);
					System.out.print(c + " ");
				}
				System.out.print("\n");
			}
		}
	}
}

// 65+4 -> i = 0, n = 5, J = 4 -> n = 5
// 65+3, 65+4 -> i = 1, n = 5, j=3 -> n = 5
// 65+2, 65+3, 65+4 -> i = 2, n = 5, j=2 -> n = 5
// 65+1, 65+2, 65+3, 65+4 -> i = 3, n = 5, j=1 -> n = 5
// 65+0, 65+1, 65+2, 65+3, 65+4 -> i = 4, n = 5, j=0 -> n = 5