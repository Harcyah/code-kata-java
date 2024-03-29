package com.harcyah.kata.codingbat.warmup1.start_oz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StartOzTest {

    @Test
    void testStartOz() {
        StartOz startOz = new StartOz();
        assertEquals("oz", startOz.startOz("ozymandias"));
        assertEquals("z", startOz.startOz("bzoo"));
        assertEquals("o", startOz.startOz("oxx"));
        assertEquals("oz", startOz.startOz("oz"));
        assertEquals("o", startOz.startOz("ounce"));
        assertEquals("o", startOz.startOz("o"));
        assertEquals("", startOz.startOz("abc"));
        assertEquals("", startOz.startOz(""));
        assertEquals("", startOz.startOz("zoo"));
        assertEquals("z", startOz.startOz("aztec"));
        assertEquals("z", startOz.startOz("zzzz"));
        assertEquals("oz", startOz.startOz("oznic"));
    }

}
