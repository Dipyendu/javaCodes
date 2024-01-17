// -> Performs well on small lists/arrays

// -> Time Complexity -> Worst Case: O(n^2) Best Case: O(n^2) | Space Complexity -> O(1)

// -> can be done in 2 ways -> 1. Get the index of max element in the remaining array and put it in last index
//                             2. Get the index of min element in the remaining array and put it in first index

package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println("Array before Selection Sort ->" + Arrays.toString(arr));
        System.out.println("Array before Selection Sort ->" + Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, last);
            // swap the element of maxIndex with the element of last index if it is not in
            // the last index
            if (maxIndex != last) {
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[last];
                arr[last] = temp;
            }
        }
        return arr;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }
}
