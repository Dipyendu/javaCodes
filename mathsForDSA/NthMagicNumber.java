package mathsForDSA;

public class NthMagicNumber {
    public static void main(String[] args) {
        int n = 10; // Replace this with the desired value of N
        int result = findNthMagicNumber(n);
        System.out.println("The " + n + "th magic number is: " + result);
    }

    public static int findNthMagicNumber(int n) {
        int result = 0;
        int base = 1;

        while (n > 0) {
            base *= 5; // Multiply pow with 5 at each step
            result += (n & 1) * base; // -> if last bit is set i.e. 1 then it will add in result if reset i.e. 0 will add
            n >>= 1; // Right-shift n
        }
        return result;
    }
}

