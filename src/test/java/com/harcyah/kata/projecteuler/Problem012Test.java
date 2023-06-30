package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem012Test {

    @Test
    void testProblem012() {
        Problem012 sut = new Problem012();
        assertEquals(76576500L, sut.getHighlyDivisibleTriangularNumber());
    }

}
