package p2;
import p1.Binary;

public class Convert{
    public static void main(String[] args){
        int decimal = 225;
        Binary a = new Binary();
        long b = a.ToBinary(decimal);
        System.out.println(b);
    }
}