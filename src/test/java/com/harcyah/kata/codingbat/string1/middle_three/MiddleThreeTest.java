package com.harcyah.kata.codingbat.string1.middle_three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleThreeTest {

    @Test
    void testMiddleThree() {
        MiddleThree middleThree = new MiddleThree();
        assertEquals("and", middleThree.middleThree("Candy"));
        assertEquals("and", middleThree.middleThree("and"));
        assertEquals("lvi", middleThree.middleThree("solving"));
        assertEquals("yet", middleThree.middleThree("Hi yet Hi"));
        assertEquals("yet", middleThree.middleThree("java yet java"));
        assertEquals("col", middleThree.middleThree("Chocolate"));
        assertEquals("xyz", middleThree.middleThree("XabcxyzabcX"));
    }

}
