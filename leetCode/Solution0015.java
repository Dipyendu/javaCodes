package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0015 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arrayList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) { // Skip duplicates of the first element
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum < 0) {
                        j++;
                    } else if (sum > 0) {
                        k--;
                    } else {
                        arrayList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        // Skip duplicates of the second element
                        while (j < k && nums[j] == nums[j + 1]) {
                            j++;
                        }
                        // Skip duplicates of the third element
                        while (j < k && nums[k] == nums[k - 1]) {
                            k--;
                        }
                        j++;
                        k--;
                    }
                }
            }
        }
        return arrayList;
    }
}
