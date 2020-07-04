package sort.selectsort;

import java.util.Arrays;

/**
 *  选择排序法
 */
public class SelectSort {

    private  int[] arr;
    public  SelectSort(int[] arr){
        this.arr = arr;
        sort();
    }

    public void sort(){
        for (int i = 0; i < arr.length; i++){
            int min = arr[i];
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++){
                if (min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

            //System.out.println("第"+(i+1)+"次排序后："+Arrays.toString(arr));
        }
    }
}
