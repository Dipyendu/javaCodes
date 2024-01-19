import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1773 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println("Answer ->" + countMatches(items, ruleKey, ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        int count = 0;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        }
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}