package p1;

public class Binary{
    public long ToBinary(int n){
        long binary = 0;
        int remainder = 0, i = 1;
        while(n != 0){
            remainder = n % 2;
            n /= 2;
            binary += remainder*i;
            i *= 10;
        }
        return binary;
    }
}