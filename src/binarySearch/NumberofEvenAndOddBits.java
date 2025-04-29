package binarySearch;

public class NumberofEvenAndOddBits {
    public int[] evenOddBit(int n) {
        int[] total = new int[2];
        int index=0;
        while(n>0){
            if((n & 1) == 1){
                total[index % 2] += 1;
            }
            n = n>>1;
            index++;
        }
        return total;

    }
}
