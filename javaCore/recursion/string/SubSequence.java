package javaCore.recursion.string;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";
        subSequence("", str);
        System.out.println();

        ArrayList<String> subSequences1 = new ArrayList<>();
        subSequenceArrayList("", str, subSequences1);
        System.out.println(subSequences1);

        ArrayList<String> subSequences2 = new ArrayList<>();
        subSequenceArrayListASCII("", str, subSequences2);
        System.out.println(subSequences2);
    }

    //    printing all the possible substrings
    public static void subSequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.print("|\"" + processed + "\"|" + "\t");
            return;
        }

        char ch = unprocessed.charAt(0);
        subSequence(processed + ch, unprocessed.substring(1));
        subSequence(processed, unprocessed.substring(1));
    }

    //    ArrayList for all possible substrings
    public static void subSequenceArrayList(String processed, String unprocessed, ArrayList<String> subSequences) {
        if (unprocessed.isEmpty()) {
            subSequences.add(processed);
        } else {
            char ch = unprocessed.charAt(0);
            subSequenceArrayList(processed + ch, unprocessed.substring(1), subSequences);
            subSequenceArrayList(processed, unprocessed.substring(1), subSequences);
        }
    }

    //    Method for ArrayList of Ascii values of substrings
    public static void subSequenceArrayListASCII(String processed, String unprocessed, ArrayList<String> subSequences) {
        if (unprocessed.isEmpty()) {
            // Calculate ASCII value differently for non-numeric strings
            StringBuilder asciiSum = new StringBuilder();
            for (int ch : processed.toCharArray()) {
                asciiSum.append(ch);
            }
            subSequences.add(asciiSum.toString());
        } else {
            char ch = unprocessed.charAt(0);
            subSequenceArrayListASCII(processed + ch, unprocessed.substring(1), subSequences);
            subSequenceArrayListASCII(processed, unprocessed.substring(1), subSequences);
        }
    }
}
