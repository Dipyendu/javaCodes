
//Java Program to Print the Diamond Star Pattern
import java.util.Scanner;

public class RightRotatedBilateralTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();
            System.out.println("The Pattern:");
            for (int i = 0; i < (2 * n) - 1; i++) {

                // Star for i < n
                if (i < n) {

                    // Star
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }

                // Star for i >= n
                else if (i >= n) {

                    // Star
                    for (int j = (2 * n) - 1; j > i; j--) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            }
        }
    }
}