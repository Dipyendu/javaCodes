package leetCode;

import java.util.Arrays;

public class Solution0167 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Answer -> " + Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            if (target < numbers[start] + numbers[end]) {
                end--;
            } else if (target > numbers[start] + numbers[end]) {
                start++;
            } else {
                return new int[]{start + 1, end + 1};
            }
        }
        return new int[]{-1, -1};
    }
}
