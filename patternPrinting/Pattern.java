package patternPrinting;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter no of rows: ");
            int n = input.nextInt();
            pattern31(n);
        }
    }

    public static void pattern1(int n) {
        System.out.println("Pattern 1:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        System.out.println("Pattern 2:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        System.out.println("Pattern 3:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        System.out.println("Pattern 2:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        System.out.println("Pattern 5:");

        for (int i = 0; i < (2 * n) - 1; i++) {
            if (i < n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print('*');
                }
            } else {
                for (int j = 0; j < (2 * n) - i - 1; j++) {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        System.out.println("Pattern 6:");

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        System.out.println("Pattern 7:");

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        System.out.println("Pattern 8:");

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print('*');
            }
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        System.out.println("Pattern 9:");

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * (n - i)) - 1; j++) {
                System.out.print('*');
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        System.out.println("Pattern 10:");

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print('*' + " ");
            }
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        System.out.println("Pattern 11:");

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print('*' + " ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        System.out.println("Pattern 12:");

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print('*' + " ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print('*' + " ");
            }
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        System.out.println("Pattern 13:");

        for (int i = 0; i < n - 1; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print('*');
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(" ");
            }
            if (i > 0) {
                for (int j = 0; j < 1; j++) {
                    System.out.print('*');
                }
            }
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.print("*");
        }
    }

    public static void pattern14(int n) {
        System.out.println("Pattern 14:");

        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < n - 1; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print('*');
            }
            for (int k = 0; k < n - 2 * i; k++) {
                System.out.print(" ");
            }
            if (i < n - 1 - 1) {
                for (int j = 0; j < 1; j++) {
                    System.out.print('*');
                }
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        System.out.println("Pattern 15:");

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print('*');
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print(" ");
            }
            if (i > 0) {
                for (int j = 0; j < 1; j++) {
                    System.out.print('*');
                }
            }
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print('*');
            }
            for (int k = 0; k < n - 2 * i; k++) {
                System.out.print(" ");
            }
            if (i < n - 1 - 1) {
                for (int j = 0; j < 1; j++) {
                    System.out.print('*');
                }
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern16(int rows) {
        System.out.println("Pattern 16:");
        for (int i = 0; i < rows; i++) {
            int value = 1; // Initialize the first value in each row

            // Print spaces for alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }

            // Calculate and print the values using loops
            for (int j = 0; j <= i; j++) {
                System.out.print(value + "   ");
                // Update the value for the next iteration
                value = value * (i - j) / (j + 1); // -> formula for iCj
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void pattern17(int rows) {
        // Upper half of the pattern
        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int j = i + 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing numbers starting from 2
            for (int j = 2; j <= i + 1; j++) {
                System.out.print(j);
            }

            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to the next line
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = 0; i < rows - 2; i++) {
            // Print spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int j = rows - i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Print increasing numbers starting from 2
            for (int j = 2; j <= rows - i - 1; j++) {
                System.out.print(j);
            }

            // Print spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            // Move to the next line
            System.out.println();
        }
    }

    public static void pattern18(int rows) {
        System.out.println("Pattern 18:");

        for (int i = 0; i < 2 * rows; i++) {
            if (i < rows) {
                // Star
                for (int j = i; j < rows; j++) {
                    System.out.print("*" + " ");
                }

                // Space
                for (int j = 0; j < 2 * i; j++) {
                    System.out.print("  ");
                }

                // Star
                for (int j = i; j < rows; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            } else {
                // Star
                for (int j = 0; j < (i + 1) - rows; j++) {
                    System.out.print("*" + " ");
                }

                // Space
                for (int j = 0; j < 2 * (rows - ((i + 1) - rows)); j++) {
                    System.out.print("  ");
                }

                // Star
                for (int j = 0; j < (i + 1) - rows; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }
    }

    public static void pattern19(int rows) {
        System.out.println("Pattern 19:");
        for (int i = 0; i < (2 * rows) - 1; i++) {
            if (i < rows) {
                // Star
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("* ");
                }

                // Space
                for (int j = 0; j < 2 * (rows - (i + 1)); j++) {
                    System.out.print("  ");
                }

                // Star
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            } else {
                // Star
                for (int j = (2 * rows) - 1; j > i; j--) {
                    System.out.print("* ");
                }

                // Space
                for (int j = 0; j < 2 * ((i + 1) - rows); j++) {
                    System.out.print("  ");
                }

                // Star
                for (int j = (2 * rows) - 1; j > i; j--) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }

    public static void pattern20(int rows) {
        System.out.println("Pattern 20:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == 0 || i == (rows - 1) || j == 0 || j == (rows - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern21(int rows) {
        int start = 1;
        System.out.println("The Pattern:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = start + 1;
            }
            System.out.println();
        }
    }

    public static void pattern22(int rows) {
        int start = 0;
        System.out.println("The Pattern:");
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void pattern31(int rows) {
        System.out.println("Pattern 31:");
        for (int row = 0; row < (2 * rows) - 1; row++) {
            for (int col = 0; col < (2 * rows) - 1; col++) {
                int top = row;
                int left = col;
                int right = (2 * rows - 2) - col;
                int bottom = (2 * rows - 2) - row;
                System.out.print(rows - Math.min(Math.min(top, bottom), Math.min(left, right)));
            }
            System.out.println();
        }
    }
}
