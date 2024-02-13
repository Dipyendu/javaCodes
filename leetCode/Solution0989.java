package leetCode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution0989 {
    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k = 34;
        System.out.println("Answer -> " + addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();

        // Convert the array to int
        BigInteger number = BigInteger.ZERO;
        int i = 0;
        for (int nums : num) {
            number = number.multiply(BigInteger.TEN).add(BigInteger.valueOf(nums));
        }

        // Do addition
        BigInteger sum = number.add(BigInteger.valueOf(k));

        // Take last digit of sum and append it into list
        while (!sum.equals(BigInteger.ZERO)) {
            list.add(sum.mod(BigInteger.TEN).intValue());
            sum = sum.divide(BigInteger.TEN);
        }

        // Reverse the list
        Collections.reverse(list);

        return list;
    }
}
