package coding_test.javaAlgorithmLecture.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BfsCalfFinding {

    /*
    * 설명
        현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
        현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면
        현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
        송아지는 움직이지 않고 제자리에 있다.
        현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
        최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.

    * 입력
        첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.

    * 출력
        점프의 최소 횟 수를 구한다. 답은 1이상이며 반드시 존재합니다.

    * 입력 예제
        5 14

    * 출력 예제
        3
    */

    public class Main {

        // s : 현수 좌표
        // e : 송아지 좌표
        static int bfs(int s, int e) {

            int[] dis = {1, -1, 5};
            int[] exsists;

            Queue<Integer> q = new LinkedList<>();

            exsists = new int[10001];
            exsists[s] = 1;
            q.offer(s);
            int level = 1;

            while (!q.isEmpty()) {
                int len = q.size();

                for (int i = 0; i < len; i++) {
                    int x = q.poll();
                    System.out.println("root : " + x);

                    for (int j = 0; j < dis.length; j++) {
                        int nx = x + dis[j];

                        if (nx >= 1 && nx <= 10000 && exsists[nx] != 1) {
                            if (nx == e) {
                                return level;
                            }
                            exsists[nx] = 1;
                            q.offer(nx);
                            System.out.println(nx);
                        }
                    }
                    System.out.println("end\n");
                }

                level++;
                System.out.println("level : " + level);
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();

        System.out.print(Main.bfs(s, e));
    }
}
