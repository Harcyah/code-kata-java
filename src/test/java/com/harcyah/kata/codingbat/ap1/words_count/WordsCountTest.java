package com.harcyah.kata.codingbat.ap1.words_count;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordsCountTest {

    @Test
    void testWordsCount() {
        WordsCount wordsCount = new WordsCount();
        assertEquals(2, wordsCount.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1));
        assertEquals(1, wordsCount.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3));
        assertEquals(0, wordsCount.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 4));
        assertEquals(2, wordsCount.wordsCount(new String[]{"xx", "yyy", "x", "yy", "z"}, 1));
        assertEquals(2, wordsCount.wordsCount(new String[]{"xx", "yyy", "x", "yy", "z"}, 2));
        assertEquals(1, wordsCount.wordsCount(new String[]{"xx", "yyy", "x", "yy", "z"}, 3));
    }

}
