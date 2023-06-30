package com.harcyah.kata.codingbat.string1.middle_two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleTwoTest {

    @Test
    void testMiddleTwo() {
        MiddleTwo middleTwo = new MiddleTwo();
        assertEquals("ri", middleTwo.middleTwo("string"));
        assertEquals("od", middleTwo.middleTwo("code"));
        assertEquals("ct", middleTwo.middleTwo("Practice"));
        assertEquals("ab", middleTwo.middleTwo("ab"));
        assertEquals("45", middleTwo.middleTwo("0123456789"));
    }

}
