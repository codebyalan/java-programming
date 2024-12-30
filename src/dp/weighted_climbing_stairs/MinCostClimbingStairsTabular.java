package dp.weighted_climbing_stars;

public class MinCostClimbingStairsTabular implements  MinCostClimbingStairs{
    @Override
    public int minCostClimbingStairs(int[] costs) {
        int n = costs.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i<=n; i++){
            dp[i] = Math.min(dp[i-1] + costs[i-1], dp[i-2] + costs[i-2]);
        }
        return  dp[n];
    }
}
