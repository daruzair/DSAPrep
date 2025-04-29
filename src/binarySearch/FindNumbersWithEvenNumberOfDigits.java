package binarySearch;

public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int evenNumberOfDigits = 0;
        for(int num: nums){
            if(hasEvenDigits(num)){
                evenNumberOfDigits++;
            }
        }
        return evenNumberOfDigits;
    }
    public static boolean hasEvenDigits(int num){
        int numberCount= 0;
        while(num > 0){
            num = num/10;
            numberCount++;
        }
        return numberCount % 2 == 0;
    }
}
