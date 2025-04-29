package binarySearch;

public class FirstANdLastPosition {
    public static void main(String[] args) {
        System.out.println(searchRange(new int[]{1,2,3},2));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] pos = new int[]{-1,-1};
        if(nums.length == 0){
            return pos;
        }
        int end = nums.length-1;
        int start= 0;
        int mid =0;

        while(start <= end){
            mid = start + (end - start) /2 ;
            if(nums[mid] == target){
                break;
            }else
           if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        if(nums[mid] != target){
            return pos;
        }
        start = mid;
        end = mid;

        while(true){
            if(start > 0 && nums[start-1] == nums[mid]){
                start--;
            }else if(end < nums.length -1 && nums[end+1] == nums[mid]){
                end++;
            }else{
                pos[0] = start;
                pos[1] = end;
                return pos;
            }
        }
    }
}
