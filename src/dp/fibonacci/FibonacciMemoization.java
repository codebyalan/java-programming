package dp.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoization implements Fibonacci{

    private Map<Integer,Integer> memo = new HashMap();

    @Override
    public int fib(int n){
        if(n<=1){
            return n;
        }
        if(!memo.containsKey(n)){
            memo.put(n,fib(n-1)+fib(n-2));
        }
        return memo.get(n);
    }

}
