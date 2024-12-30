package dp.lucas_numbers;

import java.util.HashMap;
import java.util.Map;

public class LucasNumbersTabular implements LucasNumbers {

    @Override
    public int lucas(int n) {

        if (n == 0)
            return 2;
        else if (n == 1)
            return 1;
        int[] dp = new int[n+1];
        dp[0]=2;
        dp[1]=1;

        for (int i = 2; i<=n; i++)
            dp[i] = dp[i-1] + dp[i-2];

        return dp[n];
    }
}
