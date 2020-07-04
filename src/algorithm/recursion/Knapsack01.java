package algorithm.recursion;

import java.util.Map;

/**
 *  0-1 背包问题 暴力解法
 */
public class Knapsack01 {

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5};
        int[] values  = {9,3,18,5,6};
        int capacity = 5;
        System.out.println(new Knapsack01().knapsack01(weights,values,capacity));
    }

    public int knapsack01(int[] weights , int[] values , int capacity){
        int n = weights.length;

        return bestValue(weights,values,n-1,capacity);
    }

    public int bestValue( int[] weights, int[] values, int index , int capacity){

        if (index < 0 || capacity <= 0){
            return 0;
        }
        // 表示第 index 物品没有放进背包
        int ret = bestValue(weights,values,index-1,capacity);
        if(capacity >= weights[index]){
            ret = Math.max(ret,values[index] + bestValue(weights,values,index-1,capacity-weights[index]));
        }
        return ret;
    }
}
