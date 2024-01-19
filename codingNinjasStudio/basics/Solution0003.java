package codingNinjasStudio.basics;

/*
    Time complexity: O(1)
    Space complexity: O(1)
*/
public class Solution0003 {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        System.out.println("Answer -> " + compareIfElse(a, b));
    }

    public static String compareIfElse(int a, int b) {
        if (a > b)
            return "greater";
        else if (a < b)
            return "smaller";
        else
            return "equal";
    }
}