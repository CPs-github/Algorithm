package sort.radixsort;

import java.util.Arrays;

public class RadixSort {

    private int[][] bucket;
    private  int[] arr;

    private int[] bucketElementCounts = new int[10];  // 定义一个一维数组，用于记录每个桶中实际存放数据的个数

    public RadixSort(int[] arr){
        this.arr = arr;
        bucket = new int[10][arr.length];
        sort();
    }

    private void sort(){
        for (int i = 0,n=1; i < getMaxLength(); i++,n *= 10){
            for (int j = 0; j < arr.length; j++){
                int digitOfElement = arr[j] / n % 10;
                bucket[digitOfElement][bucketElementCounts[digitOfElement]++] = arr[j];
            }
            int index = 0;
            for (int k = 0; k < bucketElementCounts.length; k++){
                if (bucketElementCounts[k] != 0 ){
                    for (int m = 0; m < bucketElementCounts[k]; m++){
                        arr[index++] = bucket[k][m];
                    }
                }
                bucketElementCounts[k] = 0;
            }
          //  System.out.println("第"+(i+1)+"次排序："+ Arrays.toString(arr));
        }
    }
    private int getMaxLength(){
        int maxlength = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (maxlength <= arr[i]){
                maxlength = arr[i];
            }
        }
        return  (maxlength+"").length();
    }

}
