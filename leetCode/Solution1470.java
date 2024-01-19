import java.util.Arrays;

public class Solution1470 {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < 2 * n; i += 2) {
            result[i] = nums[i / 2];
            result[i + 1] = nums[(i / 2) + n];
        }
        return result;
    }
}
// -> [x1, x2, x3, y1, y2, y3] -> [0, 1, 2, 3, 4, 5]
// -> [x1, y1, x2, y2, x3, y3] -> [0, 3, 1, 4, 2, 5]