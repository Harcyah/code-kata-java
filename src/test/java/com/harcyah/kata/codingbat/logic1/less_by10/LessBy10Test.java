package com.harcyah.kata.codingbat.logic1.less_by10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LessBy10Test {

    @Test
    void testLessBy10() {
        LessBy10 lessBy10 = new LessBy10();
        assertTrue(lessBy10.lessBy10(1, 7, 11));
        assertFalse(lessBy10.lessBy10(1, 7, 10));
        assertTrue(lessBy10.lessBy10(11, 1, 7));
        assertFalse(lessBy10.lessBy10(10, 7, 1));
        assertTrue(lessBy10.lessBy10(-10, 2, 2));
        assertFalse(lessBy10.lessBy10(2, 11, 11));
        assertTrue(lessBy10.lessBy10(3, 3, 30));
        assertFalse(lessBy10.lessBy10(3, 3, 3));
        assertTrue(lessBy10.lessBy10(10, 1, 11));
        assertTrue(lessBy10.lessBy10(10, 11, 1));
        assertFalse(lessBy10.lessBy10(10, 11, 2));
        assertTrue(lessBy10.lessBy10(3, 30, 3));
        assertTrue(lessBy10.lessBy10(2, 2, -8));
        assertTrue(lessBy10.lessBy10(2, 8, 12));
    }

}
