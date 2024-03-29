package com.harcyah.kata.codingbat.warmup2.alt_pairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AltPairsTest {

    @Test
    void testAltPairs() {
        AltPairs altPairs = new AltPairs();
        assertEquals("kien", altPairs.altPairs("kitten"));
        assertEquals("Chole", altPairs.altPairs("Chocolate"));
        assertEquals("Congrr", altPairs.altPairs("CodingHorror"));
        assertEquals("ya", altPairs.altPairs("yak"));
        assertEquals("ya", altPairs.altPairs("ya"));
        assertEquals("y", altPairs.altPairs("y"));
        assertEquals("", altPairs.altPairs(""));
        assertEquals("ThThThth", altPairs.altPairs("ThisThatTheOther"));
    }

}
