package BubbleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            boolean isswaped = false;
            for (int i = 1; i < arr.length - j; i++){
                if(arr[i-1] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    isswaped=true;
                }
            }
            if (!isswaped){
                break;
            }
        }
    }
}
