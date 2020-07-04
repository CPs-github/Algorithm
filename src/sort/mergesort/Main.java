package sort.mergesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 7,6,8,4,3,9,1,2,5};
        new MergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
