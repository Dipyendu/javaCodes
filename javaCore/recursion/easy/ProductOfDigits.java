package javaCore.recursion.easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(productOfDigits(n));
    }

    public static int productOfDigits(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * productOfDigits(n / 10);
    }
}
