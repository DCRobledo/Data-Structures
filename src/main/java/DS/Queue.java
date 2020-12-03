package DS;

public class Queue {
    private class Node {
        private int data;
        private Node next;
        private Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public int peek(){
        return head.data;
    }

    public void add(int data) {
        Node node = new Node(data);
        if(isEmpty())
            head = tail = node;

        else {
            tail.next = node;

            tail = node;
        } 
    }

    public int remove(){
        if(isEmpty())
            tail = null;

        Node node = head;

        head = head.next;

        return node.data;
    }

}
