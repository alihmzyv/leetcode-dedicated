package org.general.sedgewick;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class HashTableSepChaining<K, V> {
    private final int size;

    static class Node<K, V> {
        private K key;
        private V val;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    private final List<Node<K, V>>[] buckets;

    public HashTableSepChaining(int size) {
        this.size = size;
        this.buckets = (LinkedList<Node<K, V>>[]) new LinkedList[5];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public V put(K key, V val) {
        int hashOfKey = hash(key);
        List<Node<K, V>> bucket = buckets[hashOfKey];
        for (Node<K, V> node : bucket) {
            if (key.equals(node.key)) {
                V prev = node.val;
                node.val = val;
                return prev;
            }
        }
        bucket.add(new Node<>(key, val));
        return null;
    }

    public V get(K key) {
        int hash = hash(key);
        List<Node<K, V>> bucket = buckets[hash];
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.val;
            }
        }
        return null;
    }


    private int hash(K key) {
        return key.hashCode() % size;
    }
}
