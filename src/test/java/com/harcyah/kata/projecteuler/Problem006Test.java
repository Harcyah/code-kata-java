package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem006Test {

    @Test
    void testProblem006() {
        Problem006 sut = new Problem006();
        assertEquals(25164150L, sut.getSumSquareDifference());
    }

}
