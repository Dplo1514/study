package coding_test.javaAlgorithmLecture.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    /*           이진 트리
                    1
            2               3
        4       5       6       7

        1. 레벨 탐색 순회 출력 : 1 2 3 4 5 6 7
    */

    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void bfs(Node root) {
        int level = 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                Node current = queue.poll();
                System.out.println(level + " : " + current.data);
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
        bfs(root);
    }
}
