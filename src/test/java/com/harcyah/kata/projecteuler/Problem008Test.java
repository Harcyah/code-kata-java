package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem008Test {

    @Test
    void testProblem008() {
        Problem008 sut = new Problem008();
        assertEquals(23514624000L, sut.getLargestProductInSeries());
    }

}
