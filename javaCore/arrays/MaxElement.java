package arrays;

import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print("Given Array -> ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Max Element is -> " + maxElement(arr));
    }

    static int maxElement(int[] arr) {
        int maxElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxElement = Math.max(maxElement, arr[i]);
        }

        return maxElement;
    }
}
