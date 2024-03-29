package com.harcyah.kata.codingbat.string1.combo_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComboStringTest {

    @Test
    void testComboString() {
        ComboString comboString = new ComboString();
        assertEquals("hiHellohi", comboString.comboString("Hello", "hi"));
        assertEquals("hiHellohi", comboString.comboString("hi", "Hello"));
        assertEquals("baaab", comboString.comboString("aaa", "b"));
        assertEquals("baaab", comboString.comboString("b", "aaa"));
        assertEquals("aaa", comboString.comboString("aaa", ""));
        assertEquals("bb", comboString.comboString("", "bb"));
        assertEquals("aaa1234aaa", comboString.comboString("aaa", "1234"));
        assertEquals("bbaaabb", comboString.comboString("aaa", "bb"));
        assertEquals("abba", comboString.comboString("a", "bb"));
        assertEquals("abba", comboString.comboString("bb", "a"));
        assertEquals("abxyzab", comboString.comboString("xyz", "ab"));
    }

}
