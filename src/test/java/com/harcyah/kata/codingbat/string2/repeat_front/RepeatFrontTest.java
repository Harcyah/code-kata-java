package com.harcyah.kata.codingbat.string2.repeat_front;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatFrontTest {

    @Test
    void testRepeatFront() {
        RepeatFront repeatFront = new RepeatFront();
        assertEquals("ChocChoChC", repeatFront.repeatFront("Chocolate", 4));
        assertEquals("ChoChC", repeatFront.repeatFront("Chocolate", 3));
        assertEquals("IcI", repeatFront.repeatFront("Ice Cream", 2));
        assertEquals("I", repeatFront.repeatFront("Ice Cream", 1));
        assertEquals("", repeatFront.repeatFront("Ice Cream", 0));
        assertEquals("xyzxyx", repeatFront.repeatFront("xyz", 3));
        assertEquals("", repeatFront.repeatFront("", 0));
        assertEquals("JavaJavJaJ", repeatFront.repeatFront("Java", 4));
        assertEquals("J", repeatFront.repeatFront("Java", 1));
    }

}
