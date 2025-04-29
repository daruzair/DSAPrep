package binarySearch;

public class FindMinInRotaded
{
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
    }
    public static int findMin(int[] nums) {

        int pivot = getPivot(nums);

        return nums[pivot];
    }
    public static int getPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
