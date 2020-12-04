package DS;

import java.util.HashMap;

public class Trie {
    private class Node {
        private HashMap<Character, Node> children;
        private String data;
        private boolean isCompleteWord;

        private boolean isEmpty() {
            return data == null;
        }
    }

    public Node root;

    public void insert(String word) {
        Node current = root;

        for(char character: word.toCharArray())
            current = current.children.computeIfAbsent(character, c -> new Node());
        
        current.isCompleteWord = true;
    }

    public boolean find(String word) {
        Node current = root;

        for(int i = 0; i<word.length(); i++){
            char character = word.charAt(i);
            Node node = current.children.get(character);
            if(node == null) return false;
            current = node;
        }

        return current.isCompleteWord;

    }

    public void delete(String word){
        delete(root, word, 0);
    }

    public boolean delete(Node current, String word, int index){
        if(index == word.length()) {
            if(!current.isCompleteWord) return false;
            current.isCompleteWord = false;
            return current.children.isEmpty();
        }

        char character = word.charAt(index);
        Node node = current.children.get(character);
        if(node == null) return false;

        boolean shouldDeleteCurrentNode = delete(node, word, index + 1) && !node.isCompleteWord;
        if(shouldDeleteCurrentNode) {
            current.children.remove(character);
            return current.children.isEmpty();
        }
        return false;
    }
}
