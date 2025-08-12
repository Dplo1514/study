package algorithm.dynamicProgramming.Fibonacci;


public class Main {
    /*
        1. Main Task부터 Sub Task 순으로 순차적으로 Top Down하며 풀어나가는 Dynamic Programming 예제이다.
        2. 대표적인 Dynamic Programming 예제인 Fibonacci 수열을 구현한다.
        FibonacciNaive : Dynamic Programming을 적용하지 않음
        FibonacciRecursive : Top Down 방식의 Dynamic Programming을 적용
    */
    public static void main(String[] args) {

//        Fibonacci fibonacci = new FibonacciNaive();
        Fibonacci fibonacci = new FibonacciRecursiveTopDown();
//        Fibonacci fibonacci = new FibonacciBottomUp();

        // Naive    : 45 / 3488 ms   시/공간 O(2^n)
        // TopDown  : 45 / 13   ms   [ 100000 : StackOverflowError ] -> 시간 복잡도 O(n)                                   / 공간복잡도가 점점 증가하는 방식 O(n) -> O(n^2) -> O(2^n)
        // BottomUp : 45 / 15   ms   [ 100000 : 19 ms ]              -> 시간복잡도가 점점 증가하는 방식 O(n) -> O(n^2) -> O(2^n) / 공간 복잡도 O(n) , O(1)
        // Call Stack : 호출해야할 메서드들이 정의된 영역 , 메서드들이 실행중에 사용하는 메모리 영역 [ Stack ]

        int fibonacciTest = fibonacci.fibonacci(10000);
        System.out.println("fibonacciTest = " + fibonacciTest);
        equalsTest();
    }

    public static void equalsTest() {

        Fibonacci fibonacciNaive = new FibonacciNaive();
        Fibonacci fibonacciRecursiveTopDown = new FibonacciRecursiveTopDown();
        Fibonacci fibonacciBottomUp = new FibonacciBottomUp();

        int fibonacciNaiveTest = fibonacciNaive.fibonacci(10);
        int fibonacciBottomUpTest = fibonacciBottomUp.fibonacci(10);
        int fibonacciRecursiveTopDownTest = fibonacciRecursiveTopDown.fibonacci(10);

        assert fibonacciNaiveTest == fibonacciBottomUpTest : "Naive != BottomUp";
        assert fibonacciNaiveTest == fibonacciRecursiveTopDownTest : "Naive != TopDown";
        assert fibonacciBottomUpTest == fibonacciRecursiveTopDownTest : "BottomUp != Recursive";
    }
}
