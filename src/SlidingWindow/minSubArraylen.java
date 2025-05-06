package SlidingWindow;

public class minSubArraylen {
    public static void main(String[] args) {
        int[] nums=new int[]{5,1,3,5,10,7,4,9,2,8};
        System.out.println(minSubArrayLen(15,nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0; int right = 0;
        int minwindow = Integer.MAX_VALUE;
        int sum = nums[0];
        while(left <= right){
            if(sum >= target){
                minwindow = Math.min((right-left)+1,minwindow);
                sum -= nums[left];
                left++;

            }else if(right < nums.length-1){
                right++;
                sum += nums[right];

            }else{
                return minwindow;
            }
        }
        return minwindow == Integer.MAX_VALUE ? 0: minwindow;
    }
}
