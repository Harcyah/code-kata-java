package com.harcyah.kata.codingbat.string1.non_start;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NonStartTest {

    @Test
    void testNonStart() {
        NonStart nonStart = new NonStart();
        assertEquals("ellohere", nonStart.nonStart("Hello", "There"));
        assertEquals("avaode", nonStart.nonStart("java", "code"));
        assertEquals("hotlava", nonStart.nonStart("shotl", "java"));
        assertEquals("by", nonStart.nonStart("ab", "xy"));
        assertEquals("b", nonStart.nonStart("ab", "x"));
        assertEquals("c", nonStart.nonStart("x", "ac"));
        assertEquals("", nonStart.nonStart("a", "x"));
        assertEquals("itat", nonStart.nonStart("kit", "kat"));
        assertEquals("artart", nonStart.nonStart("mart", "dart"));
    }

}
