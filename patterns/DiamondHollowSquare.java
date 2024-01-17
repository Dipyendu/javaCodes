import java.util.Scanner;

public class DiamondHollowSquare {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the No. of Rows:");
            int n = sc.nextInt();
            for (int i = 0; i < 2 * n; i++) {
                if (i < n) {
                    // Star
                    for (int j = i; j < n; j++) {
                        System.out.print("*" + " ");
                    }

                    // Space
                    for (int j = 0; j < 2 * i; j++) {
                        System.out.print("  ");
                    }

                    // Star
                    for (int j = i; j < n; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                } else {
                    // Star
                    for (int j = 0; j < (i + 1) - n; j++) {
                        System.out.print("*" + " ");
                    }

                    // Space
                    for (int j = 0; j < 2 * (n - ((i + 1) - n)); j++) {
                        System.out.print("  ");
                    }

                    // Star
                    for (int j = 0; j < (i + 1) - n; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}

/*
 * i<n
 * 5, 0, 5 -> i = 0, n = 5
 * 4, 2, 4 -> i = 1, n = 5
 * 3, 4, 3 -> i = 2, n = 5
 * 2, 6, 2 -> i = 3, n = 5
 * 1, 8, 1 -> i = 4, n = 5
 * 
 * i>=n
 * 1, 8, 1 -> i = 5, n = 5
 * 2, 6, 2 -> i = 6, n = 5
 * 3, 4, 3 -> i = 7, n = 5
 * 4, 2, 4 -> i = 8, n = 5
 * 5, 0, 5 -> i = 9, n = 5
 */