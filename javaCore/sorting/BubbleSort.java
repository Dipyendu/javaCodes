// -> Also known as Sinking Sort or Exchange Sort

// -> Time Complexity -> Worst Case: O(n^2) Best Case: O(n) | Space Complexity -> O(1)

package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        System.out.println("Array before Bubble Sort ->" + Arrays.toString(arr));
        System.out.println("Array before Bubble Sort ->" + Arrays.toString(bubbleSort(arr)));
    }

    private static int[] bubbleSort(int[] arr) {

        boolean swapped;

        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step max item will come at the last respective index
            for (int j = 1; j < arr.length - i - 1; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if it did not swap for a particular value of i, it means that array is
            // sorted
            // hence stop the program
            if (!swapped) {
                return arr;
            }
        }
        return arr;
    }
}