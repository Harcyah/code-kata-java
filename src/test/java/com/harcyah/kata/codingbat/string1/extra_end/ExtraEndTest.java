package com.harcyah.kata.codingbat.string1.extra_end;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExtraEndTest {

    @Test
    void testExtraEnd() {
        ExtraEnd extraEnd = new ExtraEnd();
        assertEquals("lololo", extraEnd.extraEnd("Hello"));
        assertEquals("ababab", extraEnd.extraEnd("ab"));
        assertEquals("HiHiHi", extraEnd.extraEnd("Hi"));
        assertEquals("dydydy", extraEnd.extraEnd("Candy"));
        assertEquals("dedede", extraEnd.extraEnd("Code"));
    }

}
