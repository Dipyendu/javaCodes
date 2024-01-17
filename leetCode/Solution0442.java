import java.util.ArrayList;
import java.util.List;

public class Solution0442 {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println("Answer -> " + findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (i != correctIndex && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (i != (nums[i] - 1)) {
                result.add(nums[i]);
            }
        }

        return result;
    }

}
