package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem014Test {

    @Test
    void testProblem014() {
        Problem014 sut = new Problem014();
        assertEquals(837799, sut.getLongestCollatzSequence());
    }

}
