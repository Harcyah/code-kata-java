package com.harcyah.kata.exercism.binary_search_tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BinarySearchTreeTest {

    @Test
    void dataIsRetained() {
        BinarySearchTree<Integer> sut = new BinarySearchTree<>();
        int actual = 4;
        sut.insert(actual);
        BinarySearchTree.Node<Integer> root = sut.getRoot();
        assertNotNull(root);
        int expected = root.getData();
        assertEquals(expected, actual);
    }

    @Test
    void insertsLess() {
        BinarySearchTree<Integer> sut = new BinarySearchTree<>();
        int expectedRoot = 4;
        int expectedLeft = 2;

        sut.insert(expectedRoot);
        sut.insert(expectedLeft);

        BinarySearchTree.Node<Integer> root = sut.getRoot();
        assertNotNull(root);
        BinarySearchTree.Node<Integer> left = root.getLeft();
        assertNotNull(left);

        int actualRoot = root.getData();
        int actualLeft = left.getData();
        assertEquals(expectedLeft, actualLeft);
        assertEquals(expectedRoot, actualRoot);
    }

    @Test
    void insertsSame() {
        BinarySearchTree<Integer> sut = new BinarySearchTree<>();
        int expectedRoot = 4;
        int expectedLeft = 4;

        sut.insert(expectedRoot);
        sut.insert(expectedLeft);

        BinarySearchTree.Node<Integer> root = sut.getRoot();
        assertNotNull(root);
        BinarySearchTree.Node<Integer> left = root.getLeft();
        assertNotNull(left);

        int actualRoot = root.getData();
        int actualLeft = left.getData();
        assertEquals(expectedLeft, actualLeft);
        assertEquals(expectedRoot, actualRoot);
    }

    @Test
    void insertsRight() {
        BinarySearchTree<Integer> sut = new BinarySearchTree<>();
        int expectedRoot = 4;
        int expectedRight = 5;

        sut.insert(expectedRoot);
        sut.insert(expectedRight);

        BinarySearchTree.Node<Integer> root = sut.getRoot();
        assertNotNull(root);
        BinarySearchTree.Node<Integer> right = root.getRight();
        assertNotNull(right);

        int actualRoot = root.getData();
        int actualRight = right.getData();
        assertEquals(expectedRight, actualRight);
        assertEquals(expectedRoot, actualRoot);
    }

    @Test
    void createsComplexTree() {
        BinarySearchTree<Integer> sut = new BinarySearchTree<>();
        List<Integer> expected = List.of(4, 2, 6, 1, 3, 5, 7);

        List<Integer> treeData = List.of(4, 2, 6, 1, 3, 7, 5);
        treeData.forEach(sut::insert);

        List<Integer> actual = sut.getAsLevelOrderList();
        assertEquals(expected, actual);
    }

    @Test
    void sortsSingleElement() {
        BinarySearchTree<Integer> sut = new BinarySearchTree<>();
        List<Integer> expected = List.of(4);

        sut.insert(4);

        List<Integer> actual = sut.getAsSortedList();
        assertEquals(expected, actual);
    }

    @Test
    void sortsCollectionOfTwoIfSecondInsertedIsSmallerThanFirst() {
        BinarySearchTree<Integer> sut = new BinarySearchTree<>();
        List<Integer> expected = List.of(2, 4);

        sut.insert(4);
        sut.insert(2);

        List<Integer> actual = sut.getAsSortedList();
        assertEquals(expected, actual);
    }

    @Test
    void sortsCollectionOfTwoIfSecondInsertedIsBiggerThanFirst() {
        BinarySearchTree<Integer> sut = new BinarySearchTree<>();
        List<Integer> expected = List.of(4, 5);

        sut.insert(4);
        sut.insert(5);

        List<Integer> actual = sut.getAsSortedList();
        assertEquals(expected, actual);
    }

    @Test
    void iteratesOverComplexTree() {
        BinarySearchTree<Integer> sut = new BinarySearchTree<>();
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7);

        List<Integer> treeData = List.of(4, 2, 1, 3, 6, 7, 5);
        treeData.forEach(sut::insert);

        List<Integer> actual = sut.getAsSortedList();
        assertEquals(expected, actual);
    }

}
