package SortingAlgorithem;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9,8,7,10,11,4,5,6};
        SortAscending(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void SortAscending(int[] arr,int start,int end) {

        if(end<=start){
            return;
        }

        int i=start + 1;
        int j=end;
        int pivot = arr[start];

        while(i<j){
            while(arr[i] < pivot && i <= end-1){
                i++;
            }
            while(arr[j] > pivot  && j >= start+1){
                j--;
            }
            if(i<j){
                Swap(arr,i,j);
            }
        }
        Swap(arr,start,j);

        SortAscending(arr,start,j-1);
        SortAscending(arr,j+1,end);
    }
    private static void Swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
