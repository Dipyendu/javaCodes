package mathsForDSA.bitwiseOperators;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 33;
        System.out.println(isOdd(n));
        System.out.println(isEven(n));
    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }
}
