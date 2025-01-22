package dp;

import dp.nth_catalan_number.CatalanNumber;
import dp.nth_catalan_number.CatalanNumberMemoization;
import dp.nth_catalan_number.CatalanNumberTabular;

public class Main {

    public static int minimumTotal(int[][] triangle) {
        int n = triangle.length;
        int[] dp = new int[n];

        // Initialize the dp array with the last row of the triangle
        for (int i = 0; i < n; i++) {
            dp[i] = triangle[n-1][i];
        }

        // Build the dp array from bottom to top
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = triangle[i][j] + Math.min(dp[j], dp[j + 1]);
            }
        }

        // The result is stored in dp[0]
        return dp[0];
    }
    public static void main(String[] args) {

        int[][] triangle = {
                {2},
                {3, 4},
                {6, 5, 7},
                {4, 1, 8, 3}
        };

        System.out.println("Minimum path sum: " + minimumTotal(triangle));

    }
}
