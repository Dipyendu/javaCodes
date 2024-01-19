
//Java Program to Print the Bilateral Triangle Star Pattern
import java.util.Scanner;

public class InverseBilateralTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();
            System.out.println("The Pattern:");
            for (int i = 0; i < n; i++) {
                // Space
                for (int j = 0; j < i; j++) { // Space = 0 for i = 0 and n = 5; Space = 1 for i = 1 and n=5; Space = 2
                                              // for i = 2 and n=5...
                    System.out.print(" ");
                }

                // Star
                for (int j = 0; j <= 2 * (n - (i + 1)); j++) // j runs 9 time for i = 0 and n=5, j runs 7 times for i =
                                                             // 1 and n=5, j runs 5 times for i = 2and n=5...
                {
                    System.out.print("*");
                }

                // Space
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
        }
    }
}