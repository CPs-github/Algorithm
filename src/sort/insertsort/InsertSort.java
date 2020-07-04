package sort.insertsort;

import java.util.Arrays;

public class InsertSort {
    private int[] arr;

    public InsertSort(int[] arr){
        this.arr = arr;
        sort();
     //   print();
    }

    public void sort(){
        for(int i = 1; i < arr.length; i++){
            //
            int min = arr[i];
            int index = i-1;

            /**
             * index >= 0 防止索引越界
             * arr[index]>min  找到值插入的索引位置。
             * arr[index+1] = arr[index] 将插入位置右边的的元素右移，在插入位置留出空位；
             * arr[index+1] = min; 将原数组的的第 i 个元素放入到空位中。
             */
            while (index >= 0 && arr[index]>min){
                arr[index+1] = arr[index];
                index--;
            }
            arr[index+1] = min;
        }
    }

    private void print(){
        System.out.println("插入排序法："+ Arrays.toString(arr));
    }
}
