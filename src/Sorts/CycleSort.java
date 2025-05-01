package Sorts;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {7,2,3,1,6,4,5};
        sort(arr);
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            var value = arr[arr[i]-1];
            arr[arr[i]-1] = arr[i];
            arr[i] = value;
        }
    }
}
