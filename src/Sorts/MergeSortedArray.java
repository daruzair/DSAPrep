package Sorts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1,2,3,7,8,0,0,0},5,new int[] {2,5,6} ,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int[] res = new int[m+n];
        int p1=0;
        int p2=0;
        while(p2 < n){
            if(p1 < m && nums1[p1] < nums2[p2]){
                res[i] = nums1[p1];
                p1++;
            }else{
                res[i] = nums2[p2];
                p2++;
            }
            i++;
        }
        while(p1 < m){
            res[i] = nums1[p1];
            p1++;
            i++;
        }
        i=0;
        while(i < m+n){
            nums1[i] = res[i];
            i++;
        }

    }
}
