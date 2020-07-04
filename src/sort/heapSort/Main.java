package sort.heapSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6,5,3,1,8,7,2,4};
        new HeapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
