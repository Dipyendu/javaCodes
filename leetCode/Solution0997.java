package leetCode;

import java.util.HashSet;
import java.util.Set;

public class Solution0997 {
    public static void main(String[] args) {
        int n = 3;
        int[][] trust = {{1, 2}, {2, 3}};
        System.out.println(findJudge(n, trust));
        System.out.println(findJudgeOptimized(n, trust));
    }

    public static int findJudge(int n, int[][] trust) {
        if (trust.length == 0 && n > 1) {
            return -1;
        }
        int sum = (n * (n + 1)) / 2;
        Set<Integer> trustSet = new HashSet<>();
        for (int[] ints : trust) {
            trustSet.add(ints[0]);
        }
        Integer[] trustArray = trustSet.toArray(new Integer[0]);
        for (Integer integer : trustArray) {
            sum -= integer;
        }
        if (sum == 0) {
            return -1;
        }
        Set<Integer> linkedElementsWithSum = new HashSet<>();
        for (int[] ints : trust) {
            if (ints[1] == sum) {
                linkedElementsWithSum.add(ints[0]);
            }
        }
        if (trustSet.equals(linkedElementsWithSum)) {
            return sum;
        } else {
            return -1;
        }
    }

    public static int findJudgeOptimized(int n, int[][] trust) {
        if (n == 1 && trust.length == 0)
            return 1;
        int[] count = new int[n + 1];
        for (int[] ints : trust) {

            count[ints[0]]--;

            count[ints[1]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == n - 1)
                return i;
        }
        return -1;
    }
}
