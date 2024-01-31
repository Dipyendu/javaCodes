package javaCore.recursion.easy;

public class FindSumOfNNaturalNumbers {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sum(n - 1);
    }
}
