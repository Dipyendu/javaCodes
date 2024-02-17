package leetCode;

public class Solution0345 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (isVowel(sb.charAt(start)) && isVowel(sb.charAt(end))) {
                swap(sb, start, end);
                start++;
                end--;
            } else if (!isVowel(sb.charAt(start))) {
                start++;
            } else if (!isVowel(sb.charAt(end))) {
                end--;
            }
        }
        s = sb.toString();
        return s;
    }

    public static void swap(StringBuilder sb, int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
