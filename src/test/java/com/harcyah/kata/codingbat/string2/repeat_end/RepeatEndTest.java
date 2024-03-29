package com.harcyah.kata.codingbat.string2.repeat_end;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatEndTest {

    @Test
    void testRepeatEnd() {
        RepeatEnd repeatEnd = new RepeatEnd();
        assertEquals("llollollo", repeatEnd.repeatEnd("Hello", 3));
        assertEquals("lolo", repeatEnd.repeatEnd("Hello", 2));
        assertEquals("o", repeatEnd.repeatEnd("Hello", 1));
        assertEquals("", repeatEnd.repeatEnd("Hello", 0));
        assertEquals("abcabcabc", repeatEnd.repeatEnd("abc", 3));
        assertEquals("3434", repeatEnd.repeatEnd("1234", 2));
        assertEquals("234234234", repeatEnd.repeatEnd("1234", 3));
        assertEquals("", repeatEnd.repeatEnd("", 0));
    }

}
