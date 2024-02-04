package javaCore.recursion.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3};
        selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int firstIndex = 0;
        int lastIndex = arr.length;
        int max = 0;
        helper(arr, lastIndex, firstIndex, max);
    }

    public static void helper(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                helper(arr, r, c + 1, c);
            } else {
                helper(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            helper(arr, r - 1, 0, 0);
        }
    }
}
