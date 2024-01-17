import java.util.Arrays;

public class Solution1920 {
    public static void main(String[] args) {
        int[] nums = { 5, 0, 1, 2, 3, 4 };
        System.out.print("Given Array -> ");
        System.out.println(Arrays.toString(nums));
        System.out.print("Answer in brute force approach -> ");
        System.out.println(Arrays.toString(bruteForce(nums)));
        System.out.print("Answer in optimized approach -> ");
        System.out.println(Arrays.toString(optimized(nums)));
    }

    static int[] bruteForce(int[] nums) { // Time -> O(n) and Space -> O(n)
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }

    static int[] optimized(int[] nums) {
        int CONST = 1001;

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int b = nums[a] % CONST;

            nums[i] = a + (CONST * b); // or -> nums[i] = nums [i] + (CONST *(nums[nums[i]] % CONST));
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] /= CONST;
        }

        return nums;
    }
}
