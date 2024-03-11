package geeksForGeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindIndexesOfASubarrayWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length;
        int s = 12;
        System.out.println(subarraySum(arr, n, s));
        System.out.println(subarraySumOptimized(arr, n, s));
    }

    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        if (n == 1) {
            return arr[0] == s ? new ArrayList<>(List.of(1, 1)) : new ArrayList<>(List.of(-1));
        }
        long sum = 0;
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == s) {
                return new ArrayList<>(List.of(1, i + 1));
            }
            long remainder = sum - s;
            if (map.containsKey(remainder)) {
                return new ArrayList<>(List.of(map.get(remainder) + 2, i + 1));
            }
            map.put(sum, i);
        }
        return new ArrayList<>(List.of(-1));
    }

    static ArrayList<Integer> subarraySumOptimized(int[] arr, int n, int s) {
        int currentSum = arr[0], start = 0, i;
        // Pick a starting point
        for (i = 1; i <= n; i++) {
            // If currentSum exceeds the sum,
            // then remove the starting elements
            while (currentSum > s && start < i - 1) {
                currentSum = currentSum - arr[start];
                start++;
            }

            // If currentSum becomes equal to sum,
            // then return true
            if (currentSum == s) {
                int p = i - 1;
                return new ArrayList<>(List.of(start + 1, p + 1));
            }

            // Add this element to curr_sum
            if (i < n)
                currentSum = currentSum + arr[i];
        }
        return new ArrayList<>(List.of(-1));
    }
}
