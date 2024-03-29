package com.harcyah.kata.codingbat.warmup1.missing_char;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingCharTest {

    @Test
    void testMissingChar() {
        MissingChar missingChar = new MissingChar();
        assertEquals("ktten", missingChar.missingChar("kitten", 1));
        assertEquals("itten", missingChar.missingChar("kitten", 0));
        assertEquals("kittn", missingChar.missingChar("kitten", 4));
        assertEquals("i", missingChar.missingChar("Hi", 0));
        assertEquals("H", missingChar.missingChar("Hi", 1));
        assertEquals("ode", missingChar.missingChar("code", 0));
        assertEquals("cde", missingChar.missingChar("code", 1));
        assertEquals("coe", missingChar.missingChar("code", 2));
        assertEquals("cod", missingChar.missingChar("code", 3));
        assertEquals("chocolat", missingChar.missingChar("chocolate", 8));
    }

}
