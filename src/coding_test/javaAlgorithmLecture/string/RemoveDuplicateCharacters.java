package coding_test.javaAlgorithmLecture.string;

import java.util.Scanner;

public class RemoveDuplicateCharacters {

    /*
        * 설명
            소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
            중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

        * 입력
            첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.

        * 출력
            첫 줄에 중복문자가 제거된 문자열을 출력합니다.

        * 입력 예제
            ksekkset

        * 출력 예제
            kset
    */

    public class Main {

        public static String removeDuplicatedChar(String str) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                // System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
                if (str.indexOf(str.charAt(i)) == i){
                    sb.append(str.charAt(i));
                }
            }
            return sb.toString();
        }
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            String input = in.next();

            String answer = Main.removeDuplicatedChar(input);
            System.out.println(answer);
        }
    }
}