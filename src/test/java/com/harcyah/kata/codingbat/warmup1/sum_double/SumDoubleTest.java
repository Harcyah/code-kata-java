package com.harcyah.kata.codingbat.warmup1.sum_double;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumDoubleTest {

    @Test
    void testSumDouble() {
        SumDouble sumDouble = new SumDouble();
        assertEquals(3, sumDouble.sumDouble(1, 2));
        assertEquals(5, sumDouble.sumDouble(3, 2));
        assertEquals(8, sumDouble.sumDouble(2, 2));
    }

}
