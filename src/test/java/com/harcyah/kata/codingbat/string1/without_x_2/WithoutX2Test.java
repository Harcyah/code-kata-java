package com.harcyah.kata.codingbat.string1.without_x_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WithoutX2Test {

    @Test
    void testWithoutX2() {
        WithoutX2 withoutX2 = new WithoutX2();
        assertEquals("Hi", withoutX2.withoutX2("xHi"));
        assertEquals("Hi", withoutX2.withoutX2("Hxi"));
        assertEquals("Hi", withoutX2.withoutX2("Hi"));
        assertEquals("Hi", withoutX2.withoutX2("xxHi"));
        assertEquals("Hix", withoutX2.withoutX2("Hix"));
        assertEquals("axb", withoutX2.withoutX2("xaxb"));
        assertEquals("", withoutX2.withoutX2("xx"));
        assertEquals("", withoutX2.withoutX2("x"));
        assertEquals("", withoutX2.withoutX2(""));
        assertEquals("Hello", withoutX2.withoutX2("Hello"));
        assertEquals("Hexllo", withoutX2.withoutX2("Hexllo"));
        assertEquals("Hxllo", withoutX2.withoutX2("xHxllo"));
    }

}
