package leetCode;

import java.util.HashMap;

public class Solution0560 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int k = 0;
        System.out.println(subarraySum(nums, k));
        System.out.println(subarraySumSlidingWindow(nums, k));
        System.out.println(subarraySumHashMap(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(map);
        return count;
    }

    public static int subarraySumSlidingWindow(int[] nums, int k) { // for non-zero and non-negative elements
        int n = nums.length;
        int count = 0;
        if (n == 0) {
            return count;
        }
        if (n == 1) {
            return nums[0] == k ? 1 : 0;
        }
        int sum = nums[0];
        int i = 0;
        int j = 1;
        while (j <= n && i < n) {
            if (sum == k) {
                count++;
                sum -= nums[i];
                i++;
            } else if (sum < k && j < n) {
                sum += nums[j];
                j++;
            } else {
                sum -= nums[i];
                i++;
            }
        }
        return count;
    }

    public static int subarraySumHashMap(int[] nums, int k) { // for non-zero sum
        int N = nums.length;
        int count = 0;
        if (N == 1) {
            return nums[0] == k ? 1 : 0;
        }
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            sum += nums[i];
            int remainder = sum - k;
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (sum == k) {
                count++;
            }
            if (map.containsKey(remainder) && map.get(remainder) != i) {
                count++;
            }
        }
        System.out.println(map);
        return count;
    }

}
