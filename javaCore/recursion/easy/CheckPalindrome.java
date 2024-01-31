package javaCore.recursion.easy;

public class CheckPalindrome {
    public static void main(String[] args) {
        int n = 1331;
        if (isPalindrome(n)) {
            System.out.println(n + " is palindrome");
        } else {
            System.out.println(n + " is not palindrome");
        }
    }

    public static boolean isPalindrome(int n) {
        int reversedNumber = reverseANumber(n);
        return n == reversedNumber;
    }

    public static int reverseANumber(int n) {
        int numberOfDigits = (int) Math.log10(n);
        if (numberOfDigits == 0) {
            return n;
        }
        int remainder = n % 10;
        return (int) ((remainder * Math.pow(10, numberOfDigits)) + reverseANumber(n / 10));
    }
}
