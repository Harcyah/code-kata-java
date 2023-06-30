package com.harcyah.kata.exercism.trinary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrinaryTest {
    @Test
    void testNonTrinaryCharacterIsZero() {
        assertEquals(0, Trinary.toDecimal("-"));
    }

    @Test
    void testNonTrinaryNumberIsZero() {
        assertEquals(0, Trinary.toDecimal("3"));
    }

    @Test
    void testTrinaryWithNonTrinaryIsZero() {
        assertEquals(0, Trinary.toDecimal("102-12"));
    }

    @Test
    void testTrinary() {
        assertEquals(302, Trinary.toDecimal("102012"));
    }

}
