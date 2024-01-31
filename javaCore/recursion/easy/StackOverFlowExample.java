// n-- vs --n in recursion calls

package javaCore.recursion.easy;

public class StackOverFlowExample {
    public static void main(String[] args) {
        int n = 5;
        printNumbers1(n);
        printNumbers2(n);
    }

    //    n--
    public static void printNumbers1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers1(n--);
    }

    //    --n
    public static void printNumbers2(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers1(--n);
    }
}
