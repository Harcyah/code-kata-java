package com.harcyah.kata.codingbat.string1.last_two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastTwoTest {

    @Test
    public void testLastTwo() {
        LastTwo lastTwo = new LastTwo();
        assertEquals("codign", lastTwo.lastTwo("coding"));
        assertEquals("cta", lastTwo.lastTwo("cat"));
        assertEquals("ba", lastTwo.lastTwo("ab"));
        assertEquals("a", lastTwo.lastTwo("a"));
        assertEquals("", lastTwo.lastTwo(""));
    }

}
