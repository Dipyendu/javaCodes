package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Solution1004 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0, 1, 0, 1, 1, 1, 0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    public static int longestOnes(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int i = 0;
        int j = 0;
        while (j < n) {
            int intJ = nums[j];
            int intI = nums[i];
            map.put(intJ, map.getOrDefault(intJ, 0) + 1);
            int numberOfOnes = map.getOrDefault(1, 0);
            int windowLength = j - i + 1;
            if (windowLength - numberOfOnes <= k) {
                maxLength = Math.max(maxLength, windowLength);
                j++;
            } else if (windowLength - numberOfOnes > k) {
                map.put(intI, map.get(intI) - 1);
                i++;
                j++;
            }
        }
        return maxLength;
    }
}
