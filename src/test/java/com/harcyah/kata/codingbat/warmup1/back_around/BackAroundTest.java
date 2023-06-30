package com.harcyah.kata.codingbat.warmup1.back_around;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackAroundTest {

    @Test
    void testBackAround() {
        BackAround backAround = new BackAround();
        assertEquals("tcatt", backAround.backAround("cat"));
        assertEquals("oHelloo", backAround.backAround("Hello"));
        assertEquals("aaa", backAround.backAround("a"));
        assertEquals("cabcc", backAround.backAround("abc"));
        assertEquals("dreadd", backAround.backAround("read"));
        assertEquals("obooo", backAround.backAround("boo"));
    }

}
