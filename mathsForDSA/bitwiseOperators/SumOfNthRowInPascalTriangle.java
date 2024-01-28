package mathsForDSA.bitwiseOperators;

public class SumOfNthRowInPascalTriangle {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Sum of " + n + "th" + " row: " + nthRowSum(n));
    }

    public static int nthRowSum(int n) {
        return 1 << (n - 1);
    }
}
