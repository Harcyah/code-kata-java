package com.harcyah.kata.codingbat.string1.extra_front;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExtraFrontTest {

    @Test
    void testExtraFront() {
        ExtraFront extraFront = new ExtraFront();
        assertEquals("HeHeHe", extraFront.extraFront("Hello"));
        assertEquals("ababab", extraFront.extraFront("ab"));
        assertEquals("HHH", extraFront.extraFront("H"));
        assertEquals("", extraFront.extraFront(""));
        assertEquals("CaCaCa", extraFront.extraFront("Candy"));
        assertEquals("CoCoCo", extraFront.extraFront("Code"));
    }

}
