package SortingAlgorithem;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,3,5,1,8,7,1,2};
        SortAscending(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void SortAscending(int[] arr){
        int i = 0;
        while(i < arr.length){
            int temp = arr[i];
            arr[i] = arr[temp-1];
            arr[temp-1] = temp;

            if(i == arr[i] - 1 || arr[i] == arr[arr[i]-1]){
                i++;
            }
        }
    }
    public static void SortDesending(int[] arr){
        int i = 0;
        while(i < arr.length){
            int temp = arr[i];
            arr[i] = arr[temp-1];
            arr[temp-1] = temp;

            if(i == arr[i] - 1 || arr[i] == arr[arr[i]-1]){
                i++;
            }
        }
    }
}
