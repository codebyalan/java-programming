package dsa.sorting;

public class SelectionSort implements Sorting{

    @Override
    public int[] sortIntArray(int[] arr) {

        for(int step = 0; step < arr.length - 1; step++){
            int minIndex = step;
            for (int i = step + 1; i < arr.length ; i++){
                if (arr[i] < arr[minIndex]){
                    minIndex = i;
                }
            }
                int temp = arr[minIndex];
                arr[minIndex] = arr[step];
                arr[step] = temp;
        }
        return arr;
    }
}
