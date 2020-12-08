package DS;

import java.util.ArrayList;

public class HashTable<K, V> {
    public class Node<K, V> {
        public K key;
        public V value;
    
        Node<K, V> next;
    
        public Node(K key, V value) {
            this.key = key; this.value = value;
        }
    }
    
    public ArrayList<Node<K, V>> data;
    public int capacity;
    public int size;

    public HashTable(){
        data = new ArrayList<>();
        capacity = 10;
        size = 0;

        for(int i = 0; i<capacity; i++)
            data.add(null);
    }

    public int size() { return size; }
    public boolean isEmpty() { return size() == 0; }

    public int getHashCode(K key) { return key.hashCode(); }
    public int convertToIndex(int hashCode) { return hashCode % capacity; }

    public void add(K key, V value) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);

        Node<K, V> head = data.get(index);
        while(head != null) {
            if(head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        size++;
        head = data.get(index);
        Node<K, V> node = new Node<K, V>(key, value);
        node.next = head;
        data.set(index, node);

        if(size/capacity >= 0.7) {
            ArrayList<Node<K, V>> temp = data;
            data = new ArrayList<>();
            capacity *= 2;
            size = 0;
            for(int i = 0; i<capacity; i++)
                data.add(null);
            for(Node<K, V> current : temp){
                while (current != null) {
                    add((K) current.key, (V) current.value);
                    current = current.next;
                }
            }
        }
    }

    public V get(K key) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        Node<K, V> node = data.get(index);

        while(node != null){
            if(node.key.equals(key))
                return node.value;
            node = node.next;
        }

        return null;
    }

    public V remove(K key) {
        int index = convertToIndex(getHashCode(key));
        Node<K, V> node = data.get(index);
        Node<K, V> prev = null;

        while(node != null) {
            if(node.key.equals(key)) break;

            prev = node;
            node = node.next;
        }

        if(node == null) return null;

        size--;

        if(prev != null) prev.next = node.next;
        else data.set(index, node.next);

        return node.value;
    }
}
