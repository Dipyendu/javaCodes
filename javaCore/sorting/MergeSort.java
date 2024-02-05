// 1. Divide array into 2 parts
// 2. Get both parts sorted via recursion
// 3. Merge the sorted parts

// Time Complexity -> O(N * logN) -> N = merging happening in linear time i.e. N, logN = dividing happening in logN time

package javaCore.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 7, 4, 1, 8, 2, 10, 34, 32, 12};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1 || arr.length == 0) {
            return arr;
        }

        int mid = (arr.length - 1) / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid + 1)); // will go from 0 to mid
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid + 1, arr.length)); // will go from mid+1 to arr.length-1

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

//      -> it may be possible that one of the arrays is not complete
//      -> put the remaining elements into the array
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
