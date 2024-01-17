package exceptionHandling;

import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int result = 10 / 0; // ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Catching the exception
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            // Code that will be executed no matter what, even if an exception occurs
            System.out.println("Finally block");
        }

        // Throwing a custom exception
        try {
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println("Caught a CustomException: " + e.getMessage());
        }

        // Method declaration with throws keyword
        try {
            methodWithThrows();
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }
    }

    static void methodWithThrows() throws IOException {
        throw new IOException("IOException in methodWithThrows");
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
