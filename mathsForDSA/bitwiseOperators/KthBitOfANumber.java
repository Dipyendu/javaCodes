package mathsForDSA.bitwiseOperators;

public class KthBitOfANumber {
    public static void main(String[] args) {
        long number = 500; // -> Binary: 111110100
        long k = 5;
        System.out.println("Given Number: " + number);
        System.out.println("Binary Representation: " + Long.toBinaryString(number));
        System.out.println("Answer -> " + findNthBitOfANumber(number, k));
    }

    public static long findNthBitOfANumber(long number, long k) {

        System.out.println(1L << (k - 1)); // -> 1L << (n - 1) -> 10000 -> 16
        System.out.println(number & (1L << (k - 1))); // -> number & 10000 -> 111110100 & 00001000 -> 10000 -> 16
        System.out.println((number & (1L << (k - 1))) >> (k - 1)); // -> 10000 >> 4 -> 1

        return (number & (1L << (k - 1))) >> (k - 1);
    }
}