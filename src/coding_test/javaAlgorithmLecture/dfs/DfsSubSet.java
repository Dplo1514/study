package coding_test.javaAlgorithmLecture.dfs;

public class DfsSubSet {


    /*
        자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분 집합을 모두 출력하는 프로그램을 작성하세요.
        * 입력 : 첫 번째 줄에 자연수 N(1<=N<=10이 주어집니다.
        * 출력 : 첫 번째 줄부터 각 줄에 하나씩 부분 집합을 아래의 출력 예제와 같은 순서로 출력한다, 단 공집합은 출력하지 않습니다.
        * 입력 예제 : 3
        * 출력 예제
          1 2 3
          1 2
          1 3
          1
          2 3
          2
          3
    */
    static int n;
    static int[] ch;

    public void dfs(int L) {
        if (L == n + 1) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    tmp.append(i).append(" ");
                }
            }
            if (!tmp.isEmpty()) {
                System.out.println(tmp);
            }
            return;
        } else {
            ch[L] = 1;     // 1로 마킹하며 출력 요소 표시
            dfs(L + 1); // DFS L
            ch[L] = 0;     // 0으로 마킹하여 미출력 요소 표시
            dfs(L + 1); // DFS R
        }
    }

    public static void main(String[] args) {
        DfsSubSet T = new DfsSubSet();
        n = 3;
        ch = new int[n + 1];
        T.dfs(1);

    }
}
