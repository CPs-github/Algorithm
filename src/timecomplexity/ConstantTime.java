package timecomplexity;

/**
 *  时间复杂度为常数
 */
public class ConstantTime {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        fun(a,b);
        System.out.println(a+" , "+b);
    }

    public static void fun(int a , int b){
        int t;
        t = a;
        a = b;
        b = t;
    }
}
