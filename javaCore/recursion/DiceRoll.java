package javaCore.recursion;

import java.util.ArrayList;

public class DiceRoll {
    public static void main(String[] args) {
        int target = 6;
        System.out.println(diceRoll("", target));
    }

    public static ArrayList<String> diceRoll(String processed, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceRoll(processed + i, target - i));
        }
        return list;
    }
}
