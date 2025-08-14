package coding_test.javaAlgorithmLecture.recursive;

public class RecursiveBinaryNumber {
    /*
        10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.
        단 재귀 함수를 이용해서 출력해야 합니다.
            * 입력 : 첫 번째 줄에 10진수 N(1<=N<=1,000)이 주어집니다.
            * 입력 예제 : 11
            * 출력 예제 : 1011
        10진수 -> 2진수
            1. n이 0이 될 때 까지 2로 나눈 나머지를 역순으로 출력
            1-1. 11 % 2 = 5  [나머지 : 1]
            1-2. 5 % 2 = 2 [나머지 : 1]
            1-3. 2 % 2 = 1 [나머지 : 0]
            1-4. 1 % 2 = 0 [나머지 : 1]
        */
    private void toBinary(int n) {
        if (n == 0) {
            return;
        } else {
            toBinary(n/2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        RecursiveBinaryNumber T = new RecursiveBinaryNumber();
        T.toBinary(11);
    }
}
