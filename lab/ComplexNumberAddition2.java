import java.util.Scanner;

public class ComplexNumberAddition2 {

    public static double addNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first complex number
        System.out.println("Enter the first complex number:");
        System.out.print("Real part: ");
        double real1 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary1 = scanner.nextDouble();

        // Input for the second complex number
        System.out.println("Enter the second complex number:");
        System.out.print("Real part: ");
        double real2 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary2 = scanner.nextDouble();

        // Add the two complex numbers
        double realSum = addNumbers(real1, real2);
        double imaginarySum = addNumbers(imaginary1, imaginary2);

        // Display the result
        System.out.println("Sum: " + realSum + " + " + imaginarySum + "i");

        // Close the scanner
        scanner.close();
    }
}
