package leetCode;

import java.util.Arrays;
import java.util.Stack;

public class Solution1944 {
    public static void main(String[] args) {
        int[] heights = {10, 6, 8, 5, 11, 9};
        System.out.println(Arrays.toString(canSeePersonsCount(heights)));
    }

    public static int[] canSeePersonsCount(int[] A) {
        int n = A.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && A[stack.peek()] <= A[i])
                res[stack.pop()]++;
            if (!stack.isEmpty())
                res[stack.peek()]++;
            stack.add(i);
        }
        return res;
    }
}
