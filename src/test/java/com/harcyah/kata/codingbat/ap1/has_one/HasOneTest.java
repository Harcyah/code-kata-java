package com.harcyah.kata.codingbat.ap1.has_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HasOneTest {

    @Test
    void testHasOne() {
        HasOne hasOne = new HasOne();
        assertTrue(hasOne.hasOne(10));
        assertFalse(hasOne.hasOne(22));
        assertFalse(hasOne.hasOne(220));
        assertTrue(hasOne.hasOne(212));
        assertTrue(hasOne.hasOne(1));
        assertFalse(hasOne.hasOne(9));
        assertTrue(hasOne.hasOne(211112));
        assertTrue(hasOne.hasOne(121121));
        assertFalse(hasOne.hasOne(222222));
        assertTrue(hasOne.hasOne(56156));
        assertFalse(hasOne.hasOne(56556));
    }

}
