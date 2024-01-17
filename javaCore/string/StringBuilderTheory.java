package string;

public class StringBuilderTheory {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);

        builder.deleteCharAt(1);
        System.out.println(builder);

        builder.repeat(builder, 2);
        System.out.println(builder);
    }
}
