package mathsForDSA;

public class CalculatePower {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        System.out.println(base+ "^" + power + ": " + calculatePower(base, power));
    }
    public static int calculatePower(int base, int power){
        int ans = 1;
        while (power > 0){
            if((power & 1) == 1){
                ans *= base;
            }
            base *= base;
            power>>=1;
        }
        return ans;
    }
}
