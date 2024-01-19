import java.util.Arrays;

public class Solution0034 {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 10;
        System.out.println("Answer -> " + Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };
        // -> Check for first occurence if target found
        int start = search(nums, target, true);
        // -> Check for last occurence if target found
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    public static int search(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                // -> potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        // if target element not found return -1;
        return ans;
    }
}

// -> Brute force approach -> do 2 linear search, one from 0 index and another
// one from n -1 index

// -> Optimized approach -> do 2 binary search, one for finding first first
// occurence and another one for finding last occurence