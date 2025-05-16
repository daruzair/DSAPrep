package SortingAlgorithem;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,4,5,6,7,8,7,6,5,6,8};
        SortDesending(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void SortAscending(int[] arr){
        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0; j--) {
                if(arr[j-1] > arr[j]){
                  int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }

        }
    }
    public static void SortDesending(int[] arr){
        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0; j--) {
                if(arr[j-1] < arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }

        }
    }
}
