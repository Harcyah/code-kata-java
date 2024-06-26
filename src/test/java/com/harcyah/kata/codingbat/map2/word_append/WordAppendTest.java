package com.harcyah.kata.codingbat.map2.word_append;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WordAppendTest {

    @Test
    void testWordAppend() {
        WordAppend wordAppend = new WordAppend();
        assertThat(wordAppend.wordAppend(new String[] { "a", "b", "a" })).isEqualTo("a");
        assertThat(wordAppend.wordAppend(new String[] { "a", "b", "a", "c", "a", "d", "a" })).isEqualTo("aa");
        assertThat(wordAppend.wordAppend(new String[] { "a", "", "a" })).isEqualTo("a");
        assertThat(wordAppend.wordAppend(new String[] {})).isEmpty();
        assertThat(wordAppend.wordAppend(new String[] { "a", "b", "b", "a", "a" })).isEqualTo("ba");
        assertThat(wordAppend.wordAppend(new String[] { "a", "b", "b", "b", "a", "c", "a", "a" })).isEqualTo("baa");
        assertThat(wordAppend.wordAppend(new String[] { "a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a" })).isEqualTo("baaba");
        assertThat(wordAppend.wordAppend(new String[] { "not", "and", "or", "and", "this", "and", "or", "that", "not" })).isEqualTo("andornot");
        assertThat(wordAppend.wordAppend(new String[] { "a", "b", "c" })).isEmpty();
        assertThat(wordAppend.wordAppend(new String[] { "this", "or", "that", "and", "this", "and", "that" })).isEqualTo("thisandthat");
        assertThat(wordAppend.wordAppend(new String[] { "xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx" })).isEqualTo("xxyyzzxx");
    }

}
