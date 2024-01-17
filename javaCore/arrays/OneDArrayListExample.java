package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class OneDArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // -> declaring and initializing an 1D ArrayList
        list.add(51); // -> adding single elements one by one
        list.add(52);
        list.add(59);
        list.add(35);
        list.add(25);
        list.add(51);
        Collections.addAll(list, 23, 65, 23); // -> adding multiple elements
        System.out.println(list); // -> printing the whole list

        list.add(5, 20); // -> adding element at a certain index
        System.out.println(list);

        list.set(0, 99); // -> replacing element of a certain index
        System.out.println(list);

        System.out.println(list.get(3)); // -> printing element of any index
        System.out.println(list.get(list.size() - 1)); // -> printing last element

    }
}
