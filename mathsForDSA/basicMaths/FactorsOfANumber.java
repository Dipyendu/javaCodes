package mathsForDSA.basicMaths;

import java.util.ArrayList;
import java.util.Collections;

public class FactorsOfANumber {
    public static void main(String[] args) {
        int n = 20;
        printFactors1(n);
        System.out.println();
        printFactors2(n);
        System.out.println();
        printFactors3(n);
    }

    // Time Complexity -> O(n)
    public static void printFactors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + "\t");
            }
        }
    }

    // Time Complexity -> O(sqrt(n))
    public static void printFactors2(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + "\t");
                } else {
                    System.out.print(i + "\t");
                    System.out.print(n / i + "\t");
                }
            }
        }
    }

    // Both Time and Space Complexity -> O(sqrt(n))
    public static void printFactors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + "\t");
                } else {
                    System.out.print(i + "\t");
                    list.add(n / i);
                }
            }
        }
        Collections.reverse(list);
        // Using forEach loop with tabs between elements to print
        list.forEach(element -> System.out.print(element + "\t"));
    }
}
