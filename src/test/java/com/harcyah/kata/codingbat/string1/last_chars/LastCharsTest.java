package com.harcyah.kata.codingbat.string1.last_chars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LastCharsTest {

    @Test
    void testLastChars() {
        LastChars lastChars = new LastChars();
        assertEquals("ls", lastChars.lastChars("last", "chars"));
        assertEquals("ya", lastChars.lastChars("yo", "java"));
        assertEquals("h@", lastChars.lastChars("hi", ""));
        assertEquals("@o", lastChars.lastChars("", "hello"));
        assertEquals("@@", lastChars.lastChars("", ""));
        assertEquals("ki", lastChars.lastChars("kitten", "hi"));
        assertEquals("kp", lastChars.lastChars("k", "zip"));
        assertEquals("k@", lastChars.lastChars("kitten", ""));
        assertEquals("kp", lastChars.lastChars("kitten", "zip"));
    }

}
