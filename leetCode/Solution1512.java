public class Solution1512 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 3 };
        System.out.println("Answer -> " + numIdenticalPairs(arr));
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}
