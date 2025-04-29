package binarySearch;

public class searchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,3));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int[] arr : matrix){
            if(arr[arr.length-1] >= target){
                return searchInArray(arr,target);
            }
        }
        return false;
    }

    public static boolean searchInArray(int[] arr, int target) {
        int start =0; int end = arr.length-1; int mid = 0;

        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] > target ){
                end = mid - 1;
            }else if(arr[mid] < target ){
                start = mid + 1;
            }
            else{
                return true;
            }
        }

        return false;
    }
}
