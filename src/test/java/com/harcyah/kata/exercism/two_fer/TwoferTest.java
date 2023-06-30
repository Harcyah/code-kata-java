package com.harcyah.kata.exercism.two_fer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoferTest {

    private Twofer twofer;

    @BeforeEach
    void setup() {
        twofer = new Twofer();
    }

    @Test
    void noNameGiven() {
        String input = null;
        String expected = "One for you, one for me.";

        assertEquals(expected, twofer.twofer(input));
    }

    @Test
    void withNameGiven() {
        String input = "Alice";
        String expected = "One for Alice, one for me.";

        assertEquals(expected, twofer.twofer(input));
    }

    @Test
    void anotherNameGiven() {
        String input = "Bob";
        String expected = "One for Bob, one for me.";

        assertEquals(expected, twofer.twofer(input));
    }

}
