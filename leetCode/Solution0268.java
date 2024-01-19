// -> think of the array as an array of n+1 length
// so in {3, 0, 1} array think of it as an array of length which should have been like this {0, 1, 2, 3} and 2 is missing
// -> {0, 1, 2, 3} -> in this example array should be of length 5 and it should have been like this {0, 1, 2, 3, 4} so last element is missing

public class Solution0268 {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 1, 2 };
        System.out.println("Answer -> " + missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];

            if (correctIndex < nums.length && i != correctIndex) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        // -> case 1 : search for missing number
        for (i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        // -> case 2 where every element is in correct position but the last element is
        // missing
        return nums.length;
    }
}
