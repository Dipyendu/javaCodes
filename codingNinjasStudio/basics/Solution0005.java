/*
    Time complexity: O(N)
    Space complexity: O(1) 

    Where 1 represents the constant and 'N' reprents the "Nth" number .
*/

package codingNinjasStudio.basics;

import java.util.Scanner;

public class Solution0005 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int a = 0;
            int b = 1;
            int c;
            for (int i = 0; i < n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(a);
        }
    }

}
