import java.util.Scanner;

public class BowTie {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();
            System.out.println("The Pattern:");
            for (int i = 0; i < (2 * n) - 1; i++) {
                if (i < n) {
                    // Star
                    for (int j = 0; j < i + 1; j++) {
                        System.out.print("* ");
                    }

                    // Space
                    for (int j = 0; j < 2 * (n - (i + 1)); j++) {
                        System.out.print("  ");
                    }

                    // Star
                    for (int j = 0; j < i + 1; j++) {
                        System.out.print("* ");
                    }

                    System.out.print("\n");
                } else {
                    // Star
                    for (int j = (2 * n) - 1; j > i; j--) {
                        System.out.print("* ");
                    }

                    // Space
                    for (int j = 0; j < 2 * ((i + 1) - n); j++) {
                        System.out.print("  ");
                    }

                    // Star
                    for (int j = (2 * n) - 1; j > i; j--) {
                        System.out.print("* ");
                    }

                    System.out.print("\n");
                }
            }
        }
    }
}

/*
 * i<n
 * 1, 8, 1 -> i = 0, n = 5
 * 2, 6, 2 -> i = 1, n = 5
 * 3, 4, 3 -> i = 2, n = 5
 * 4, 2, 4 -> i = 3, n = 5
 * 5, 0, 5 -> i = 4, n = 5
 * 
 * i>=n
 * 4, 2, 4 -> i = 5, n = 5 ->
 * 3, 4, 3 -> i = 6, n = 5
 * 2, 6, 2 -> i = 7, n = 5
 * 1, 8, 1 -> i = 8, n = 5
 */