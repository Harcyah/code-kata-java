package com.harcyah.kata.codingbat.warmup2.string_x;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringXTest {

    @Test
    void testStringX() {
        StringX stringX = new StringX();
        assertEquals("xHix", stringX.stringX("xxHxix"));
        assertEquals("abcd", stringX.stringX("abxxxcd"));
        assertEquals("xabcdx", stringX.stringX("xabxxxcdx"));
        assertEquals("xKittenx", stringX.stringX("xKittenx"));
        assertEquals("Hello", stringX.stringX("Hello"));
        assertEquals("xx", stringX.stringX("xx"));
        assertEquals("x", stringX.stringX("x"));
        assertEquals("", stringX.stringX(""));
    }

}
