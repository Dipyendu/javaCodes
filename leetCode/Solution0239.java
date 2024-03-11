package leetCode;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Solution0239 {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            while (!queue.isEmpty() && queue.peekLast() < nums[j]) {
                queue.removeLast();
            }
            queue.addLast(nums[j]);
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (!queue.isEmpty()) {
                    result[i] = queue.peekFirst();
                    if (nums[i] == queue.peekFirst()) {
                        queue.removeFirst();
                    }
                }
                i++;
                j++;
            }
        }
        return result;
    }
}
