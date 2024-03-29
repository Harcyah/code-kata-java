package com.harcyah.kata.codingbat.string2.end_other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EndOtherTest {

    @Test
    void testEndOther() {
        EndOther endOther = new EndOther();
        assertTrue(endOther.endOther("Hiabc", "abc"));
        assertTrue(endOther.endOther("AbC", "HiaBc"));
        assertTrue(endOther.endOther("abc", "abXabc"));
        assertFalse(endOther.endOther("Hiabc", "abcd"));
        assertTrue(endOther.endOther("Hiabc", "bc"));
        assertFalse(endOther.endOther("Hiabcx", "bc"));
        assertTrue(endOther.endOther("abc", "abc"));
        assertTrue(endOther.endOther("xyz", "12xyz"));
        assertFalse(endOther.endOther("yz", "12xz"));
        assertTrue(endOther.endOther("Z", "12xz"));
        assertTrue(endOther.endOther("12", "12"));
        assertFalse(endOther.endOther("abcXYZ", "abcDEF"));
        assertFalse(endOther.endOther("ab", "ab12"));
        assertTrue(endOther.endOther("ab", "12ab"));
    }

}
