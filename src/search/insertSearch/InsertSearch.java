package search.insertSearch;

public class InsertSearch {

    int[] arr ;
    int value;

    public InsertSearch(int[] arr, int value){
        this.arr = arr;
        this.value = value;

    }
    public int search(){

        int left = 0;
        int right = arr.length-1;
        int mid = left + (value - arr[left])/(arr[right] - arr[left])*(right - left);

        while (true){
            System.out.println("------");
            if (left > right){
                return -1;
            }

            if (value < arr[mid]){
                right = mid-1;
                mid = left + (value - arr[left])/(arr[right] - arr[left])*(right - left);
            }else if (value > arr[mid]){
                left = mid + 1;
                mid = left + (value - arr[left])/(arr[right] - arr[left])*(right - left);
            }else{
                return mid;
            }
        }

    }
}
