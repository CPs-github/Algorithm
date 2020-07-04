package sort.quicksort;

import java.util.Arrays;

public class QuickSort {
    private int[] arr;
    //左右索引
    private int leftIndex ;
    private int rightIndex;

    public QuickSort(int[] arr){
        this.arr = arr;
        sort();

    }

    private void sort(){
        if (arr == null || arr.length == 0){
            return;
        }
        sort(arr,0,arr.length-1);
    }
    private void sort(int[] arr, int low, int high){
        if (low >= high) {
            return;
        }
        int l = low;
        int r = high;
        int index = arr[l]; // 取最左边的数作为基准数
        while(l < r){
            while (l < r && arr[r] >= index){
                r--;
            }
            if (l<r){
                arr[l++] = arr[r];
            }
            while (l < r && arr[l]< index ){
                l++;
            }
            if (l < r){
                arr[r--] = arr[l];

            }
        }
        arr[l] = index;
        sort(arr,low,l-1);
        sort(arr,l+1,high);
    }
    public void print(){
        System.out.println(Arrays.toString(arr));
    }
}
