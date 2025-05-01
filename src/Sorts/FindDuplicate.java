package Sorts;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[]{4,3,2,7,8,2,3,1}).toString());
    }
    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i] != i+1 && nums[i] != nums[nums[i]-1]){

                swap(nums, i, nums[i]-1);
            }else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<Integer>();

        for(i =0; i < nums.length; i++){
            if(nums[i] != i+1)
            {
                list.add(nums[i]);
            }
        }

        return list;
    }

    public static void swap(int[] nums , int first,int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second]= temp;
    }
}
