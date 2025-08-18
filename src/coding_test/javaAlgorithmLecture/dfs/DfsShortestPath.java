package coding_test.javaAlgorithmLecture.dfs;


import java.util.HashMap;
import java.util.Map;

public class DfsShortestPath {

    /* 아래 그림과 같은 이진 트리에서 루트 노드 1에서 말단 노드 까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하십시오
       각 경로의 길이는 루트 노드에서 말단 노드까지 가는데 이동하는 횟수를 즉 간선(에지)의 개수를 길이로 하겠습니다.
       가장 짧은 길이는 3번 노드까지의 길이인 1
                   트리

                    1
            2               3
        4       5

    */

    static class Node {

        long data;
        Node right;
        Node left;

        public Node(long data) {
            this.data = data;
        }
    }

    private static int dfs(int level, Node node) {
        if (node.left == null && node.right == null) {
            return level;
        }
        int leftMaxLevel = dfs(level + 1, node.left);
        int rightMaxLevel = dfs(level + 1, node.right);
        return Math.min(leftMaxLevel, rightMaxLevel);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int result = dfs(0, root);
        System.out.println("result = " + result);
    }

}