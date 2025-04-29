package binarySearch;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));

    }
    public static int mySqrt(int x) {
        int start = 0;
        int mid = 0;
        int end = x/2;

        if(x==0){
            return 0;
        }
        if(x <= 2){
            return 1;
        }

        while(start <= end){
            mid = start + (end - start) / 2;

            long sqr = (long)mid * mid;
            if(sqr == (long)x){
                return mid;
            }else if(sqr < (long)x){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }

        return Math.round(end);

    }
}
