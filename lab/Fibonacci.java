import java.util.Scanner;

public class Fibonacci {
    public static void printFibonacci(int numTerms) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int numTerms = scanner.nextInt();

        if (numTerms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            printFibonacci(numTerms);
        }

        scanner.close();
    }
}
