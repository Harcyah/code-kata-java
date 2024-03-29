package com.harcyah.kata.exercism.word_count;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordCountTest {

    private final WordCount wordCount = new WordCount();

    @Test
    void countOneWord() {
        final Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("word", 1);

        Map<String, Integer> actualWordCount = wordCount.phrase("word");
        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    void countOneOfEach() {
        final Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("one", 1);
        expectedWordCount.put("of", 1);
        expectedWordCount.put("each", 1);

        Map<String, Integer> actualWordCount = wordCount.phrase("one of each");
        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    void countMultipleOccurences() {
        final Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("one", 1);
        expectedWordCount.put("fish", 4);
        expectedWordCount.put("two", 1);
        expectedWordCount.put("red", 1);
        expectedWordCount.put("blue", 1);

        Map<String, Integer> actualWordCount = wordCount.phrase("one fish two fish red fish blue fish");
        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    void ignorePunctuation() {
        final Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("car", 1);
        expectedWordCount.put("carpet", 1);
        expectedWordCount.put("as", 1);
        expectedWordCount.put("java", 1);
        expectedWordCount.put("javascript", 1);

        Map<String, Integer> actualWordCount = wordCount.phrase("car : carpet as java : javascript!!&@$%^&");
        assertEquals(expectedWordCount, actualWordCount);

    }

    @Test
    void includeNumbers() {
        final Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("testing", 2);
        expectedWordCount.put("1", 1);
        expectedWordCount.put("2", 1);

        Map<String, Integer> actualWordCount = wordCount.phrase("testing, 1, 2 testing");
        assertEquals(expectedWordCount, actualWordCount);
    }

    @Test
    void normalizeCase() {
        final Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("go", 3);

        Map<String, Integer> actualWordCount = wordCount.phrase("go Go GO");
        assertEquals(
                expectedWordCount, actualWordCount
        );
    }

}
