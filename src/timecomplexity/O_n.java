package timecomplexity;


/**
 *  时间复杂度为: O(n)
 */
public class O_n {
    public static void main(String[] args) {
        System.out.println(sum(10) );
    }
    public static int sum( int n ){
        int ret = 0;
        for ( int i = 0; i < n ; i++){
            ret += i;
        }
        return ret;
    }
}
