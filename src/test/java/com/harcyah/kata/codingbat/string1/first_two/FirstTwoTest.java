package com.harcyah.kata.codingbat.string1.first_two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstTwoTest {

    @Test
    void testFirstTwo() {
        FirstTwo firstTwo = new FirstTwo();
        assertEquals("He", firstTwo.firstTwo("Hello"));
        assertEquals("ab", firstTwo.firstTwo("abcdefg"));
        assertEquals("ab", firstTwo.firstTwo("ab"));
        assertEquals("a", firstTwo.firstTwo("a"));
        assertEquals("", firstTwo.firstTwo(""));
        assertEquals("Ki", firstTwo.firstTwo("Kitten"));
        assertEquals("hi", firstTwo.firstTwo("hi"));
        assertEquals("hi", firstTwo.firstTwo("hiya"));
    }

}
