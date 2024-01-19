public class Solution0744 {
    public static void main(String[] args) {
        char[] nums = { 'c', 'f', 'j' };
        char target = 'a';
        System.out.println("Answer -> " + nextGreatestLetter(nums, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            System.out.printf("\nMid after Updation\n|\tStart -> %d\t|\tEnd -> %d\t|\tMid -> %d\t|\n", start, end, mid);

            if (target < letters[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

            System.out.printf("\nStart, End after if statements execution\n|\tStart -> %d\t|\tEnd -> %d\t|\tMid -> %d\t|\n", start, end, mid);
        }

        return letters[start % letters.length];
    }
}