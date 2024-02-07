package geeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

public class FindDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] arr = {0, 5, 4, 2, 0, 3, 0};
        System.out.println("Answer ->" + duplicates(arr, arr.length));
        System.out.println("Answer ->" + duplicatesInArrayOrder(arr, arr.length));
        System.out.println("Answer ->" + duplicatesAnotherApproach(arr, arr.length));
    }

    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        // code here
        HashSet<Integer> nums = new HashSet<>();
        ArrayList<Integer> duplicatesList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums.contains(arr[i]) && !duplicatesList.contains(arr[i])) {
                duplicatesList.add(arr[i]);
            } else {
                nums.add(arr[i]);
            }
        }
        if (duplicatesList.isEmpty()) {
            duplicatesList.add(-1);
        }
        return duplicatesList;
    }

    public static ArrayList<Integer> duplicatesInArrayOrder(int[] arr, int n) {
        // code here
        Hashtable<Integer, Integer> nums = new Hashtable();
        ArrayList<Integer> duplicatesList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums.containsKey(arr[i])) {
                int oldValue = nums.get(arr[i]); // Get the current value
                nums.replace(arr[i], oldValue + 1);
            } else {
                nums.put(arr[i], 1);
            }
        }

        for (int num : nums.keySet()) {
            if (nums.get(num) > 1) {
                duplicatesList.add(num);
            }
        }
        if (duplicatesList.isEmpty()) {
            duplicatesList.add(-1);
        }
        return duplicatesList;
    }

    public static ArrayList<Integer> duplicatesAnotherApproach(int[] arr, int n) {
        // code here
        ArrayList<Integer> duplicatesList = new ArrayList<>();
        int[] visited = new int[n];
        Arrays.fill(visited, -1);
        System.out.println(Arrays.toString(visited));
        for (int i = 0; i < n; i++) {
            if (visited[arr[i]] == -1) {
                visited[arr[i]] = -10;
                System.out.println(i + "inside -1" + Arrays.toString(visited));
            } else if (visited[arr[i]] == -10) {
                visited[arr[i]] = arr[i];
                System.out.println(i + "inside -10" + Arrays.toString(visited));
            }
        }
        System.out.println(Arrays.toString(visited));
        for (int i = 0; i < n; i++) {
            if (visited[i] > -1) {
                duplicatesList.add(visited[i]);
            }
        }
        if (duplicatesList.isEmpty()) {
            duplicatesList.add(-1);
        }
        return duplicatesList;
    }
}
