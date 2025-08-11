package algorithm.dynamicProgramming.Fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FibonacciRecursiveTopDown implements Fibonacci {
    // O(n)
    List<Integer> fibonacciList = new ArrayList<>(Arrays.asList(0, 1));

    @Override
    public int fibonacci(int n) {
        if (n < fibonacciList.size()) return fibonacciList.get(n);

        int result = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciList.add(result);

        // JVM Heap Memory Monitoring And Algorithm Hint
         Runtime.getRuntime().gc();
         long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
         System.out.println("used Memory : " + usedMemory + "Bytes ");

        return result;

    }

}
