package mathsForDSA;

public class ResetKthBit {
    public static void main(String[] args) {
        long number = 500; // -> Binary: 111110100
        long k = 6;
        System.out.println("Original number: " + number);
        long result = resetKthBit(number, k);
        System.out.println("Number after resetting the " + k + "th bit: " + result);
    }

    public static long resetKthBit(long number, long k) {
        return number & ~(1L << (k - 1));
    }
}
