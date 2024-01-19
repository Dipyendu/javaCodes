
//Java Program to Print the Bilateral Triangle Star Pattern
import java.util.Scanner;

public class BilateralTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();
            System.out.println("The Pattern:");
            for (int i = 0; i < n; i++) {
                // Space
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }

                // Star
                for (int j = 0; j <= 2 * i; j++) // j runs 1 time for i = 0, j runs 3 times for i = 1, j runs 5 times
                                                 // for i = 2...
                {
                    System.out.print("*");
                }

                // Space
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
        }
    }
}