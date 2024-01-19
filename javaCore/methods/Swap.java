package methods;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a: ");
            int a = input.nextInt();
            System.out.print("Enter b: ");
            int b = input.nextInt();
            System.out.println("Before Swap -> " + "a = " + a + " b = " + b);
            SwapNumbers obj = new SwapNumbers(a, b);
            obj.swap();
            a = obj.a;
            b = obj.b;
            System.out.println("After Swap -> " + "a = " + a + " b = " + b);
        }
    }
}

class SwapNumbers {
    int a, b;

    SwapNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void swap() {
        a = a + b;
        b = a - b;
        a = a - b;
    }
}
