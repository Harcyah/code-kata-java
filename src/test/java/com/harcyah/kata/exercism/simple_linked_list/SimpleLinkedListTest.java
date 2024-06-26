package com.harcyah.kata.exercism.simple_linked_list;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class SimpleLinkedListTest {

    @Test
    void newListIsEmpty() {
        SimpleLinkedList list = new SimpleLinkedList();
        assertThat(list.size()).isZero();
    }

    @Test
    void canCreateFromArray() {
        Integer[] values = new Integer[]{1, 2, 3};
        SimpleLinkedList list = new SimpleLinkedList(values);
        assertThat(list.size()).isEqualTo(3);
    }

    @Test
    void popOnEmptyListWillThrow() {
        SimpleLinkedList list = new SimpleLinkedList();
        assertThatThrownBy(list::pop)
            .isInstanceOf(NoSuchElementException.class);
    }

    @Test
    void popReturnsLastAddedElement() {
        SimpleLinkedList list = new SimpleLinkedList();
        list.push(9);
        list.push(8);
        assertThat(list.size()).isEqualTo(2);
        assertThat(list.pop()).isEqualTo(8);
        assertThat(list.pop()).isEqualTo(9);
        assertThat(list.size()).isZero();
    }

    @Test
    void reverseReversesList() {
        SimpleLinkedList list = new SimpleLinkedList();
        list.push(9);
        list.push(8);
        list.push(7);
        list.push(6);
        list.push(5);
        list.reverse();
        assertThat(list.pop()).isEqualTo(9);
        assertThat(list.pop()).isEqualTo(8);
        assertThat(list.pop()).isEqualTo(7);
        assertThat(list.pop()).isEqualTo(6);
        assertThat(list.pop()).isEqualTo(5);
    }

    @Test
    void canReturnListAsArray() {
        SimpleLinkedList list = new SimpleLinkedList();
        list.push(9);
        list.push(8);
        list.push(7);
        list.push(6);
        list.push(5);
        Integer[] expected = {5, 6, 7, 8, 9};
        assertThat(list.asArray(Integer.class)).containsExactly(expected);
    }

    @Test
    void canReturnEmptyListAsEmptyArray() {
        SimpleLinkedList list = new SimpleLinkedList();
        Object[] expected = {};
        assertThat(list.asArray(Object.class)).containsExactly(expected);
    }

}
