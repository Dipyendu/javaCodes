class Solution0009 {
    public static void main(String[] args) {
        int x = -121;
        System.out.println("Answer -> " + isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;
        int num = x;

        while (num > reversed) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return (num == reversed) || (num == reversed / 10);
    }
}