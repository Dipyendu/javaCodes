package string;

public class StringPalindrome {
    public static void main(String[] args) {
        String string = "ab";
        System.out.println("Answer -> " + checkPalindrome(string));
    }

    public static String checkPalindrome(String string) {

        int start = 0;
        int end = string.length() - 1;

        while (start < end) {
            if (string.charAt(start) == string.charAt(end)) {
                start++;
                end--;
            } else {
                return "Not Palindrome";
            }
        }
        return "Palindrome";

    }
}
