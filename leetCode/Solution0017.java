package leetCode;

import java.util.ArrayList;

public class Solution0017 {
    public static void main(String[] args) {
        String digits = "78";
        System.out.println(letterCombinations(digits));
        System.out.println(letterCombinationsAlternative(digits));
    }

    public static ArrayList<String> letterCombinations(String digits) {
//        Edge Case
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return helper("", digits);
    }

    public static ArrayList<String> helper(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        int digit = unprocessed.charAt(0) - '0'; // This will convert '2' into 2

        ArrayList<String> list = new ArrayList<>();
//        Edge Case -> digit -> 7 or 8 or 9
        if (digit == 7) {
            for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(helper(processed + ch, unprocessed.substring(1)));
            }
        } else if (digit == 8) {
            for (int i = ((digit - 2) * 3) + 1; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(helper(processed + ch, unprocessed.substring(1)));
            }
        } else if (digit == 9) {
            for (int i = ((digit - 2) * 3) + 1; i <= ((digit - 1) * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                list.addAll(helper(processed + ch, unprocessed.substring(1)));
            }
        } else {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(helper(processed + ch, unprocessed.substring(1)));
            }
        }

        return list;
    }

    public static ArrayList<String> letterCombinationsAlternative(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        return helperAlternative("", digits, letters);
    }

    public static ArrayList<String> helperAlternative(String processed, String unprocessed, String[] letters) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        int digit = unprocessed.charAt(0) - '0';
        String chars = letters[digit];
        ArrayList<String> list = new ArrayList<>();
        for (char ch : chars.toCharArray()) {
            list.addAll(helperAlternative(processed + ch, unprocessed.substring(1), letters));
        }
        return list;
    }

}
