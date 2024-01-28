package mathsForDSA;

public class RightmostSetBitPosition {
    public static void main(String[] args) {
        long number = 18; // Binary: 10010
        System.out.println("Original number: " + number);
        int position = findRightmostSetBitPosition(number);
        System.out.println("Position of the rightmost set bit: " + position);
    }

    public static int findRightmostSetBitPosition(long number) {
        if (number == 0) {
            return -1; // No set bit is present in 0
        }

        int position = 1;

        // Keep right-shifting the number until the rightmost set bit is 1
        while ((number & 1) == 0) { // checking if the last bit is 0 or 1
            number = number >> 1; // if it is 0 right shifting the number reduce the 0 and move the next index at last
            position++;
        }

        return position;
    }
}
