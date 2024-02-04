package javaCore.recursion.arrays;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5,};
        int target1 = 3;
        int[] arr2 = {1, 2, 3, 3, 3, 4, 7, 3};
        int target2 = 3;
        System.out.println("Index -> " + linearSearchRecursion(arr1, target1));
        System.out.println("Index ->" + findAllIndex(arr2, target2));
    }

    public static int linearSearchRecursion(int[] arr, int target) {
        int index = 0;
        return helper(arr, target, index); // Helper Function call
    }

    public static int helper(int[] arr, int target, int index) { // Helper Function
        if (index == arr.length) { // Base Condition
            return -1;
        }
        if (arr[index] == target) { // Base Condition
            return index;
        }
        return helper(arr, target, index + 1); // Recursive Function
    }

    public static ArrayList<Integer> findAllIndex(int[] arr, int target) {
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        return helperFindAllIndex(arr, target, index, list); // Helper Function call
    }

    public static ArrayList<Integer> helperFindAllIndex(int[] arr, int target, int index, ArrayList list) {
        if (index == arr.length) { // Base Condition
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        return helperFindAllIndex(arr, target, index + 1, list);
    }
}
