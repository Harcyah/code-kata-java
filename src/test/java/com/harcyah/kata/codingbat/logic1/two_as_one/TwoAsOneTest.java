package com.harcyah.kata.codingbat.logic1.two_as_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoAsOneTest {

    @Test
    void testTwoAsOne() {
        TwoAsOne twoAsOne = new TwoAsOne();
        assertTrue(twoAsOne.twoAsOne(1, 2, 3));
        assertTrue(twoAsOne.twoAsOne(3, 1, 2));
        assertFalse(twoAsOne.twoAsOne(3, 2, 2));
        assertTrue(twoAsOne.twoAsOne(2, 3, 1));
        assertTrue(twoAsOne.twoAsOne(5, 3, -2));
        assertFalse(twoAsOne.twoAsOne(5, 3, -3));
        assertTrue(twoAsOne.twoAsOne(2, 5, 3));
        assertFalse(twoAsOne.twoAsOne(9, 5, 5));
        assertTrue(twoAsOne.twoAsOne(9, 4, 5));
        assertTrue(twoAsOne.twoAsOne(5, 4, 9));
        assertTrue(twoAsOne.twoAsOne(3, 3, 0));
        assertFalse(twoAsOne.twoAsOne(3, 3, 2));
    }

}
