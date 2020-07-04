package algorithm.dynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        int num = 9;
        System.out.println(fibonacci.fibonacciByRecursiveAndMemory(num));
        System.out.println(fibonacci.fibonacciByDP(num));
    }

    public int[] memo;
    // 使用递归实现斐波那契数列
    public int fibonacciByRecursive(int n){
        if (n == 0){
            return 0;
        }
        if ( n == 1 ){
            return 1;
        }
        int ret = fibonacciByRecursive(n-1)+fibonacciByRecursive(n-2);
        return ret;
    }
    /**
     *   使用递归实现斐波那契数列, 加上记忆备份，减少重复计算；
     *   因此需要一个启动函数。
     */
    public int fibonacciByRecursiveAndMemory(int n){
        memo = new int[n+1];
        return fibonacciByRecursive(n,memo);
    }
    public int fibonacciByRecursive(int n , int[] memo){
        if (n == 0){
            return 0;
        }
        if ( n == 1 ){
            return 1;
        }
        if (memo[n] != 0){
            return memo[n];
        }
        int ret = fibonacciByRecursive(n-1)+fibonacciByRecursive(n-2);
        memo[n] = ret;
        return ret;
    }

    /**
     * 以上两种方法据采用的是自顶向下的思考方式，
     * 如果采用自底向上的思考方式能实现斐波那契数列吗？
     *
     * 根据 fibonacci 数列的特点：
     * a0 = 0, a1 = 1, a2 = 1, a3 = 2, a4 = 3, a5 = 5, a6 = 8 ,....;
     * 通过数学归纳法可以得知：
     * f(n) = f(n-1) + f(n-2) , n >= 2; 这个公式也被称之为状态转移方程。
     */
    public int fibonacciByDP(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n ; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
