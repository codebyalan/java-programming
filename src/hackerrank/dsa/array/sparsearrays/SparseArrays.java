package hackerrank.dsa.array.sparsearrays;

import java.util.*;
import java.util.stream.Collectors;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        List<Integer> res = new ArrayList<>();

        for(String q: queries){
            int c = 0;
            for(String item: stringList){
                if(q.contentEquals(item)){
                    c+=1;
                }
            }
            res.add(c);
        }
        return res;
    }

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList(new String[]{"ab", "ab", "abc"}));
        List<String> queries = new ArrayList<>(Arrays.asList(new String[]{"ab", "abc", "bc"}));

        System.out.println(matchingStrings(stringList, queries));
    }
}
