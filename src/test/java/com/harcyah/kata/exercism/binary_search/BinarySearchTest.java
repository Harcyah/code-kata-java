package com.harcyah.kata.exercism.binary_search;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    private static final List<Integer> EMPTY_LIST = List.of();
    private static final List<Integer> LIST_OF_UNIT_LENGTH = List.of(6);
    private static final List<Integer> SORTED_LIST = List.of(1, 3, 4, 6, 8, 9, 11);
    private static final List<Integer> SORTED_LIST_OF_ODD_LENGTH = List.of(1, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 634);
    private static final List<Integer> SORTED_LIST_OF_EVEN_LENGTH = List.of(1, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377);

    @Test
    void findsAValueInAnArrayWithOneElement() {
        BinarySearch<Integer> sut = new BinarySearch<>(LIST_OF_UNIT_LENGTH);
        final int value = 6;
        final int actual = sut.indexOf(value);
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void findsAValueInTheMiddleOfAnArray() {
        BinarySearch<Integer> sut = new BinarySearch<>(SORTED_LIST);
        final int value = 6;
        final int actual = sut.indexOf(value);
        final int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void findsAValueAtTheBeginningOfAnArray() {
        BinarySearch<Integer> sut = new BinarySearch<>(SORTED_LIST);
        final int value = 1;
        final int actual = sut.indexOf(value);
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void findsAValueAtTheEndOfAnArray() {
        BinarySearch<Integer> sut = new BinarySearch<>(SORTED_LIST);
        final int value = 11;
        final int actual = sut.indexOf(value);
        final int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void findsAValueInAnArrayOfOddLength() {
        BinarySearch<Integer> sut = new BinarySearch<>(SORTED_LIST_OF_ODD_LENGTH);
        final int value = 144;
        final int actual = sut.indexOf(value);
        final int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void findsAValueInAnArrayOfEvenLength() {
        BinarySearch<Integer> sut
                = new BinarySearch<>(SORTED_LIST_OF_EVEN_LENGTH);
        final int value = 21;
        final int actual = sut.indexOf(value);
        final int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void identifiesThatAValueIsNotIncludedInTheArray() {
        BinarySearch<Integer> sut = new BinarySearch<>(SORTED_LIST);
        final int value = 7;
        final int actual = sut.indexOf(value);
        final int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void valueSmallerThanTheArraysSmallestValueIsNotIncluded() {
        BinarySearch<Integer> sut = new BinarySearch<>(SORTED_LIST);
        final int value = 0;
        final int actual = sut.indexOf(value);
        final int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void valueLargerThanTheArraysSmallestValueIsNotIncluded() {
        BinarySearch<Integer> sut = new BinarySearch<>(SORTED_LIST);
        final int value = 13;
        final int actual = sut.indexOf(value);
        final int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void nothingIsIncludedInAnEmptyArray() {
        BinarySearch<Integer> sut = new BinarySearch<>(EMPTY_LIST);
        final int value = 1;
        final int actual = sut.indexOf(value);
        final int expected = -1;
        assertEquals(expected, actual);
    }

}
