package algorithm.backtracking;

/**
 *  N 皇后问题
 */
public class NQueens {

    public static void main(String[] args) {

    }
    /**
     *  找到一种 所有皇后 聚能正确放置的解法
     * @param n 为皇后的个数
     */
    public int[][] sloveNQueens(int n){
        // 用一个 二维数组 来存放所有的的皇后, 放置皇后的位置为 1 ，其他位置为 0；
        int[][] grid = new int[n][n];

    }
    public void backTrack(int[][] grid , int index ){

        // 递归终止条件
        if(index == grid.length){
            return;
        }

        for(int i = 0; i < grid.length ; i++){

        }
    }


    /**
     * 判断是否满足皇后摆放的条件
     * @param grid
     * @param x
     * @param y
     * @return
     */
    public boolean isValid(int[][] grid , int x , int y){


        return true;
    }
}
