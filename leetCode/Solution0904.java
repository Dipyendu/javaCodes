package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Solution0904 {
    public static void main(String[] args) {
        int[] fruits = {1, 2, 1};
        System.out.println(totalFruit(fruits));
    }

    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = fruits.length;
        int i = 0;
        int j = 0;
        int maxLength = 0;
        while (j < n) {
            int intJ = fruits[j];
            int intI = fruits[i];
            map.put(intJ, map.getOrDefault(intJ, 0) + 1);
            int typesOfFruits = map.size();
            int windowLength = j - i + 1;
            if (typesOfFruits <= 2) {
                maxLength = Math.max(maxLength, windowLength);
                j++;
            } else if (typesOfFruits > 2) {
                map.put(intI, map.get(intI) - 1);
                if (map.get(intI) == 0) {
                    map.remove(intI);
                }
                i++;
                j++;
            }
        }
        return maxLength;
    }
}
