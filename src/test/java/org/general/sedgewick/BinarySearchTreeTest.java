package org.general.sedgewick;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    BinarySearchTree<String, Integer> binarySearchTree = new BinarySearchTree<>();

    @Test
    void get() {
        binarySearchTree.insert("Ali", 2001);
        binarySearchTree.insert("Ahmad", 2005);
        binarySearchTree.insert("Anar", 2006);
        binarySearchTree.insert("Ali", 2007);
        binarySearchTree.insert("Hasan", 2008);
    }

    @Test
    void insert() {
    }
}