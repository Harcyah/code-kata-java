package com.harcyah.kata.codingbat.string2.double_char;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoubleCharTest {

    @Test
    void testDoubleChar() {
        DoubleChar doubleChar = new DoubleChar();
        assertEquals("TThhee", doubleChar.doubleChar("The"));
        assertEquals("AAAAbbbb", doubleChar.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", doubleChar.doubleChar("Hi-There"));
        assertEquals("WWoorrdd!!", doubleChar.doubleChar("Word!"));
        assertEquals("!!!!", doubleChar.doubleChar("!!"));
        assertEquals("", doubleChar.doubleChar(""));
        assertEquals("aa", doubleChar.doubleChar("a"));
        assertEquals("..", doubleChar.doubleChar("."));
        assertEquals("aaaa", doubleChar.doubleChar("aa"));
    }

}
