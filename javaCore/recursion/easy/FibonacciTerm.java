package javaCore.recursion.easy;

import java.util.Scanner;

// -> recurrence relation -> Fib(n) = Fib(n - 1) + Fib(n - 2)

// -> time complexity -> ( ( 1 + sqrt(5) ) / 2 ) ^ n = (1.618)^n = (golden ratio) ^ n

public class FibonacciTerm {
    public static void main(String[] args) {
        System.out.print("Enter index: ");
        try (Scanner input = new Scanner(System.in)) {
            int index = input.nextInt();
            System.out.printf("%dth Fibonacci number: %d", index, fibonacci(index));
        }

    }

    public static int fibonacci(int index) {
        if (index < 2) { // -> base condition
            return index;
        } else {
            return fibonacci(index - 1) + fibonacci(index - 2); // -> recursive call
        }
    }
}
