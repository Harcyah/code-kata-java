package com.harcyah.kata.codingbat.string2.bob_there;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BobThereTest {

    @Test
    void testBobThere() {
        BobThere bobThere = new BobThere();
        assertTrue(bobThere.bobThere("abcbob"));
        assertTrue(bobThere.bobThere("b9b"));
        assertFalse(bobThere.bobThere("bac"));
        assertTrue(bobThere.bobThere("bbb"));
        assertFalse(bobThere.bobThere("abcdefb"));
        assertTrue(bobThere.bobThere("123abcbcdbabxyz"));
        assertFalse(bobThere.bobThere("b12"));
        assertTrue(bobThere.bobThere("b1b"));
        assertTrue(bobThere.bobThere("b12b1b"));
        assertFalse(bobThere.bobThere("bbc"));
        assertTrue(bobThere.bobThere("bbb"));
        assertFalse(bobThere.bobThere("bb"));
        assertFalse(bobThere.bobThere("b"));
    }

}
