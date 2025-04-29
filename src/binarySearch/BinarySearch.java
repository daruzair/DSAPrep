package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(BinarySearch(new int[]{1,2,3,4,5,6,7},7));
    }
    public static int BinarySearch(int[] nums, int target){
        int start = 0; int end = nums.length -1; int mid = 0;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
