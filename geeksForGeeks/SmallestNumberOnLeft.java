package geeksForGeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SmallestNumberOnLeft {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 2, 9, 4, 4};
        int n = arr.length;
        System.out.println(leftSmaller(n, arr));
    }

    static List<Integer> leftSmaller(int n, int[] a) {
        //code here
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop elements from the stack smaller than current element
            while (!stack.empty() && stack.peek() >= a[i]) {
                stack.pop();
            }

            // If stack is empty, there's no lesser element
            if (stack.empty()) {
                result.add(-1);
            } else {
                result.add(stack.peek());
            }

            // Push current element onto the stack
            stack.push(a[i]);
        }

        return result;
    }
}
