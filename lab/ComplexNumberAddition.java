import java.util.Scanner;

class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
}

public class ComplexNumberAddition {

    public static ComplexNumber addComplexNumbers(ComplexNumber num1, ComplexNumber num2) {
        double realSum = num1.real + num2.real;
        double imaginarySum = num1.imaginary + num2.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first complex number
        System.out.println("Enter the first complex number:");
        System.out.print("Real part: ");
        double real1 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary1 = scanner.nextDouble();
        ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);

        // Input for the second complex number
        System.out.println("Enter the second complex number:");
        System.out.print("Real part: ");
        double real2 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary2 = scanner.nextDouble();
        ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);

        // Add the two complex numbers
        ComplexNumber sum = addComplexNumbers(complex1, complex2);

        // Display the result
        System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");

        // Close the scanner
        scanner.close();
    }
}
