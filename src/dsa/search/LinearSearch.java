package dsa.search;

public class LinearSearch implements Searching{
    @Override
    public int search(int[] arr, int item){
        for (int i = 0; i < arr.length; i++){
            if(arr[i]==item){
                return i + 1;
            }
        }
        return -1;
    }
}
