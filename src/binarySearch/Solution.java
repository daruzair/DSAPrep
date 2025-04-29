package binarySearch;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenOddBit(2)));
    }
    public static int[] evenOddBit(int n) {
        int[] total = new int[2];
        boolean iseven=true;
        while(n>0){
            int lastBit = n & 1;
            n = n>>1;
            if(lastBit == 1){
                if(iseven){
                    total[0] += 1;
                }else{
                    total[1] += 1;
                }
            }
            iseven=!iseven;

        }
        return total;

    }
}