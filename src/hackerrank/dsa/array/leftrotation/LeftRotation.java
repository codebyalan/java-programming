package hackerrank.dsa.array.leftrotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeftRotation {

    private static int[] reverse(int[] arr) {
        int len = arr.length;
        int lme = arr[0];
        for (int i=0; i<len-1; i++){
            arr[i]=arr[i+1];
        }
        arr[len-1]=lme;
        return arr;
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {



        int[] intArr = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            intArr[i] = arr.get(i);
        }
        for(int i = 0; i < d; i++){
            intArr = reverse(intArr);
        }

        return Arrays.stream(intArr)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5}));

        List<Integer> result = rotateLeft(4, arr);
        int[] res = reverse(new int[] { 1, 2, 3, 4});
//        result.stream().forEach(i->System.out.println(i));
//        Arrays.stream(res).forEach(i->System.out.println(i));

        System.out.println(result);
    }
}
