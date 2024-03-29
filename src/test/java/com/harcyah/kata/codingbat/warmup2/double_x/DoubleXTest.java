package com.harcyah.kata.codingbat.warmup2.double_x;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DoubleXTest {

    @Test
    void testDoubleX() {
        DoubleX doubleX = new DoubleX();
        assertTrue(doubleX.doubleX("axxbb"));
        assertFalse(doubleX.doubleX("axaxax"));
        assertTrue(doubleX.doubleX("xxxxx"));
        assertFalse(doubleX.doubleX("xaxxx"));
        assertFalse(doubleX.doubleX("aaaax"));
        assertFalse(doubleX.doubleX(""));
        assertFalse(doubleX.doubleX("abc"));
        assertFalse(doubleX.doubleX("x"));
        assertTrue(doubleX.doubleX("xx"));
        assertFalse(doubleX.doubleX("xax"));
        assertFalse(doubleX.doubleX("xaxx"));
    }

}
