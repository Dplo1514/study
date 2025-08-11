package algorithm.dynamicProgramming.Fibonacci;

public class FibonacciNaive implements Fibonacci{
    // Time : O(2^n) 지수 시간 알고리즘
    @Override
    public int fibonacci(int n) {
        if (n==0 || n==1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
