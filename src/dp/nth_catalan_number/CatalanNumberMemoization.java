package dp.nth_catalan_number;

import java.util.HashMap;
import java.util.Map;

public class CatalanNumberMemoization implements CatalanNumber{

    Map<Integer, Long> memo = new HashMap();

    @Override
    public long getCatalan(int n) {
        if (n == 0) {
            return 1;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long catalan = 0;

        for (int i = 0; i < n; i++) {
            catalan += getCatalan(i) * getCatalan(n - i - 1);
        }

        memo.put(n, catalan);

        return catalan;
    }
}
