package dsa;

import dsa.sorting.BubbleSort;
import dsa.sorting.InsertinSort;
import dsa.sorting.SelectionSort;
import dsa.sorting.Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorting sort  = new SelectionSort();
        int[] sorted = sort.sortIntArray(new int[]{46,6,2,8,4,3,9,9,1,6});
        System.out.println(Arrays.toString(sorted));
    }
}
