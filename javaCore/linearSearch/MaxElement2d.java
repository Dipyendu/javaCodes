package linearSearch;

public class MaxElement2d {
    public static void main(String[] args) {
        int[][] nums = {
                { 1, 3, 4 },
                { 2, 8, 5 },
                { 6, 15, 76 },
                { 45, 35, 66 }
        };
        int ans = maxElement2d(nums);
        System.out.println(ans);
    }

    public static int maxElement2d(int[][] nums) {
        if (nums.length == 0) {
            return -1;
        }

        else {
            int maxElement = nums[0][0];

            // -> Run a for loop for rows
            for (int row = 0; row < nums.length; row++) {
                // -> Check for every element column index s
                for (int col = 0; col < nums[row].length; col++) {
                    maxElement = Math.max(maxElement, nums[row][col]);
                }
            }

            return maxElement;
        }
    }
}
