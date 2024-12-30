package dp.lucas_numbers;

import java.util.HashMap;
import java.util.Map;

public class LucasNumbersMemoization implements LucasNumbers {
    Map<Integer, Integer> memo = new HashMap();

    @Override
    public int lucas(int n) {
        if (memo.containsKey(n))
            return memo.get(n);
        if (n == 0)
            return 2;
        if (n == 1)
            return 1;
        int value = lucas(n - 1) + lucas(n - 2);
        memo.put(n, value);
        return memo.get(n);
    }
}
