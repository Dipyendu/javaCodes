package mathsForDSA.basicMaths;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(isPrime(n));

        int rangeStart = 2;
        int rangeEnd = 40;
        printPrimeNumbersForARange(rangeStart, rangeEnd);
    }

    public static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        for (int i = 2; i * i <= n; i++) { // -> Time Complexity -> O((int)sqrt(n))
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumber(int n) {
        if (isPrime(n)) {
            System.out.print(n + "\t");
        }
    }

    public static void printPrimeNumbersForARange(int a, int b) {
        for (int i = a; i <= b; i++) {
            printPrimeNumber(i);
        }
    }
}
