package arrays;

import java.util.ArrayList;

public class TwoDArrayListExample {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // -> Initializing the rows in 2D ArrayList
        System.out.println(list); // -> Printing the ArrayList

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>()); // Initializing the columns in 2D ArrayList
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                list.get(i).add(j); // -> Adding elements in each columns
            }
        }
        System.out.println(list);
    }
}
