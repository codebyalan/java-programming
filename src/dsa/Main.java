package dsa;

import dsa.search.LinearSearch;
import dsa.search.Searching;
import dsa.sorting.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Searching search  = new LinearSearch();
        int[] arr = new int[]{46,6,2,8,4,3,9,9,1,6};
        int index = search.search(arr, 0);
        if(index==-1){
            System.out.println("Item not found");

        }else {
            System.out.println("Item " + arr[index] + " found at " + index);
        }
    }
}
