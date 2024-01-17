import java.util.Scanner;

public class Valley {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no of rows:");
            int n = sc.nextInt();
            int length = String.valueOf(n).length();
            System.out.println("The Pattern:");
            for (int i = 0; i < n; i++) {

                // Numbers
                for (int j = 0; j <= i; j++) {
                    System.out.format("%0" + (length) + "d", j + 1);
                }

                // Space
                for (int j = 0; j < 4 * (n - i - 1); j++) {
                    System.out.print(" ");
                }

                // Numbers
                for (int j = i; j >= 0; j--) {
                    System.out.format("%0" + (length) + "d", j + 1);
                }
                System.out.println();
            }
        }

    }
}