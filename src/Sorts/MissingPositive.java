package Sorts;

import java.util.ArrayList;
import java.util.List;

public class MissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{3,4,-1,1}));
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int c = nums[i] - 1;
            if(nums[i] > 0 && nums[i] < nums.length &&  i != c && nums[i]!=nums[c]){
                int t = nums[i];
                nums[i] = nums[c];
                nums[c]=t;
            }else{
                i++;
            }
        }
        for(i=0; i< nums.length;i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }


}
