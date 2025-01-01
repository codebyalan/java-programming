package dp.climbing_stairs;

public class ClimbStairsRecursive implements ClimbingStairs{
    @Override
    public int climb(int n) {
        if(n==0)
            return 1;
        if (n < 0)
            return 0;
        return climb(n-1) + climb(n-2);
    }
}
