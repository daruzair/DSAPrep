package binarySearch;

public class SearchInRotatedArry {
    public static void main(String[] args) {
        System.out.println(search(new int[]{2,3,4,5,6},7));
    }
    public static int search(int[] nums, int target) {
      int pivot = getPivot(nums);
      return SearchTarget(nums,pivot,target);
    }

    public static int getPivot(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        int mid=0;
        if(nums.length <= 1 ){
            return 0;
        }
        while(start < end){
            mid = start + (end - start)/2;

            if(nums[start] < nums[mid]){
                start = mid;
            }else if(nums[start] > nums[mid]){
                end = mid;
            }else{
                return end;
            }
        }
        return mid;
    }
    public static int SearchTarget(int[] nums,int pivot,int target) {
        int start = 0;
        int end = nums.length -1;

        if(nums[pivot] >= target && nums[0] <= target){
            end = pivot;
        }else{
            start = pivot+1;
        }
        int mid=0;
        while(start <= end){
            mid = start + (end - start)/2;

            if(nums[mid] < target){
                start = mid+1;
            }else if(nums[mid] > target){
                end = mid-1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
