package DS;
public class BST {
    private class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node root;

    public void insert(Node root, int value){
        if(this.root == null) {
            this.root = new Node(value);
            return;
        } 

        if(value <= root.data){
            if(root.left == null) root.left = new Node(value);
            else insert(root.left, value);
        }
        else {
            if(root.right == null) root.right = new Node(value);
            else insert(root.right, value);
        }
    }

    public boolean contains(Node root, int value){
        if(value == root.data) return true;

        if(value < root.data){
            if(root.left == null) return false;
            return contains(root.left, value);
        }

        else {
            if(root.right==null) return false;
            return contains(root.right, value);
        }
    }

    public void printInOrder(Node root) {
        if(root.left != null) printInOrder(root.left);

        System.out.println(root.data);

        if(root.right != null) printInOrder(root.right);
    }

    public boolean checkBST(Node root, int min, int max) {
        if(root == null) return true;

        if(root.data < min || root.data > max) return false;
        
        return checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data + 1, max);
    }

    public boolean checkBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

}
