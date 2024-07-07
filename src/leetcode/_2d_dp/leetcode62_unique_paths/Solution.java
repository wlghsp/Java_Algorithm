package leetcode._2d_dp.leetcode62_unique_paths;

public class Solution {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int row = 0; row < m; row++) { // 마지막 행 초기화
            dp[row][n - 1] = 1;
        }

        for (int col = 0; col < n; col++) { // 마지막 열 초기화
            dp[m - 1][col] = 1;
        }

        for (int row = m - 2; row >= 0; row--) {
            for (int col = n - 2; col >= 0; col--) {
                dp[row][col] = dp[row + 1][col] + dp[row][col + 1];
            }
        }

        return dp[0][0];
    }
}
