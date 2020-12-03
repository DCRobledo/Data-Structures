package DS.Stack;

public class Stack {
    private class Node {
        private int data;
        private Node next;
        private Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.data;
    }

    public void push(int data) {
        Node node = new Node(data);

        if(isEmpty())
            top = node;
        else {
            node.next = top;
            top = node;
        }
    }

    public int pop() {
        top = top.next;

        return top.data;
    }
    
}
