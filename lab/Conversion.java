class Binary{
    public long ToBinary(int n){
        long binary = 0;
        int remainder = 0, i = 1;
        while(n != 0){
            remainder = n % 2;
            n = n / 2;
            binary = binary + (remainder * i);
            i = i * 10;
        }
        return binary;
    }
}

class Octal{
    public long ToOctal(int n){
        long octal = 0;
        int remainder = 0, i = 1;
        while(n != 0){
            remainder = n % 8;
            n = n / 8;
            octal = octal + (remainder * i);
            i = i * 10;
        }
        return octal;
    }
}

public class Conversion{
    public static void main(String[] args){
        int decimal = 225;
        Binary obj1 = new Binary();
        Octal obj2 = new Octal();
        long binary = obj1.ToBinary(decimal);
        long octal = obj2.ToOctal(decimal);
        System.out.println("Decimal:" + decimal);
        System.out.println("Binary:" + binary);
        System.out.println("Octal:" + octal);
    }
}