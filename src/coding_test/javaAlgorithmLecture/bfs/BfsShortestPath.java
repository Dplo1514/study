package coding_test.javaAlgorithmLecture.bfs;


import java.util.LinkedList;
import java.util.Queue;

public class BfsShortestPath {

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

    private static int bfs(Node node) {
        int level = 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                System.out.println(current.data);
                if (current.left == null || current.right == null) {
                    return level;
                }

                queue.offer(current.left);
                queue.offer(current.right);
            }
            level++;
        }
        return level;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int result = bfs(root);
        System.out.println(result);
    }

}