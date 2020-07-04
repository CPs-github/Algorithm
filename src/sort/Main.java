package sort;

import sort.bubblesort.BubbleSort;
import sort.heapSort.HeapSort;
import sort.insertsort.InsertSort;
import sort.quicksort.QuickSort;
import sort.radixsort.RadixSort;
import sort.selectsort.SelectSort;
import sort.shellsort.ShellSort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[8000000];
        for (int i = 0; i < 8000000; i++){
            arr[i] = (int) (Math.random()*8000000);
        }

        printTime();
        new HeapSort(arr);
   //     new RadixSort(arr);
 //     new QuickSort(arr); //90ms
 //      new SelectSort(arr); //3s
//       new InsertSort(arr);  //1s
//        new BubbleSort(arr);    //13s
      new ShellSort(arr);   //88ms
        printTime();
    }
    private static void printTime(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd: HH:mm:ss:SSS");
        String s = simpleDateFormat.format(date);
        System.out.println(s);
    }
}
