package binarySearch;

import java.util.Arrays;

public class FinMin {
    public static void main(String[] args) {
        int[] nums= new int[]{2,2,2,0,1,2};

        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int start =0;
        int end =  nums.length-1;
        int mid=0;
        while(start <  end){
            mid = start + (end - start)/2;

            if(nums[mid] > nums[end]){
                start = mid+1;
            }else if(nums[mid] < nums[end]){
                end = mid;
            }else{
                end--;
            }
        }

        return nums[start];
    }
}
