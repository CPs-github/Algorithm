package search;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,-15,8,9,0,33,4};
        int[] arr1 = {1,2,3,4,5,6,7,8,10};
        System.out.println(binarySearch(arr1,11));
    }
    private static int seqSearch(int[] arr, int i){
        int position = 0;
        while (position < arr.length){
            if (i == arr[position]){
                return position;
            }
            position++;
        }
        return  -1;
    }
    public static int binarySearch(int[] arr , int value){
        int left = 0;
        int right = arr.length-1;
        int mid = (right + left)/2 ;

        while (true){
            if(left > right ){
                return  -1 ;
            }
            if (value < arr[mid]){
                right = mid-1;
                mid = (right + left)/2;
            }else if (value > arr[mid]){
                left = mid+1;
                mid = (right + left)/2;
            }else {
                return  mid;
            }
        }
    }
}
