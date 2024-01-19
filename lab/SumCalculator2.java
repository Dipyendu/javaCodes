import java.util.Scanner;

public class SumCalculator2 {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number (x): ");
        double x = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number (y): ");
        double y = scanner.nextDouble();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Call the function to calculate the sum and print the result
        double sum = calculateSum(x, y);
        System.out.println("Sum of " + x + " and " + y + " is: " + sum);
    }

    // Function to calculate the sum of two numbers
    public static double calculateSum(double a, double b) {
        return a + b;
    }
}
