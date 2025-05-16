package SortingAlgorithem;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9,8,97,6,545,6,8,6,4,68,89,54,1};
        SortDesending(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void SortAscending(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]){
                   min = j;
                }
            }
            var temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void SortDesending(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int MAx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[MAx] < arr[j]){
                    MAx = j;
                }
            }
            var temp = arr[i];
            arr[i] = arr[MAx];
            arr[MAx] = temp;
        }
    }
}
