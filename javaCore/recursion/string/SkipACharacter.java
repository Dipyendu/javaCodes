package javaCore.recursion.string;

public class SkipACharacter {
    public static void main(String[] args) {
        String str = "baapplecdba";
        skip("", str);
        System.out.println(skipApple(str));

    }

    public static void skip(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'a') {
            skip(processed, unprocessed.substring(1));
        } else {
            skip(processed + ch, unprocessed.substring(1));
        }
    }

    public static String skipApple(String unprocessed) {
        if (unprocessed.isEmpty()) {
            return "";
        }
        if (unprocessed.startsWith("apple")) {
            return skipApple(unprocessed.substring("apple".length()));
        } else {
            return unprocessed.charAt(0) + skipApple(unprocessed.substring(1));
        }
    }
}
