package com.harcyah.kata.exercism.hexadecimal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HexadecimalTest {

    @Test
    void testOne() {
        int expected = 1;
        assertEquals(expected, Hexadecimal.toDecimal("1"));
    }

    @Test
    void testC() {
        int expected = 12;
        assertEquals(expected, Hexadecimal.toDecimal("c"));
    }

    @Test
    void test10() {
        int expected = 16;
        assertEquals(expected, Hexadecimal.toDecimal("10"));
    }

    @Test
    void testAf() {
        int expected = 175;
        assertEquals(expected, Hexadecimal.toDecimal("af"));
    }

    @Test
    void test100() {
        int expected = 256;
        assertEquals(expected, Hexadecimal.toDecimal("100"));
    }

    @Test
    void test19ace() {
        int expected = 105166;
        assertEquals(expected, Hexadecimal.toDecimal("19ace"));
    }

    @Test
    void testInvalid() {
        int expected = 0;
        assertEquals(expected, Hexadecimal.toDecimal("carrot"));
    }

    @Test
    void testBlack() {
        int expected = 0;
        assertEquals(expected, Hexadecimal.toDecimal("000000"));
    }

    @Test
    void testWhite() {
        int expected = 16777215;
        assertEquals(expected, Hexadecimal.toDecimal("ffffff"));
    }

    @Test
    void testYellow() {
        int expected = 16776960;
        assertEquals(expected, Hexadecimal.toDecimal("ffff00"));
    }

}
