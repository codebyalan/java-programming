package dsa.search;

public class BinarySearch implements Searching{

    int binarySearch(int[] arr, int l, int r, int item){
        if( r > l ){
            int m = l + (r - l)/2;
            if(arr[m]==item){
                return m;
            }
            if (arr[m] > item) {
                binarySearch(arr,l,m-1,item);
            }else{
                binarySearch(arr,l,m+1,item);
            }
        }
        return -1;
    }

    @Override
    public int search(int[] arr, int item) {
        return 0;
    }
}
