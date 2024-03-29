package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem005Test {

    @Test
    void testGetSmallestPositiveNumberEvenlyDivisible10() {
        Problem005 sut = new Problem005();
        assertEquals(2520, sut.getSmallestPositiveNumberEvenlyDivisibleUnder10());
    }

    @Test
    void testGetSmallestPositiveNumberEvenlyDivisible20() {
        Problem005 problsutm = new Problem005();
        assertEquals(232792560, problsutm.getSmallestPositiveNumberEvenlyDivisibleUnder20());
    }

}
