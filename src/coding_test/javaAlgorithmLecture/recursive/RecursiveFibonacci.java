package coding_test.javaAlgorithmLecture.recursive;

import java.util.Arrays;

public class RecursiveFibonacci {

    /*
        피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
        입력은 피보나치 수열의 총 항의 수 이다.
        에를 들어 5! = 5*4*3*2*1 = 120 입니다.
            * 입력 : 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
            * 출력 : 첫 줄에 피보나치 수열을 출력합니다.
            * 입력 예제 : 10
            * 출력 예제 : 1 1 2 3 5 8 13 21 34 55
        */
    static int[] result;

    // Basic Recursive
    private int fibonacci_1(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci_1(n - 2) + fibonacci_1(n - 1);
        }
    }

    // Memoization Recursive
    private int fibonacci_2(int n) {
        if (n == 1) {
            return result[1] = 1;
        } else if (n == 2) {
            return result[2] = 1;
        } else {
            return result[n] = fibonacci_2(n - 2) + fibonacci_2(n - 1);
        }
    }

    // DP Recursive
    private int fibonacci_3(int n) {
        if (result[n] > 0) {
            return result[n];
        }
        if (n == 1) {
            return result[1] = 1;
        } else if (n == 2) {
            return result[2] = 1;
        } else {
            return result[n] = fibonacci_3(n - 2) + fibonacci_3(n - 1);
        }
    }

    // List
    private void fibonacci_4(int n) {
        int[] arr = new int[n];
        int idx = 0;
        while (idx < n) {
            if (idx == 0 || idx == 1) {
                arr[idx] = 1;
            } else {
                arr[idx] = arr[idx - 2] + arr[idx - 1];
            }
            idx++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        RecursiveFibonacci T = new RecursiveFibonacci();
        int n = 10;
        result = new int[n + 1];
        T.fibonacci_3(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
