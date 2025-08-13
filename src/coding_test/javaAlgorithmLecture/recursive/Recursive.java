package coding_test.javaAlgorithmLecture.recursive;

class Recursive {

    /*
        자연수 N이 입려되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램을 작성하세요
        * 입력 : 첫 번째 줄은 정수 N( 3<= N <= 10)이 입력된다.
        * 입력 예제 : 3
        * 출력 예제 : 1 2 3
    */
    private void recursive(int n) {
        if (n == 0) {
            return;
        } else {
            recursive(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Recursive T = new Recursive();
        T.recursive(3);
    }
}
