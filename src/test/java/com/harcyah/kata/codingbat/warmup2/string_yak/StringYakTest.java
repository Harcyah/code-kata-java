package com.harcyah.kata.codingbat.warmup2.string_yak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringYakTest {

    @Test
    void testStringYak() {
        StringYak stringYak = new StringYak();
        assertEquals("pak", stringYak.stringYak("yakpak"));
        assertEquals("pak", stringYak.stringYak("pakyak"));
        assertEquals("123ya", stringYak.stringYak("yak123ya"));
        assertEquals("", stringYak.stringYak("yak"));
        assertEquals("xxx", stringYak.stringYak("yakxxxyak"));
        assertEquals("HiHi", stringYak.stringYak("HiyakHi"));
        assertEquals("xxxyyzzz", stringYak.stringYak("xxxyakyyyakzzz"));
    }

}
