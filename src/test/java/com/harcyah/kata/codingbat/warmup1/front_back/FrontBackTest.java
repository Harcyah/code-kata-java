package com.harcyah.kata.codingbat.warmup1.front_back;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrontBackTest {

    @Test
    void testFrontBack() {
        FrontBack frontBack = new FrontBack();
        assertEquals("eodc", frontBack.frontBack("code"));
        assertEquals("a", frontBack.frontBack("a"));
        assertEquals("ba", frontBack.frontBack("ab"));
        assertEquals("cba", frontBack.frontBack("abc"));
        assertEquals("", frontBack.frontBack(""));
        assertEquals("ehocolatC", frontBack.frontBack("Chocolate"));
        assertEquals("Java", frontBack.frontBack("aavJ"));
        assertEquals("oellh", frontBack.frontBack("hello"));
    }

}
