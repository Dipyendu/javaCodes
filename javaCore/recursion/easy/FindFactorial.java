package javaCore.recursion.easy;

public class FindFactorial {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
