package geeksForGeeks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        long[] arr = {1, 5, 8, 2, 4, 1, 6};
        int n = arr.length;
        System.out.println(Arrays.toString(nextLargerElement(arr, n)));
        System.out.println(Arrays.toString(nextLargerElementAlternative(arr, n)));
    }

    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
        long[] result = new long[n];
        Stack<Long> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack smaller than current element
            while (!stack.empty() && stack.peek() <= arr[i]) {
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

    public static long[] nextLargerElementAlternative(long[] arr, int n) {
        // Your code here
        long[] result = new long[n];
        Stack<Long> stack = new Stack<>();

//        Arranging the stack
        for (int i = 0; i < n; i++) {

        }
        return result;
    }
}
