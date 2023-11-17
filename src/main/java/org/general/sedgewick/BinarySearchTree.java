package org.general.sedgewick;

public class BinarySearchTree<K extends Comparable<K>, V> {
    private Node<K, V> root;
    private int size = 0;

    static class Node<K extends Comparable<K>, V> implements Comparable<Node<K, V>> {
        int size = 1;
        K key;
        V val;
        Node<K, V> left;
        Node<K, V> right;

        public Node(K key, V val, Node<K, V> left, Node<K, V> right) {
            this.key = key;
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(Node<K, V> o) {
            return this.key.compareTo(o.key);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "size=" + size +
                    ", key=" + key +
                    ", val=" + val;
        }
    }

    public V get(K key) {
        Node<K, V> node = getNode(key, root);
        if (node == null) {
            return null;
        }
        return node.val;
    }

    private Node<K, V> getNode(K key, Node<K, V> node) {
        if (node == null) {
            return null;
        }

        int comparison = key.compareTo(node.key);
        if (comparison == 0) {
            return node;
        } else if (comparison > 0) {
            return getNode(key, node.right);
        } else {
            return getNode(key, node.left);
        }
    }

    public boolean insert(K key, V val) {
        Node<K, V> newNode = new Node<>(key, val, null, null);
        if (root == null) {
            root = newNode;
            return true;
        } else {
            return insert(newNode, root);
        }
    }

    private boolean insert(Node<K, V> newNode, Node<K, V> node) {
        int comparison = newNode.compareTo(node);
        if (comparison > 0) {
            if (node.right == null) {
                node.right = newNode;
                node.size++;
                return true;
            } else {
                if (insert(newNode, node.right)) {
                    node.size++;
                    return true;
                };
                return false;
            }
        } else if (comparison < 0) {
            if (node.left == null) {
                node.left = newNode;
                node.size++;
                return true;
            } else {
                if (insert(newNode, node.left)) {
                    node.size++;
                    return true;
                };
                return false;
            }
        } else {
            V currVal = node.val;
            if (!newNode.val.equals(currVal)) {
                node.val = newNode.val;
                return false;
            }
            return false;
        }
    }
}
