package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem016Test {

    @Test
    void testProblem016() {
        Problem016 sut = new Problem016();
        assertEquals(26, sut.getPowerDigitSum(15));
        assertEquals(1366, sut.getPowerDigitSum(1000));
    }

}
