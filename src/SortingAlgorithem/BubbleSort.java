package SortingAlgorithem;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        SortDesending(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void SortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSwaped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSwaped = true;
                }
            }
            if (!isSwaped) {
                break;
            }
        }
    }
    public static void SortDesending(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean isSwaped = false;
            for (int j = 1; j < arr.length - i ; j++) {
                if(arr[j-1] < arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSwaped = true;
                }
            }
            if (!isSwaped) {
                break;
            }
        }
    }
}
