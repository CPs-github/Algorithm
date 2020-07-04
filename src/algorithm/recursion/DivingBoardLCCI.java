package algorithm.recursion;

import java.util.Arrays;

public class DivingBoardLCCI {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new DivingBoardLCCI().divingBoard(1,2,3)));
    }

    public int[] divingBoard(int shorter, int longer, int k) {
        if ( k <1 ){
            return new int[0];
        }
        if(longer == shorter){
            return new int[]{shorter*k};
        }
        int[] rets = new int[k+1];
        for (int i = 0 ; i <= k ; i++){
            rets[i] = (k-i)*shorter + i*longer;
        }
        return rets;
    }


}
