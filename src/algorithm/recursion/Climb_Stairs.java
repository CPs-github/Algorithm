package algorithm.recursion;

public class Climb_Stairs {
    public static void main(String[] args) {
        System.out.println(new Climb_Stairs().climbStairs(6));
    }

    public int climbStairs(int n){
        if (n == 1 || n == 2){
            return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
}
