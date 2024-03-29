package com.harcyah.kata.codingbat.warmup1.every_nth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EveryNthTest {

    @Test
    void testEveryNth() {
        EveryNth everyNth = new EveryNth();
        assertEquals("Mrce", everyNth.everyNth("Miracle", 2));
        assertEquals("aceg", everyNth.everyNth("abcdefg", 2));
        assertEquals("adg", everyNth.everyNth("abcdefg", 3));
        assertEquals("Cca", everyNth.everyNth("Chocolate", 3));
        assertEquals("Ccas", everyNth.everyNth("Chocolates", 3));
        assertEquals("Coe", everyNth.everyNth("Chocolates", 4));
        assertEquals("C", everyNth.everyNth("Chocolates", 100));
    }

}
