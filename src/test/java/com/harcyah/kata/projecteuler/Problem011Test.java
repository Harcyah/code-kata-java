package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem011Test {

    @Test
    void testProblem011() {
        Problem011 sut = new Problem011();
        assertEquals(70600674, sut.getLargestProductInGrid());
    }

}
