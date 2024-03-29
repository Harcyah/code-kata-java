package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem025Test {

    @Test
    void testProblem025() {
        Problem025 sut = new Problem025();
        assertEquals(12, sut.getFibonacciSequenceLength(3));
        assertEquals(4782, sut.getFibonacciSequenceLength(1000));
    }

}
