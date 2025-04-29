package Sorts;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 5, 3, 6,2,3,45,6,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

  private static void sort(int[] arr){
      for (int i = 1; i < arr.length; i++) {
          for (int j = i; j > 0; j--) {
              if(arr[j-1] > arr[j]){
                  swap(arr, j-1, j);
              }else{
                  break;
              }
          }
      }
  }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
