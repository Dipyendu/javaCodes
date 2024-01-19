class Complex {
    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }
}

public class MethodOverload {
    public static void main(String[] args) {
        // Adding two complex numbers
        Complex complex1 = new Complex(3.5, 2.0);
        Complex complex2 = new Complex(1.5, 4.5);
        Complex sumComplex = add(complex1, complex2);
        System.out.println("Sum of complex numbers: " + sumComplex.real + " + " + sumComplex.imaginary + "i");

        // Adding two integers
        int num1 = 5;
        int num2 = 7;
        int sumIntegers = add(num1, num2);
        System.out.println("Sum of integers: " + sumIntegers);

        // Adding two strings
        String str1 = "Hello, ";
        String str2 = "world!";
        String concatStrings = add(str1, str2);
        System.out.println("Concatenated strings: " + concatStrings);
    }

    public static Complex add(Complex num1, Complex num2) {
        return num1.add(num2);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static String add(String str1, String str2) {
        return str1 + str2;
    }
}
