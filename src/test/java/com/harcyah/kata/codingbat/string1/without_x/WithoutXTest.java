package com.harcyah.kata.codingbat.string1.without_x;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WithoutXTest {

    @Test
    void testWithoutX() {
        WithoutX withoutX = new WithoutX();
        assertEquals("Hi", withoutX.withoutX("xHix"));
        assertEquals("Hi", withoutX.withoutX("xHi"));
        assertEquals("Hxi", withoutX.withoutX("Hxix"));
        assertEquals("Hi", withoutX.withoutX("Hi"));
        assertEquals("xHi", withoutX.withoutX("xxHi"));
        assertEquals("Hi", withoutX.withoutX("Hix"));
        assertEquals("axb", withoutX.withoutX("xaxbx"));
        assertEquals("", withoutX.withoutX("xx"));
        assertEquals("", withoutX.withoutX("x"));
        assertEquals("", withoutX.withoutX(""));
        assertEquals("Hello", withoutX.withoutX("Hello"));
        assertEquals("Hexllo", withoutX.withoutX("Hexllo"));
    }

}
