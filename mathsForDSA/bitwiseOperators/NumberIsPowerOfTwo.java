package mathsForDSA.bitwiseOperators;

public class NumberIsPowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(powerOfTwo(n));
    }

    public static boolean powerOfTwo(int n) {
        if (n == 0) { // exception case just return false
            return false;
        }
        System.out.println(n & (n - 1));
        return (n & (n - 1)) == 0; // -> n & (n -1) will return the previous number which is power of two if it is not a power of two else will return 0
        // -> 16 = 10000
        // -> 15 = 01111
        // 16 & 15 -> 10000 & 01111 = 0 -> true

        // -> 17 = 10001
        // -> 16 = 10000
        // 17 & 16 -> 10001 & 10000 != 10000 -> false

        // -> 20 = 10100
        // -> 19 = 10011
        // 20 & 19 -> 10100 & 10011 != 10000 -> false
    }
// public static boolean powerOfTwo(int n){
//     int count = 0;
//     while (n>0){
//         if((n&1) == 1) {
//             count++;
//         }
//         n>>=1;
//     }
//     return count == 1;
// }
}

