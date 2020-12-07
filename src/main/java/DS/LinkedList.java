package DS;

public class LinkedList {
    private class Node{
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    public Node head;

    public void append(int data){
        if(head==null){
            head = new Node(data);
            return;
        }

        Node current = head;
        while(current.next != null)
            current = current.next;
        current.next = new Node(data);
    }

    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data){
        if(head == null) return;

        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;

        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public int get(int index) {
        int i = 0;
        Node current = head;

        while(i < index && current != null){
            current = current.next;
            i++;
        }
            

        return current.data;
    }
}
