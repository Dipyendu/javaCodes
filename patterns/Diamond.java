
//Java Program to Print the Diamond Star Pattern
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();
            System.out.println("The Pattern:");
            for (int i = 0; i < 2 * n; i++) {

                // Star for i < n
                if (i < n) {

                    // Space
                    for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" ");
                    }

                    // Star
                    for (int j = 0; j <= 2 * i; j++) {
                        System.out.print("*");
                    }

                    // Space
                    for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                }

                // Star for i >= n
                else if (i >= n) {

                    // Space
                    for (int j = 0; j < (i - n); j++) { // Space = 0 for i = 5 and n = 5; Space = 1 for i = 6 and n=5;
                                                        // Space = 2 for i = 7 and n=5...
                        System.out.print(" ");
                    }

                    // Star
                    for (int j = 0; j < ((2 * n) - 1) - 2 * (i - n); j++) // j runs 9 time for i = 5 and n=5, j runs 7
                                                                          // times for i = 6 and n=5, j runs 5 times for
                                                                          // i = 7 and n=5...
                    {
                        System.out.print("*");
                    }

                    // Space
                    for (int j = 0; j < (i - n); j++) {
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                }
            }
        }
    }
}

// 0,9,0 -> i=5, n=5
// 1,7,1 -> i=6, n=5
// 2,5,2 -> i=7, n=5
// 3,3,3 -> i=8, n=5
// 4,1,4 -> i=9, n=5