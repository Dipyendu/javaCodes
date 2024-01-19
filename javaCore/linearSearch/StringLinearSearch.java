package linearSearch;

public class StringLinearSearch {
    public static void main(String[] args) {
        String name = "Dipyendu Das";
        char target = 'u';
        System.out.println(stringLinearSearch(name, target));
    }

    static boolean stringLinearSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        // -> Run a for loop
        for (int index = 0; index < str.length(); index++) {
            // -> Check for every element index if it is target
            int element = str.charAt(index);
            if (element == target) {
                return true;
            }
        }
        // -> If the target is not found, return -1
        return false;
    }
}
