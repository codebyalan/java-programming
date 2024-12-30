package dp.maximum_segment;

import java.util.HashMap;
import java.util.Map;

public class MaximumSegmentsTabular implements MaximumSegments {

    public int maxSegments(int n, int a, int b, int c) {
        int[] dp = new int[n + 1];
        dp[0] = 0; // Base case: zero length has zero segments

        // Iterate through each length from 1 to n
        for (int i = 1; i <= n; i++) {
            dp[i] = -1;
            if (i >= a && dp[i - a] != -1) {
                dp[i] = Math.max(dp[i], dp[i - a] + 1);
            }
            if (i >= b && dp[i - b] != -1) {
                dp[i] = Math.max(dp[i], dp[i - b] + 1);
            }
            if (i >= c && dp[i - c] != -1) {
                dp[i] = Math.max(dp[i], dp[i - c] + 1);
            }
        }
        return dp[n];
    }
}
