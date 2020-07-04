package sort.heapSort;

public class HeapSort {
    private int[] arrs;

    public HeapSort(int[] arrs){
        this.arrs = arrs;
        sort();
    }
    private void sort(){
        //  1 构建大顶堆
        for (int i = arrs.length/2-1;i >= 0;i--){
            adjustHeap(arrs,i,arrs.length);
        }
        for (int j = arrs.length-1 ; j > 0;j--){
            swap(arrs,0,j);
            adjustHeap(arrs,0,j);
        }
    }

    /**
     *
     * @param arrs
     * @param i
     * @param length
     */
    private void adjustHeap(int[] arrs,int i, int length){

        int temp = arrs[i];
        for(int k = 2*i+1; k < length; k = k*2+1){
            //  从 i 节点的左子节点开始，也就是 2*i+1 处开始
            if (k+1 < length && arrs[k]<arrs[k+1]){
                //  若左子节点值小于右子节点的值，k 指向右子节点
                k++;
            }
            if(arrs[k]>temp){
                //  若左子节点的值大于父子节点的值，则将该子节点的值赋给父节点
                arrs[i] = arrs[k];
                i = k;
            }else {
                break;
            }
        }
        arrs[i] = temp;
    }

    private void swap (int[] arrs,int a,int b ){
        int temp = arrs[a];
        arrs[a] = arrs[b];
        arrs[b] = temp;
    }

}
