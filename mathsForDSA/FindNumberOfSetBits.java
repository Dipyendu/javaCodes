package mathsForDSA;

public class FindNumberOfSetBits {
    public static void main(String[] args) {
        int n = 15;
        System.out.println("Given Number: " + n);
        System.out.println("Binary Representation: " + Integer.toBinaryString(n));
        System.out.println("Number of Set Bits:" + findNumberOfSetBits(n));
    }

    public static int findNumberOfSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    // -> Alternative Solutions
    public static int alternativeSolution1(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n -= (n & -n);
        }
        return count;
    }

    public static int alternativeSolution2(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}
