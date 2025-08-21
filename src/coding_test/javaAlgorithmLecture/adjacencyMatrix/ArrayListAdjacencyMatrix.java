package coding_test.javaAlgorithmLecture.adjacencyMatrix;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAdjacencyMatrix {

    /*
        방향 그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
        아래 그래프에서 1번 정점에서 5번 정점으로 가는 가지 수는
          [1] ←──→ [2] ──→ [5]
           ↓  ↘   ↙ ↑     ↗
           ↓  ↙   ↘ ↑  ↗
          [3] ←──→ [4]

        1. 1 2 3 4 5
        2. 1 2 5
        3. 1 3 4 2 5
        4. 1 3 4 5
        5. 1 4 2 5
        6. 1 4 5

        총 6가지 입니다.

        * 입력
            첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다.
            그 다음부터 M줄에 걸쳐 연결 정보가 주어진다.
        * 출력
            총 가지수를 출력한다.

        * 입력 예제
            5 9
            1 2
            1 3
            1 4
            2 1
            2 3
            2 5
            3 4
            4 2
            4 5
             >  정점 수 : 5 , 간선 수 9
             >  연결 정보 1 -> 2
             >  연결 정보 1 -> 3
             >  연결 정보 1 -> 4
             >  연결 정보 2 -> 1
             >  연결 정보 2 -> 3
             >  연결 정보 2 -> 5
             >  연결 정보 3 -> 4
             >  연결 정보 4 -> 2
             >  연결 정보 4 -> 5
        * 출력 예제
            6
     */

    static class Main {

        static int n = 0;
        static int m = 0;
        static int answer = 0;

        static ArrayList<ArrayList<Integer>> graph;
        static int[] ch;

        public static void dfs(int v) {
            if (v == n) {
                answer++;
            } else {
                for (int nv : graph.get(v)) {
                    if (ch[nv] == 0) {
                        ch[nv] = 1;
                        dfs(nv);
                        ch[nv] = 0;
                    }
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();   // Node 수
            m = sc.nextInt();   // Edge 수

            graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            // 방향 배열 생성
            /*  [
                    {2,3,4},
                    {1,3,5},
                    {4},
                    {2,5},
                ]
            */

            ch = new int[n + 1];
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                graph.get(a).add(b);
            }

            ch[1] = 1;
            Main.dfs(1);

            System.out.print(answer);
        }
    }
}