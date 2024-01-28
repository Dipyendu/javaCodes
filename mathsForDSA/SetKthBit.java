package mathsForDSA;

public class SetKthBit {
    public static void main(String[] args) {
        long number = 500; // -> Binary: 111110100
        long k = 1;
        System.out.println("Original number: " + number);
        long result = setKthBit(number, k);
        System.out.println("Number after setting the " + k + "th bit: " + result);
    }

    public static long setKthBit(long number, long k) {
        return number | (1L << (k - 1));
    }
}
