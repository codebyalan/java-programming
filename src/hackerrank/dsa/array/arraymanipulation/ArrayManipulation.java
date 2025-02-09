package hackerrank.dsa.array.arraymanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArrayManipulation {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {

        List<Long> LLong = new ArrayList<>();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++){
            arr[i]=0;
        }

        for (List<Integer> k: queries){
            int s = k.get(1);
            int e = k.get(2);
            int value = k.get(3);
            for(int i = 0; i < n; i++){
                if( (s <= i) && (e >=i) ){
                    arr[i]+=value;
                }
            }
        }
        List<Integer> li = Arrays.asList(arr);

        return li.stream().max(Integer::compareTo).get();
    }

    public static void main(String[] args) {

    }
}
