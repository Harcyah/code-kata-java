package com.harcyah.kata.codingbat.string1.two_char;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoCharTest {

    @Test
    void testTwoChar() {
        TwoChar twoChar = new TwoChar();
        assertEquals("ja", twoChar.twoChar("java", 0));
        assertEquals("va", twoChar.twoChar("java", 2));
        assertEquals("ja", twoChar.twoChar("java", 3));
        assertEquals("ja", twoChar.twoChar("java", 4));
        assertEquals("ja", twoChar.twoChar("java", -1));
        assertEquals("He", twoChar.twoChar("Hello", 0));
        assertEquals("el", twoChar.twoChar("Hello", 1));
        assertEquals("He", twoChar.twoChar("Hello", 99));
        assertEquals("lo", twoChar.twoChar("Hello", 3));
        assertEquals("He", twoChar.twoChar("Hello", 4));
        assertEquals("He", twoChar.twoChar("Hello", 5));
        assertEquals("He", twoChar.twoChar("Hello", -7));
        assertEquals("He", twoChar.twoChar("Hello", 6));
        assertEquals("He", twoChar.twoChar("Hello", -1));
        assertEquals("ya", twoChar.twoChar("yay", 0));
    }

}
