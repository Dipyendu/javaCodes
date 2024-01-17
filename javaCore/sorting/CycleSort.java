// -> if range (0, n) -> index = value
// -> if range (1, n) -> index = value - 1

// -> when given consecutive numbers from range (1, n) i.e. {2, 3, 5, 1, 4} -> use cyclic sort

// -> Time Complexity -> Best Case: O(n) Worst Case: O(n) | Space Complexity: O(1)

package sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println("Array before Cyclic Sort ->" + Arrays.toString(arr));
        System.out.println("Array before Cyclic Sort ->" + Arrays.toString(cycleSort(arr)));
    }

    public static int[] cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (i != correctIndex) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }
}
