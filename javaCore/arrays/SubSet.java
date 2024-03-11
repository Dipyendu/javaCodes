// Time Complexity -> O(n * 2^n) [n = no of subjects]
// Space Complexity -> O(2^n * n) [2^n = total subsets, n = space taken by each subset]

// When you find a duplicate element, only add it in two newly created subset of previous step
// Because of above point duplicates have to be together [Sort the array]

package javaCore.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {

        int[] set1 = {2, 1, 2};
        List<List<Integer>> ans = subSets(set1);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }

        int[] set2 = {2, 1, 2};
        List<List<Integer>> ans2 = subSets(set2);
        for (List<Integer> list : ans2) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> subSets(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static List<List<Integer>> subSetsDuplicates(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
//            if current and previous element is same, s = e + 1
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
