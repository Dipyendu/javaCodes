// for given array

// -> Brute Force Approach
// sum1(7, 2, 5, 10) = 24, sum2(8) = 8 -> max(sum1, sum2) = 24 = max1
// sum1(7, 2, 5) = 14, sum2(10, 8) = 18 -> max(sum1, sum2) = 18 = max2
// sum1(7, 2) = 9, sum2(5, 10, 8) = 23 -> max(sum1, sum2) = 23 = max3
// sum1(7, 2) =7, sum2(2, 5, 10, 8) = 25 -> max(sum1, sum2) = 25 = max4
// -> min(max1, max2, max3, max4) = 18 = ans

// -> Optimized Approach
// the least value of k can be 1 -> {7, 2, 5, 10, 8} -> for that case max(sum) will be sum of the all the elements of the array
// the max value of can be n i.e. length of the array -> {7}, {2}, {5}, {10}, {8} -> max(sum) = 10
// -> max value of ans of question = case 1 = sum of all values in array
// -> min value of ans of question = case 2 = max value available in array

// -> start = 10, end = 32 so mid = 21 -> the array sums have to be less than mid
// -> if pieces <= k -> end = mid
// -> if pieces > k -> start = mid + 1
// -> when start = mid = end loop will break

public class Solution0410 {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 10, 8 };
        int k = 2;
        System.out.println("Answer -> " + splitArray(arr, k));
    }

    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item from the array
            end += nums[i];
        }

        // binary search
        while (start < end) {
            // try for the mid as potential answer
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this im with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; // here start = end = mid
    }
}
