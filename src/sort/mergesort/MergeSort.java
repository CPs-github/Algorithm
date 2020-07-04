package sort.mergesort;

import java.util.Arrays;

public class MergeSort {

    private int[] arr;

    public  MergeSort(int[] arr){
        this.arr = arr;
        mergesort(arr,0,arr.length-1);
    }
    private void mergesort(int[] arr, int left, int right){
        if (left < right){
            int mid = ( right - left)/2 + left;
            System.out.println("--"+Arrays.toString(arr));
            mergesort(arr,left,mid);        // 左半部分
            System.out.println("<<"+Arrays.toString(arr));
            mergesort(arr,mid+1,right); // 右半部分
            System.out.println("归并之前"+Arrays.toString(arr));
            merge(arr,left,mid,right);
        }
    }

    /**
     *  归并
     * @param arr
     * @param left
     * @param mid
     * @param right
     */
    private void merge(int[] arr, int left, int mid, int right){

        int[] temp = new int[right - left +1];  // 创建临时数组 temp 用于存放归并排序后的数据
        int t_left = left;                      // 获取数组的左右游标
        int t_mid = mid+1;                      // 获取数组的中点游标
        int index = 0  ;                        //  index 为 临时数组的游标
        /**
         *  归并：
         *
         */
        while (t_left <= mid && t_mid <= right){
            if(arr[t_left]<arr[t_mid]){
                temp[index] = arr[t_left];
                t_left++;
            }else {
                temp[index] = arr[t_mid];
                t_mid++;
            }
            index++;
        }
        /**
         *  当 上述步骤执行完后，若 mid 左边 或者 右边还剩有一部分数据，
         *  则将剩余的数据全部添加到 tenp 数组中。
         */
        while (t_mid <= right){
            //mid 右侧有剩余
            temp[index++] = arr[t_mid++];

        }
        while (t_left <= mid){
            // mid 左侧有剩余
            temp[index++] = arr[t_left++];
        }
        /**
         *  将 temp 数组中的数据一次赋给 arr 数组
         */
        System.out.println("temp length:" + temp.length);
        System.out.println(Arrays.toString(temp));
        for (int i = 0; i < temp.length; i++ ){
            arr[left] = temp[i];
            left++;
        }
    }


}
