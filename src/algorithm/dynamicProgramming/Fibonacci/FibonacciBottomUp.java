package algorithm.dynamicProgramming.Fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FibonacciBottomUp implements Fibonacci {
    //Time : O(n) 선형 시간 알고리즘 , Space : O(n) || O(1) 상수 시간 알고리즘
    List<Integer> fibonacciList = new ArrayList<>(Arrays.asList(0, 1));

    @Override
    public int fibonacci(int n) {
        if (n == 0 || n == 1) return n;

        // 2 ~ n+1 까지의 배열을 만들어준다.

        IntStream.range(2, n + 1)
                .forEach(x -> {
                    int y = fibonacciList.get(x - 1) + fibonacciList.get(x - 2);
                    fibonacciList.add(y);
                });

        return fibonacciList.get(n);
    }
}
