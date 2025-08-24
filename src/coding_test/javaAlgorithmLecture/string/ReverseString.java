package coding_test.javaAlgorithmLecture.string;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

    /*
        * 설명
            N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

        * 입력
            첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
            두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

        * 출력
            N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.

        * 입력 예제
            3
            good
            Time
            Big

        * 출력 예제
            doog
            emiT
            giB
     */
    public class Main {

        public static String reverse(String str) {
            Stack<Character> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            for (char character : str.toCharArray()) {
                stack.add(character);
            }
//            StringBuilder sb = new StringBuilder(str);
//            return sb.reverse().toString();

            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            return sb.toString();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int length = sc.nextInt();

            for (int i = 0; i < length; i++) {
                String result = Main.reverse(sc.next());
                System.out.println(result);
            }
        }
    }

}
