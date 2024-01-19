import java.util.Arrays;

public class Solution1480 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.print("Given Array -> ");
        System.out.println(Arrays.toString(nums));
        System.out.print("Answer in brute force way -> ");
        System.out.println(Arrays.toString(bruteForce(nums)));
        System.out.print("Answer in optimized way -> ");
        System.out.println(Arrays.toString(optimized(nums)));

    }

    public static int[] bruteForce(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j <= i; j++) {
                result[i] = result[i] + nums[j];
            }
        }
        return result;
    }

    public static int[] optimized(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
            // -> for i = 1 -> nums[1] = nums [0] + nums[1];
            // -> for i = 2 -> nums[2] = nums [1] + nums[2];
            // -> for i = 3 -> nums[3] = nums [2] + nums[3];
            // -> for i = 4 -> nums[4] = nums [3] + nums[4];
        }
        return nums;
    }
}
