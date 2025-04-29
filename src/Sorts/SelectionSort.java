package Sorts;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {0,1,3,4,5,2,1,-1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int max = getMaxIndex(arr, 0 ,arr.length -i -1);
            swap(arr, max, arr.length - i - 1);
        }
    }

    private static void swap(int[] arr, int max, int last) {
        int temp = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
