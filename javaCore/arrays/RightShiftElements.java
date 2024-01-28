package arrays;

import java.util.Arrays;

public class RightShiftElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] shiftedArr = rightshift(arr);
        System.out.print("Given Array -> ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Right Shifted Array -> ");
        System.out.println(Arrays.toString(shiftedArr));
    }

    static int[] rightshift(int[] arr) {
        int[] shiftedArr = new int[arr.length];

        shiftedArr[0] = arr[arr.length - 1]; // -> First element of the Right Shifted Array
        // -> sArr[0] = arr[4];

        // -> Elements from index 1 to arr.length - 1 for shiftedArray
        // -> sArr[1] = arr[0]; sArr[2] = arr [1]; sArr[3] = arr [2]; sArr[4] = arr[3]
        System.arraycopy(arr, 0, shiftedArr, 1, arr.length - 1);

        return shiftedArr;
    }
}
