package mathsForDSA.bitwiseOperators;

public class SingleAppearingNumberInThriceAppearingArray {
    public static void main(String[] args) {
        int[] array = {3, 3, 3, 5, 5, 5, 6, 6, 6, 8, 8, 8, 9};
        int result = findSingleNumber(array);
        System.out.println("Number appearing once: " + result);
    }

    public static int findSingleNumber(int[] array) {
        int result = 0;

        for (int i = 0; i < 32; i++) { // Assuming 32-bit integers
            int sum = 0;

            for (int num : array) {
                sum += (num >> i) & 1; // Sum the bits at position i for all numbers
            }

            sum %= 3; // Take modulo 3

            result |= (sum << i); // Set the ith bit of result with the calculated sum
        }

        return result;
    }
}
