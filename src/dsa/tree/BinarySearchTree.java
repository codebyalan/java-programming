package dsa.tree;

public class BinarySearchTree {

    class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public Node insert(Node root, int value){
        if (root == null) {
            return new Node(value);
        }
        if (root.value == value) {
            return root;
        }
        if (value < root.value) {
            root.left = insert(root.left, value);
        }else{
            root.right = insert(root.right, value);
        }
        return root;
    }

    void inorder(Node root){
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }

    void preorder(Node root){
        if (root != null) {
            System.out.print(root.value + " ");
            inorder(root.left);
            inorder(root.right);
        }
    }

    void postOrder(Node root){
        if (root != null) {
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.value + " ");
        }
    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        System.out.print("BST Implementation : ");
        Node root = null;
        root = tree.insert(root, 5);
        root = tree.insert(root, 7);
        root = tree.insert(root, 4);
        root = tree.insert(root, 6);
        root = tree.insert(root, 2);
        root = tree.insert(root, 8);
        root = tree.insert(root, 1);
        tree.postOrder(root);
    }

}
