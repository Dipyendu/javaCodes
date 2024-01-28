package mathsForDSA.bitwiseOperators;

public class FindXOR {
    // Function to return the XOR of elements
    // from the range [1, n]
    static int findXOR(int n) {
        int mod = n % 4;

        // If n is a multiple of 4
        if (mod == 0)
            return n;

            // If n % 4 gives remainder 1
        else if (mod == 1)
            return 1;

            // If n % 4 gives remainder 2
        else if (mod == 2)
            return n + 1;

            // If n % 4 gives remainder 3
        else if (mod == 3)
            return 0;
        return 0;
    }

    // Function to return the XOR of elements
    // from the range [l, r]
    static int findXOR(int l, int r) {
        return (findXOR(l - 1) ^ findXOR(r));
    }

    // Driver code
    public static void main(String[] args) {

        int l = 4, r = 8;

        System.out.println(findXOR(l, r));
    }
}
