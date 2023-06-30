package com.harcyah.kata.codingbat.warmup1.string_e;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringETest {

    @Test
    void testStringE() {
        StringE stringE = new StringE();
        assertTrue(stringE.stringE("Hello"));
        assertTrue(stringE.stringE("Heelle"));
        assertFalse(stringE.stringE("Heelele"));
        assertFalse(stringE.stringE("Hll"));
        assertTrue(stringE.stringE("e"));
        assertFalse(stringE.stringE(""));
    }

}
