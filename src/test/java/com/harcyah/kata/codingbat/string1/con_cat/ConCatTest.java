package com.harcyah.kata.codingbat.string1.con_cat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConCatTest {

    @Test
    void testConCat() {
        ConCat conCat = new ConCat();
        assertEquals("abcat", conCat.conCat("abc", "cat"));
        assertEquals("dogcat", conCat.conCat("dog", "cat"));
        assertEquals("abc", conCat.conCat("abc", ""));
        assertEquals("cat", conCat.conCat("", "cat"));
        assertEquals("pig", conCat.conCat("pig", "g"));
        assertEquals("pigdoggy", conCat.conCat("pig", "doggy"));
    }

}
