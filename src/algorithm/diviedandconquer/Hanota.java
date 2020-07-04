package algorithm.diviedandconquer;

public class Hanota {
    public static void main(String[] args) {
        hanotaTower(5,'A','B','C');
    }
    /**
     * 汉诺塔的移动方法
     *
     * 使用分治算法
     */

    public static void hanotaTower(int num , char a , char b , char c){
        // 如果只有一个盘
        if (num == 1){
            System.out.println("第1个盘从 "+a+"->"+c);
        }
        else {
            hanotaTower(num-1,a,c,b);
            System.out.println("第"+num+"个盘从 "+a+"->"+b);
            hanotaTower(num-1,b,a,c);

        }
    }
}
