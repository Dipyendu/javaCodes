package javaCore.recursion.easy;

public class ReverseANumber {

    public static void main(String[] args) {
        int n = 182040;
        System.out.println(reverseANumber(n));
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
