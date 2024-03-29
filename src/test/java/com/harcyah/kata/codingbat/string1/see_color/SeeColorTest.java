package com.harcyah.kata.codingbat.string1.see_color;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeeColorTest {

    @Test
    void testSeeColor() {
        SeeColor seeColor = new SeeColor();
        assertEquals("red", seeColor.seeColor("redxx"));
        assertEquals("", seeColor.seeColor("xxred"));
        assertEquals("blue", seeColor.seeColor("blueTimes"));
        assertEquals("", seeColor.seeColor("NoColor"));
        assertEquals("red", seeColor.seeColor("red"));
        assertEquals("", seeColor.seeColor("re"));
        assertEquals("", seeColor.seeColor("blu"));
        assertEquals("blue", seeColor.seeColor("blue"));
        assertEquals("", seeColor.seeColor("a"));
        assertEquals("", seeColor.seeColor(""));
        assertEquals("", seeColor.seeColor("xyzred"));
    }

}
