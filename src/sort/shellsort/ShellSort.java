package sort.shellsort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShellSort {
    private int[] arr;

    public ShellSort(int[] arr){
        this.arr = arr;
        sort();
       // print();
    }

    private void sort(){
        int len = arr.length;
        for (int gap = len/2; gap > 0 ;gap /= 2){
            for (int i = gap; i < len; i++){
                int j = i;
                int	inserted = arr[j];

                if (arr[j] < arr[i-gap]){
                    while ( j -gap >= 0 && inserted<arr[j - gap] ){
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = inserted;
                }

            }
        }

    }

    private void print(){
        System.out.println("希尔排序法"+ Arrays.toString(arr));
    }
}
