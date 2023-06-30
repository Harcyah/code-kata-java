package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem056Test {

    @Test
    void testGetPowerfulDigitSum() {
        Problem056 sut = new Problem056();
        assertEquals(972L, sut.getPowerfulDigitSum());
    }

    @Test
    void testSumDigits() {
        Problem056 sut = new Problem056();
        assertEquals(4, sut.sumDigits("13"));
        assertEquals(1, sut.sumDigits("1000"));
    }

}
