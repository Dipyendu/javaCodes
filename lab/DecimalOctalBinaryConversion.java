class DecimalToOctalConverter {
    private final int decimal;

    public DecimalToOctalConverter(int decimal) {
        this.decimal = decimal;
    }

    public int convert() {
        int octalNumber = 0, i = 1;
        int tempDecimal = decimal;
        while (tempDecimal != 0) {
            octalNumber += (tempDecimal % 8) * i;
            tempDecimal /= 8;
            i *= 10;
        }
        return octalNumber;
    }
}
class DecimalToBinaryConverter {
    private final int decimal;

    public DecimalToBinaryConverter(int decimal) {
        this.decimal = decimal;
    }

    public long convert() {
        long binaryNumber = 0;
        int remainder, i = 1;
        int tempDecimal = decimal;
        while (tempDecimal != 0) {
            remainder = tempDecimal % 2;
            tempDecimal /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }
}
public class DecimalOctalBinaryConversion {
    public static void main(String[] args) {
        int decimal1 = 78;
        int decimal2 = 123;

        DecimalToOctalConverter octalConverter1 = new DecimalToOctalConverter(decimal1);
        DecimalToBinaryConverter binaryConverter1 = new DecimalToBinaryConverter(decimal1);

        DecimalToOctalConverter octalConverter2 = new DecimalToOctalConverter(decimal2);
        DecimalToBinaryConverter binaryConverter2 = new DecimalToBinaryConverter(decimal2);

        System.out.printf("\nDecimal Number: %d\n", decimal1);
        System.out.println("\nDecimal to Octal");
        System.out.printf("%d in decimal = %d in octal%n", decimal1, octalConverter1.convert());
        System.out.println("\nDecimal to Binary");
        System.out.printf("%d in Decimal = %d in Binary%n", decimal1, binaryConverter1.convert());

        System.out.printf("\nDecimal Number: %d\n", decimal2);
        System.out.println("\nDecimal to Octal");
        System.out.printf("%d in decimal = %d in octal%n", decimal2, octalConverter2.convert());
        System.out.println("\nDecimal to Binary");
        System.out.printf("%d in Decimal = %d in Binary%n", decimal2, binaryConverter2.convert());
    }
}
