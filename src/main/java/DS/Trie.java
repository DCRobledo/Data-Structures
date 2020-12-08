package DS;

import java.util.HashMap;



public class Trie {
    public static final int ALPHABET_SIZE = 26;

    private class Node {
        private Node[] children = new Node[ALPHABET_SIZE];
        private boolean isCompleteWord;

        private Node() {
            for(int i = 0; i < ALPHABET_SIZE; i++) children[i] = null;
            isCompleteWord = false;
        }
    }

    public Node root;

    public boolean isEmpty(Node node) {
        for(int i = 0; i<ALPHABET_SIZE; i++)
            if(node.children[i] == null) return false;
        return true;
    }

    public void insert(String word) {
        int level;
        int length = word.length();
        int index;

        if(root == null) root = new Node();

        Node current = root;
        for(level = 0; level<length; level++) {
            index = word.charAt(level) - 'a';

            if(current.children[index] == null)
                current.children[index] = new Node();

            current = current.children[index];
        }

        current.isCompleteWord = true;
    }

    public boolean find(String word) {
        int level;
        int length = word.length();
        int index;

        Node current = root;
        for(level = 0; level<length; level++) {
            index = word.charAt(level) - 'a';

            if(current.children[index] == null) return false;

            current = current.children[index];
        }

        return (current != null && current.isCompleteWord);

    }

    public void delete(String word) {
        delete(root, word, 0);
    }

    public Node delete(Node root, String word, int index){
        if(root == null) return null;

        if(index == word.length()) {
            if(root.isCompleteWord) root.isCompleteWord = false;

            if(isEmpty(root)) root = null;

            return root;
        }

        int wordIndex = word.charAt(index) - 'a';
        root.children[wordIndex] = delete(root.children[wordIndex], word, index + 1);

        if(isEmpty(root) && !root.isCompleteWord) root = null;

        return root;
    }
}
