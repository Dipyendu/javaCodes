package string;

import java.util.ArrayList;
import java.util.Arrays;

public class StringTheory {
    public static void main(String[] args) {
        // a and b pointing to same "Dipyendu Das" in String Pool
        String a = "Dipyendu Das";
        String b = "Dipyendu Das";
        System.out.println(a);
        System.out.println(b);

        System.out.println(a == b); // -> == checks if reference variables are pointing to same object and if values
                                    // are same

        a = "D";
        System.out.println(a);
        System.out.println(b);

        System.out.println(a == b);

        String c = "Dipyendu";
        String d = "Dipyendu";
        System.out.println(c == d); // -> == checks if reference variables are pointing to same object and if values
                                    // are same
        System.out.println(c.equals(d)); // -> only checks if values are equal

        System.out.println(c.charAt(0));

        System.out.println(new int[] { 1 });
        System.out.println(Arrays.toString(new int[] { 1 }));

        float f = 34.567f;
        System.out.printf("%.2f\n", f);

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + "b");
        System.out.println('a' + 3);
        System.out.println("a" + 3); // -> integer will be converted to Integer which will call toString

        System.out.println(new ArrayList<>());
        // -> System.out.println(Integer.valueOf(56) + new ArrayList<>()); // -> The
        // operator + is undefined for the argument
        // type(s) Integer, ArrayList<Object>

        String ans = Integer.valueOf(56) + "" + new ArrayList<>(); // -> typecasting to String
        System.out.println(ans); // -> printing it
    }
}