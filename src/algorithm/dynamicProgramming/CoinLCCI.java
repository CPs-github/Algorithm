package algorithm.dynamicProgramming;

import java.util.Arrays;

public class CoinLCCI {

    public static void main(String[] args) {
        System.out.println(new CoinLCCI().waysToChange(11));
    }

    public int waysToChange(int n) {
        int[] coins = {1, 5, 10, 25};
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int j = 0; j < coins.length; j++) {
            for (int i = coins[j]; i <= n; i++) {
                dp[i] = dp[i] + dp[i - coins[j]];

            }
        }
        return dp[n];
    }
}
