package geeksForGeeks;

import java.util.Arrays;
import java.util.Stack;

public class HelpClassmates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 5, 2, 3, 1};
        int n = arr.length;
        System.out.println(Arrays.toString(help_classmate(arr, n)));
    }

    public static int[] help_classmate(int[] arr, int n) {
        // Your code goes here
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack smaller than current element
            while (!stack.empty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // If stack is empty, there's no greater element
            if (stack.empty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Push current element onto the stack
            stack.push(arr[i]);
        }

        return result;
    }
}
