import java.util.HashSet;
import java.util.Set;

public class Solution1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println("Answer -> " + checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        Set<Character> charSet = new HashSet<Character>();

        // Iterate through each character in the input sentence
        // -> sentence.toCharArray() -> Converts this string to a new character array
        for (char c : sentence.toCharArray()) {
            // Add lowercase letters to the set
            charSet.add(c);
        }

        // or another approach
        // Iterate through each character in the input sentence
        /*
         * for (int i = 0; i < sentence.length(); i++) {
         * // Add lowercase letters to the set
         * charSet.add(sentence.charAt(i));
         * }
         */

        // Check if the size of the set is 26 (all letters of the alphabet)
        return charSet.size() == 26;
    }
}
