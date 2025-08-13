package coding_test.javaAlgorithmLecture.recursive;

import java.util.ArrayList;
import java.util.List;

public class RecursiveFactorial {

    /*
        자연수 N이 입력되면 N! 를 구하는 프로그램을 작성하십시오
        에를 들어 5! = 5*4*3*2*1 = 120 입니다.
            * 입력 : 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
            * 출력 : 첫 번째 줄에 N팩토리얼 값을 출력합니다.
            * 입력 예제 : 5
            * 출력 예제 : 120
        팩토리얼
        1. n : 5    |   5 * fac(5-1)
        2. n : 4    |   4 * fac(4-1)
        3. n : 3    |   3 * fac(3-1)
        4. n : 2    |   2 * fac(2-1)
        5. n : 1    |   return 1
        6. 2 * fac(2-1) = 2
        7. 3 * fac(3-1) = 6
        8. 4 * fac(4-1) = 24
        9. 5 * fac(5-1) = 120
        */


    private int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        RecursiveFactorial T = new RecursiveFactorial();
        System.out.println(T.factorial(5));
    }
}
