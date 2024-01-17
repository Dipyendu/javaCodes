package basics;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a:");
            int a = input.nextInt();
            System.out.println(a);

            int b = 234_567_987;
            System.out.println(b);

            System.out.println("Enter Float:");
            float marks = input.nextFloat();
            System.out.println(marks);

            // -> Type Casting
            int num = (int) (65.64f);
            System.out.println(num);

            // automatic type promotion
            int c = 257;
            byte d = (byte) (c); // -> byte stores only upto 256
            System.out.println(d);

            int number = 'জ';
            System.out.println(number);

            char c2 = 2460;
            System.out.println(c2);
        }
    }
}
