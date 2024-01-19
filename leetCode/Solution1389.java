// -> make target array of size index.length -> int[] target = new int[index.length]
// -> insert value from nums array for the number of iteration index in target array in the index which is written in index array
// -> for example in i = 4 iteration nums[4] will be inserted in target[1] as index[4] = 1
// -> iterate through the array from target.length - 1 to index - 1 and right shift all the values and at target[index[i]] insert the value i.e. nums[i]

// -> time complexity -> O(n^2)

import java.util.Arrays;

public class Solution1389 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        System.out.println("Answer -> " + Arrays.toString(createTargetArray(arr, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];

        for (int i = 0; i < nums.length; i++) {
            solve(target, nums[i], index[i]);
        }

        return target;
    }

    public static void solve(int[] target, int value, int index) {
        for (int i = target.length - 1; i > index; i--) {
            target[i] = target[i - 1];
        }
        target[index] = value;
    }
}
