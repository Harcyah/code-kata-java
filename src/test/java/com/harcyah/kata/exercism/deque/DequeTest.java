package com.harcyah.kata.exercism.deque;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DequeTest {
    private Deque<Integer> subject;

    @BeforeEach
    void setUp() {
        subject = new Deque<>();
    }

    @Test
    void testPushPop() {
        subject.push(10);
        subject.push(20);
        assertThat(subject.pop()).isEqualTo(20);
        assertThat(subject.pop()).isEqualTo(10);
    }

    @Test
    void testPushShift() {
        subject.push(10);
        subject.push(20);
        assertThat(subject.shift()).isEqualTo(10);
        assertThat(subject.shift()).isEqualTo(20);
    }

    @Test
    void testUnshiftShift() {
        subject.unshift(10);
        subject.unshift(20);
        assertThat(subject.shift()).isEqualTo(20);
        assertThat(subject.shift()).isEqualTo(10);
    }

    @Test
    void testUnshiftPop() {
        subject.unshift(10);
        subject.unshift(20);
        assertThat(subject.pop()).isEqualTo(10);
        assertThat(subject.pop()).isEqualTo(20);
    }

    @Test
    void testExample() {
        subject.push(10);
        subject.push(20);
        assertThat(subject.pop()).isEqualTo(20);

        subject.push(30);
        assertThat(subject.shift()).isEqualTo(10);

        subject.unshift(40);
        subject.push(50);
        assertThat(subject.shift()).isEqualTo(40);
        assertThat(subject.pop()).isEqualTo(50);
        assertThat(subject.shift()).isEqualTo(30);
    }

}
