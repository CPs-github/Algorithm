package algorithm.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibonacci(6));
    }
    public int fibonacci(int n){
        // 先写出递归终止条件: f(0) = 0,f(1) = 1;
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
