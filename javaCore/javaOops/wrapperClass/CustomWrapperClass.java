package wrapperClass;

import java.util.Scanner;

class IntWrapper {
    int value;

    IntWrapper(int value) {
        this.value = value;
    }
}

public class CustomWrapperClass {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\n\n Function : swap two numbers using pure function :");
            System.out.println("------------------------------------------------");

            System.out.print("Input 1st number : ");
            int n1 = scanner.nextInt();

            System.out.print("Input 2nd number : ");
            int n2 = scanner.nextInt();

            System.out.printf("\nBefore swapping: n1 = %d, n2 = %d\n", n1, n2);

            // create IntWrapper instances to simulate pass-by-reference
            IntWrapper n1Wrapper = new IntWrapper(n1);
            IntWrapper n2Wrapper = new IntWrapper(n2);

            // pass the wrapper instances to the pureSwap function
            swap(n1Wrapper, n2Wrapper);

            // retrieve the values from the wrapper instances
            n1 = n1Wrapper.value;
            n2 = n2Wrapper.value;

            System.out.printf("\nAfter swapping: n1 = %d, n2 = %d\n", n1, n2);
        }
    }

    static void swap(IntWrapper p, IntWrapper q) {
        System.out.println("\nInside Swap function.");

        // Swap the values of p and q using a temporary variable
        int tmp = p.value;
        p.value = q.value;
        q.value = tmp;

        System.out.printf("After swapping inside function: p = %d, q = %d \n", p.value, q.value);
    }
}
