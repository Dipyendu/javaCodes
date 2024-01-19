public class Solution1672 {
    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 5 },
                { 7, 3 },
                { 3, 5 }
        };
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int rowMax = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sumRow += accounts[i][j];
            }
            rowMax = Math.max(rowMax, sumRow);
        }
        return rowMax;
    }
    // -> for i = 0 -> j = 0 -> accounts [0][0]; j = 1 -> accounts [0][1]
    // -> for i = 1 -> j = 0 -> accounts [1][0]; j = 1 -> accounts [1][1]
    // -> for i = 2 -> j = 0 -> accounts [2][0]; j = 1 -> accounts [2][1]
}
