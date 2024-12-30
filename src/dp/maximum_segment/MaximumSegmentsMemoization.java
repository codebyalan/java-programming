package dp.maximum_segment;

import java.util.HashMap;
import java.util.Map;

public class MaximumSegmentsMemoization implements MaximumSegments {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public int maxSegments(int n, int x, int y, int z) {
        if (n == 0) {
            return 0; // Base case: No segments for a rod of length 0
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int max = -1000000;
        // Consider cutting with each segment length (if possible)
        if (n >= x) {
            max = Math.max(max, 1 + maxSegments(n - x, x, y, z));
        }
        if (n >= y) {
            max = Math.max(max, 1 + maxSegments(n - y, x, y, z));
        }
        if (n >= z) {
            max = Math.max(max, 1 + maxSegments(n - z, x, y, z));
        }

        memo.put(n, max);
        return max;
    }
}
