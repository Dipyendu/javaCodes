package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Solution0424 {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
        System.out.println(characterReplacementHashMap(s, k));
    }

    public static int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int ans = 0;
        int max = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            int index = s.charAt(j) - 'A';
            arr[index]++;
            max = Math.max(max, arr[index]);
            if (j - i + 1 - max > k) {
                arr[s.charAt(i) - 'A']--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        System.out.println(Arrays.toString(arr));
        return ans;
    }

    public static int characterReplacementHashMap(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int currentWindowLength;
        int maxWindowLength = 0;
        int maxFrequency = 0;
        int i = 0;
        int j = 0;
        while (j < n) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            currentWindowLength = j - i + 1;
//            maxFrequency = (Collections.max(map.values())); // more safe way to get max
            maxFrequency = Math.max(maxFrequency, map.get(s.charAt(j)));
            if (currentWindowLength - maxFrequency <= k) {
                j++;
                maxWindowLength = currentWindowLength;
            } else if (currentWindowLength - maxFrequency > k) {
                if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) > 0) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                }
                i++;
                j++;
            }
        }
        return maxWindowLength;
    }
}
