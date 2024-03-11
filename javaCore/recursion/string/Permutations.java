package javaCore.recursion.string;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "abbc";
        permutations("", str);
        System.out.println(permutationsList("", str));
        System.out.println(permutationsCount("", str));
    }

    public static void permutations(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i);
            permutations(first + ch + second, unprocessed.substring(1));
        }
    }

    static ArrayList<String> permutationsList(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0, i);
            String s = processed.substring(i);
            ans.addAll(permutationsList(f + ch + s, unprocessed.substring(1)));
        }
        return ans;
    }

    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
