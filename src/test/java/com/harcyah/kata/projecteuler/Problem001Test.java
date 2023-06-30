package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem001Test {

    @Test
    void testProblem001() {
        Problem001 sut = new Problem001();
        assertEquals(23, sut.sumMultipleThreeAndFive(10));
        assertEquals(233168, sut.sumMultipleThreeAndFive(1000));
    }

}
