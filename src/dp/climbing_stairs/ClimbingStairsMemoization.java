package dp.climbing_stairs;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairsMemoization implements ClimbingStairs{

    Map<Integer, Integer> memo = new HashMap();

    @Override
    public int climb(int n) {

        if(n==0){
            return 1;
        }

        if(n<0){
            return 0;
        }

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        int ways = climb(n-1) + climb(n-2);
        memo.put(n,ways);

        return ways;
    }
}
