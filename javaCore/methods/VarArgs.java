package methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 2, 33, 4, 4, 5, 5, 6, 6, 78, 9);
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
