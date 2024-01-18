package timeComplexity;

public class FibonacciUsingFormula {
    public static void main(String[] args) {
        // -> number input
        double n = 5;
        // -> Formula to get the nth fibonacci term
        double fib = (1 / Math.sqrt(5)) * (Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n));

        // -> Rounding off and converting to a normal number
        long roundedFib = Math.round(fib);

        // -> Printing the rounded nth Fibonacci term
        System.out.println(roundedFib);
    }
}
