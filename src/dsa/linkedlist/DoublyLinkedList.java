package dsa.linkedlist;

class DLLNode<T>{
    T value;
    DLLNode prev;
    DLLNode next;
    DLLNode(T value){
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList<T> {
    DLLNode<T> head;
    DLLNode<T> tail;
    public long count;

    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public void insertAtBeginning(T value){
        DLLNode<T> newNode = new DLLNode(value);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        count++;
    }
    public void deleteAtBeginning(){
        if (head != null){
            head=head.next;
            head.prev = null;
            count--;
        }
    }

    public void insertAtEnd(T value){
        DLLNode<T> newNode = new DLLNode(value);
        if(tail!=null){
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            count++;
        }else{
            insertAtBeginning(value);
        }

    }
    public void deleteAtEnd(){
        if(tail!=null){
            tail = tail.prev;
            tail.next = null;
            count--;
        }
    }

    public void traverseBackward(){
        DLLNode current = tail;
        System.out.print("Backward traversal: ");
        while (current!=null){
            System.out.print(current.value);
            if(current.prev!=null){
                System.out.print(" --> ");
            }
            current = current.prev;
        }
        System.out.println();
    }

    public void traverseForward(){
        DLLNode current = head;
        System.out.print("Forward traversal: ");
        while (current!=null){
            System.out.print(current.value);
            if(current.next!=null){
                System.out.print(" --> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList<Character> list  = new DoublyLinkedList();
        for (int i = 67; i < 80; i++) {
            list.insertAtEnd((char) i);
        }

        list.deleteAtEnd();
        list.deleteAtEnd();
        list.insertAtBeginning((char) 95);
        list.insertAtBeginning((char) 93);
        list.insertAtBeginning((char) 94);
        list.deleteAtBeginning();
        list.traverseBackward();
        list.traverseForward();

        System.out.println(list.count);

    }

}
