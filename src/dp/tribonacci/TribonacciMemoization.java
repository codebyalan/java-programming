package dp.tribonacci;

import java.util.HashMap;
import java.util.Map;

public class TribonacciMemoization implements Tribonacci{
    Map<Integer, Integer> memo = new HashMap();

    @Override
    public int tibo(int n) {

        if(memo.containsKey(n))
            return memo.get(n);
        if (n==0)
            return 0;
        if (n==2 || n==1)
            return 1;

        int value = tibo(n-1) + tibo(n-2) + tibo(n-3);
        memo.put(n, value);

        return memo.get(n);
    }
}
