package codewars;

public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    public static int solution(int number) {
        // TODO: Code stuff here
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count += i;
            }
        }
        return count;
    }
}
