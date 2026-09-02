package day11;

public class rowcolumn {

    public static void main(String[] args) {

        int row = 3;
        int cols = 3;

        int[][] dp = new int[row][cols];

       
        for (int j = 0; j < cols; j++) {
            dp[0][j] = 1;
        }

       
        for (int i = 0; i < row; i++) {
            dp[i][0] = 1;
        }

        
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        System.out.println("Number of paths = " + dp[row - 1][cols - 1]);
    }
}