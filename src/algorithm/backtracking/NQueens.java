package algorithm.backtracking;

import java.util.Arrays;

/**
 * N 皇后问题
 */
public class NQueens {

    public static void main(String[] args) {
        int[][] grid = new NQueens().sloveNQueens(8);
        for (int i = 0; i < grid.length; i++) {
            System.out.println(Arrays.toString(grid[i]));
        }
    }

    /**
     * 找到一种 所有皇后 聚能正确放置的解法
     *
     * @param n 为皇后的个数
     */
    private static int[][] grid;

    public int[][] sloveNQueens(int n) {
        // 用一个 二维数组 来存放所有的的皇后, 放置皇后的位置为 1 ，其他位置为 0；
        grid = new int[n][n];

       // backTrack(grid, 0);
        System.out.println(backTracktoCount(grid,0,0));
        return grid;
    }

    /**
     * 找出一种满足规则的皇后放置即可
     *
     * @param grid
     * @param index
     * @return
     */
    public boolean backTrack(int[][] grid, int index) {

        // 递归终止条件
        if (index == grid.length) {
            //  System.out.println(Arrays.toString(grid[index-1]));
            return true;
        }

        for (int i = 0; i < grid.length; i++) {
            // 判断是否满足放置条件，不满足则跳过
            if (!this.isValid(grid, index, i)) {
                continue;
            }
            grid[index][i] = 1;
            if (backTrack(grid, index + 1)) {
                return true;
            } else {
                // 回溯
                grid[index][i] = 0;
            }

        }
        return false;
    }


    public int backTracktoCount(int[][] grid, int index, int ret) {

        // 递归终止条件
        if (index == grid.length) {
            ret++;

            return ret;
        }

        for (int i = 0; i < grid.length; i++) {
            // 判断是否满足放置条件，不满足则跳过
            if (!this.isValid(grid, index, i)) {
                continue;
            }
            grid[index][i] = 1;
            ret = backTracktoCount(grid, index + 1 ,ret);
            grid[index][i] = 0;


        }
        return ret;
    }

    /**
     * 判断是否满足皇后摆放的条件
     *
     * @param grid 摆放皇后的棋盘
     * @param x    棋盘的横坐标
     * @param y    棋盘的纵坐标
     * @return 如果满足皇后摆放的规则，则返回 true ； 否则，返回 false；
     */
    public boolean isValid(int[][] grid, int x, int y) {
        int len = grid.length;
        // 检查某一列是否有冲突
        for (int i = 0; i < len; i++) {
            if (grid[i][y] == 1) {
                return false;
            }
        }

        // 检查右上方是否有冲突
        for (int i = x - 1, j = y + 1; i >= 0 && j < len; i--, j++) {
            if (grid[i][j] == 1) {
                return false;
            }
        }

        // 检测左上方是否有冲突
        for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
            if (grid[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
