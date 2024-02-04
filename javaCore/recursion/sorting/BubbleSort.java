package javaCore.recursion.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3};
        bubble(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void bubble(int[] arr) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        helper(arr, lastIndex, firstIndex);
    }

    public static void helper(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {

            if (arr[c] > arr[c + 1]) {
                // swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }

            helper(arr, r, c + 1);
        } else {
            helper(arr, r - 1, 0);
        }
    }
}
