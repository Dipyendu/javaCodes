package leetCode;

public class Solution136 {
    public static void main(String[] args) {
        int[] arr = {11,2,3,4,1,10,2,1,3,6,4,6,10};
        System.out.println("Answer ->" + singleAppearingDigit(arr));
    }
    public static int singleAppearingDigit(int[] arr){
        int unique = 0;

        for (int n:arr){
            unique ^=n;
        }
        return unique;
    }
}
