package leetCode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution1299 {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    public static int[] replaceElements(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!queue.isEmpty() && arr[i] > queue.peekLast()) {
                queue.removeLast();
            }
            queue.addLast(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == queue.peekFirst()) {
                queue.removeFirst();
            }
            if (!queue.isEmpty()) {
                result[i] = queue.peekFirst();
            } else {
                result[i] = -1;
            }
        }

        return result;
    }
}
