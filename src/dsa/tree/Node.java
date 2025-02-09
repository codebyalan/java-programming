package dsa.tree;

public class Node<T> {
    T value;
    Node left, right;
    Node(T value){
        this.value = value;
        left = right = null;
    }
}
