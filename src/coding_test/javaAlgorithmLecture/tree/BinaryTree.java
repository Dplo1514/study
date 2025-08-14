package coding_test.javaAlgorithmLecture.tree;

public class BinaryTree {

    /*           이진 트리
                    1
            2               3
        4       5       6       7

        1. 전위 순회 : 1 2 4 5 3 6 7
        2. 중위 순회 : 4 2 5 1 6 3 7
        3. 후위 순회 : 4 5 2 6 7 3 1
    */

    static class Node {

        private final int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // 전위 순회 혼자 개발해보기
    private void dfsPreorderTraversal_selfDevelop(Node root){
        if (root == null) return;

        if (root.left != null) {
            System.out.println(root.data);
            dfsPreorderTraversal_selfDevelop(root.left);

            if (root.right != null) {
                dfsPreorderTraversal_selfDevelop(root.right);
            }
        } else {
            System.out.println(root.data);
        }
    }

    // 강의 버전
    // 전위 순회
    private void dfsPreorderTraversal(Node root){
        if (root == null) {
            return;
        } else {
            System.out.print(root.data + " ");
            dfsPreorderTraversal(root.left);
            dfsPreorderTraversal(root.right);
        }
    }

    // 중위 순회
    private void dfsInorderTraversal(Node root){
        if (root == null) {
            return;
        } else {
            dfsInorderTraversal(root.left);
            System.out.print(root.data + " ");
            dfsInorderTraversal(root.right);
        }
    }

    // 후위 순회
    private void dfsPostorderTraversal(Node root){
        if (root == null) {
            return;
        } else {
            dfsPostorderTraversal(root.left);
            dfsPostorderTraversal(root.right);
            System.out.println(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = new BinaryTree.Node(1);

        root.left = new BinaryTree.Node(2);
        root.left.left = new BinaryTree.Node(4);
        root.left.right = new BinaryTree.Node(5);

        root.right = new BinaryTree.Node(3);
        root.right.left = new BinaryTree.Node(6);
        root.right.right = new BinaryTree.Node(7);

        tree.dfsInorderTraversal(root);
    }
}
