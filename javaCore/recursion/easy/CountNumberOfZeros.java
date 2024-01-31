package javaCore.recursion.easy;

public class CountNumberOfZeros {

    public static void main(String[] args) {
        int n = 30204;
        System.out.println(countNumberOfZeros(n));
    }

    public static int countNumberOfZeros(int n) {
        return countZeros(n, 0);
    }

    private static int countZeros(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            count++;
        }
        return countZeros(n / 10, count);
    }
}
