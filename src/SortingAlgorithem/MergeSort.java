package SortingAlgorithem;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,3,2,56,7,8,9};
        SortAscending(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        SortDescending(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void SortAscending(int[] arr,int start,int end) {
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;
        SortAscending(arr, start , mid);
        SortAscending(arr, mid+1 , end);
        mergeAscending(arr,start,mid,end);
    }

    public static void SortDescending(int[] arr,int start,int end) {
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;
        SortDescending(arr, start , mid);
        SortDescending(arr, mid+1 , end);
        mergeDescending(arr,start,mid,end);
    }
    private static void mergeAscending(int[] arr, int start, int mid, int end) {
        int[] resarr = new int[end - start +1];
        int i=0;
        int p1 = start;
        int p2 = mid+1;
        while(p1 <= mid && p2 <= end){
            if(arr[p1] < arr[p2]){
                resarr[i] = arr[p1];
                p1++;
            }else{
                resarr[i] = arr[p2];
                p2++;
            }
            i++;
        }
        while(p1 <= mid){
            resarr[i] = arr[p1];
            p1++;
            i++;
        }
        while(p2 <= end){
            resarr[i] = arr[p2];
            p2++;
            i++;
        }
        i = 0;
        while(start <= end){
            arr[start] = resarr[i];
            start++;
            i++;
        }
    }
    private static void mergeDescending(int[] arr, int start, int mid, int end) {
        int[] resarr = new int[end - start +1];
        int i=0;
        int p1 = start;
        int p2 = mid+1;
        while(p1 <= mid && p2 <= end){
            if(arr[p1] > arr[p2]){
                resarr[i] = arr[p1];
                p1++;
            }else{
                resarr[i] = arr[p2];
                p2++;
            }
            i++;
        }
        while(p1 <= mid){
            resarr[i] = arr[p1];
            p1++;
            i++;
        }
        while(p2 <= end){
            resarr[i] = arr[p2];
            p2++;
            i++;
        }
        i = 0;
        while(start <= end){
            arr[start] = resarr[i];
            start++;
            i++;
        }
    }
}
