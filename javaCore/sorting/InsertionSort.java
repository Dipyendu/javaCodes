// -> Time Complexity -> Worst Case: O(n^2) Best Case: O(n) | Space Complexity -> O(1)

// -> Adaptive i.e. steps gets reduced if array is sorted. number of steps reduced compared to bubble sort

// -> used for smaller value of n -> works good where array is partially sorted -> that is why it takes part in hybrid sorting algorithms

package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println("Array before Insertion Sort ->" + Arrays.toString(arr));
        System.out.println("Array before Insertion Sort ->" + Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}
