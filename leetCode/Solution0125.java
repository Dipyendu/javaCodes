package leetCode;

public class Solution0125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Answer -> " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (Character.isLetterOrDigit(s.charAt(start)) && Character.isLetterOrDigit(s.charAt(end))) {
                if (Character.toLowerCase(s.charAt(start)) == Character.toLowerCase(s.charAt(end))) {
                    start++;
                    end--;
                } else {
                    return false;
                }
            }
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

        }
        return true;
    }

}
