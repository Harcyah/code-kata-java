package com.harcyah.kata.codingbat.string2.prefix_again;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrefixAgainTest {

    @Test
    void testPrefixAgain() {
        PrefixAgain prefixAgain = new PrefixAgain();
        assertTrue(prefixAgain.prefixAgain("abXYabc", 1));
        assertTrue(prefixAgain.prefixAgain("abXYabc", 2));
        assertFalse(prefixAgain.prefixAgain("abXYabc", 3));
        assertTrue(prefixAgain.prefixAgain("xyzxyxyxy", 2));
        assertFalse(prefixAgain.prefixAgain("xyzxyxyxy", 3));
        assertTrue(prefixAgain.prefixAgain("Hi12345Hi6789Hi10", 1));
        assertTrue(prefixAgain.prefixAgain("Hi12345Hi6789Hi10", 2));
        assertTrue(prefixAgain.prefixAgain("Hi12345Hi6789Hi10", 3));
        assertFalse(prefixAgain.prefixAgain("Hi12345Hi6789Hi10", 4));
        assertFalse(prefixAgain.prefixAgain("a", 1));
        assertTrue(prefixAgain.prefixAgain("aa", 1));
        assertFalse(prefixAgain.prefixAgain("ab", 1));
    }

}
