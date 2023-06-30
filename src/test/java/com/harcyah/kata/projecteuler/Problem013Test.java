package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem013Test {

    @Test
    void testProblem013() {
        Problem013 sut = new Problem013();
        assertEquals("5537376230", sut.getLargeSum());
    }

}
