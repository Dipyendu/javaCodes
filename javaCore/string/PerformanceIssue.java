package string;

public class PerformanceIssue {
    public static void main(String[] args) {
        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.println(ch);
            series += ch;
        }
        System.out.println(series);
        // -> this method is not optimal because it wastes memory
        // -> first series will point to "" then point to 'a' then point to 'ab' and
        // -> goes on
        // -> in this process String class will make the new String by creating a copy
        // of the existing String and add the character to it
        // -> list of created objects -> [ a, ab, abc, abcd ,...abc...xyz ] -> (1+ 2 + 3
        // -> + ... + n) = n ( n + 1 ) / 2
        // -> time complexity will be -> O ( n ^ 2 )
    }
}
