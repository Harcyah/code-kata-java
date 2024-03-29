package com.harcyah.kata.codingbat.string2.mix_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MixStringTest {

    @Test
    void testMixString() {
        MixString mixString = new MixString();
        assertEquals("axbycz", mixString.mixString("abc", "xyz"));
        assertEquals("HTihere", mixString.mixString("Hi", "There"));
        assertEquals("xTxhxexre", mixString.mixString("xxxx", "There"));
        assertEquals("xXxx", mixString.mixString("xxx", "X"));
        assertEquals("22/7 around", mixString.mixString("2/", "27 around"));
        assertEquals("Hello", mixString.mixString("", "Hello"));
        assertEquals("Abc", mixString.mixString("Abc", ""));
        assertEquals("", mixString.mixString("", ""));
        assertEquals("ab", mixString.mixString("a", "b"));
        assertEquals("abx", mixString.mixString("ax", "b"));
        assertEquals("abx", mixString.mixString("a", "bx"));
        assertEquals("SLoong", mixString.mixString("So", "Long"));
        assertEquals("LSoong", mixString.mixString("Long", "So"));
    }

}
