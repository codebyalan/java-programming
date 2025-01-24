package dsa.linkedlist;

class Node<T>{
    T data;
    Node next;
    Node(T value){
        this.data = value;
        this.next = null;
    }
}

public class  SingleLinkedList<T> {

    Node<Integer> head;


    static SingleLinkedList addNode(SingleLinkedList list,int value){
        Node<Integer> new_node = new Node(value);
        if (list.head == null) {
            list.head = new_node;
        }else {
            Node current = list.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;
        }
        return list;
    }

    static boolean removeFirstNodeNode(SingleLinkedList list){
        if (list.head != null) {
            list.head = list.head.next;
            return true;
        }else{
            return false;
        }
    }

    static boolean removeNode(SingleLinkedList<Integer> list,int value){
        Node<Integer> current = list.head;
        Node<Integer> prev = null;
        if (list.head == null) {
            return false;
        }
        else if(current.data == value){
            if (removeFirstNodeNode(list)){
                return true;
            }
        }else{
            while (current!=null && current.data !=value){
                prev=current;
                current = current.next;
            }
            if (current.data == value) {
                prev = current.next;
            }

        }
        return false;
    }

    static void printList(SingleLinkedList list){
        Node current = list.head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList();
        list = addNode(list,2);
        list = addNode(list,3);
        list = addNode(list,4);
        list = addNode(list,5);
        removeNode(list,3);
        printList(list);
    }

}
