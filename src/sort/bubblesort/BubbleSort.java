package sort.bubblesort;

public class BubbleSort {

    private int temp = 0;
    private int count = 0;
    private  int[] arr;
    public BubbleSort(int[] arr){
        this.arr = arr;
        sort();
       // print();
       // System.out.printf("执行了 %d 次\n",count);
    }

    private void sort(){
        boolean swapp = true;
        while(swapp){
            swapp = false;
            for (int j = 0; j<arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapp = true;
                }
            }
        }
    }
    private void print(){
        System.out.print("冒泡排序法：[ ");
        for (int i = 0 ;i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]\n");
    }
}
