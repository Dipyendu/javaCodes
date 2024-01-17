package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.print("Given Array -> ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Reversed Array -> ");
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }

        return reversedArray;
    }
}
