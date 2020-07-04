package sort.selectsort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 2 ,1 ,5 , 0 };
        //selectsort(arr);
        new SelectSort(arr);
    }

    public static void selectsort(int[] arr){
        /**
         * 用逐步推导的方式，分析选择排序
         * 第一轮：原始数组 [ 2 , 1 , 5 ,0 ]
         * 第一次排序： [ 0 ,2 ,1 ,5 ]
         */

        // 第一轮；
        int minIndex = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){
                // 说明 min 不是 arr 中最小的数
                min = arr[i];
                minIndex = i;
            }
        }
        arr[minIndex] = arr[0];
        arr[0] = min;
        System.out.println("第一轮排序后："+Arrays.toString(arr));

        // 第2轮；
        minIndex = 1;
        min = arr[1];
        for (int i = 2; i < arr.length; i++){
            if (min < arr[i]){
                // 说明 min 不是 arr 中最小的数
                min = arr[i];
                minIndex = i;
            }
        }
        arr[minIndex] = arr[1];
        arr[1] = min;
        System.out.println("第二轮排序后："+Arrays.toString(arr));
    }
}
