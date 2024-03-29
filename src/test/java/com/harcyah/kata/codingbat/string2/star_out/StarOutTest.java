package com.harcyah.kata.codingbat.string2.star_out;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StarOutTest {

    @Test
    void testStarOut() {
        StarOut starOut = new StarOut();
        assertEquals("ad", starOut.starOut("ab*cd"));
        assertEquals("ad", starOut.starOut("ab**cd"));
        assertEquals("silly", starOut.starOut("sm*eilly"));
        assertEquals("siy", starOut.starOut("sm*eil*ly"));
        assertEquals("siy", starOut.starOut("sm**eil*ly"));
        assertEquals("siy", starOut.starOut("sm***eil*ly"));
        assertEquals("string", starOut.starOut("stringy*"));
        assertEquals("tringy", starOut.starOut("*stringy"));
        assertEquals("ty", starOut.starOut("*str*in*gy"));
        assertEquals("abc", starOut.starOut("abc"));
        assertEquals("c", starOut.starOut("a*bc"));
        assertEquals("ab", starOut.starOut("ab"));
        assertEquals("", starOut.starOut("a*b"));
        assertEquals("a", starOut.starOut("a"));
        assertEquals("", starOut.starOut("a*"));
        assertEquals("", starOut.starOut("*a"));
        assertEquals("", starOut.starOut("*"));
        assertEquals("", starOut.starOut(""));
    }

}
