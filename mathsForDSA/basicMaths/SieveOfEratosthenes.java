package mathsForDSA.basicMaths;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40; // Replace this with the desired limit
        boolean[] primes = sieveOfEratosthenes(n);

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + "\t");
            }
        }
    }

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, 2, n + 1, true);

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }
}

// -> Time Complexity
// -> Array Initialization: O(1)
// -> Outer Loop: O(√n)
// -> Inner Loop: O(n * log(log(n))) [Explanation -> n/2+n/3+n/5+...=n(1/2+1/3+1/5)=n*log(log(n))]
// -> Overall: O(n * log(log(n)))
