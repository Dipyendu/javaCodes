// problem link -> 

package codingNinjasStudio.basics;

import java.util.Scanner;

public class Solution0001 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            char ch = input.next().charAt(0);

            if (ch >= 'A' && ch <= 'Z') {
                System.out.println(1);
            } else if (ch >= 'a' && ch <= 'z') {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
    }
}