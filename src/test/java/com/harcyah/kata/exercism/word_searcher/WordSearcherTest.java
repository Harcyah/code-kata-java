package com.harcyah.kata.exercism.word_searcher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * version: 1.0.0
 */
class WordSearcherTest {

    private WordSearcher wordSearcher;

    @BeforeEach
    void setUp() {
        wordSearcher = new WordSearcher();
    }

    @Test
    void testLocatesWordsWrittenLeftToRight() {
        Map<String, Optional<WordLocation>> expectedLocations = new HashMap<>();
        expectedLocations.put("clojure", Optional.of(new WordLocation(new Pair(1, 10), new Pair(7, 10))));

        Set<String> searchWords = expectedLocations.keySet();

        Map<String, Optional<WordLocation>> actualLocations = wordSearcher.search(
            searchWords,
            new char[][]{
                {'j', 'e', 'f', 'b', 'l', 'p', 'e', 'p', 'r', 'e'},
                {'c', 'a', 'm', 'd', 'c', 'i', 'm', 'g', 't', 'c'},
                {'o', 'i', 'v', 'o', 'k', 'p', 'r', 'j', 's', 'm'},
                {'p', 'b', 'w', 'a', 's', 'q', 'r', 'o', 'u', 'a'},
                {'r', 'i', 'x', 'i', 'l', 'e', 'l', 'h', 'r', 's'},
                {'w', 'o', 'l', 'c', 'q', 'l', 'i', 'r', 'p', 'c'},
                {'s', 'c', 'r', 'e', 'e', 'a', 'u', 'm', 'g', 'r'},
                {'a', 'l', 'x', 'h', 'p', 'b', 'u', 'r', 'y', 'i'},
                {'j', 'a', 'l', 'a', 'y', 'c', 'a', 'l', 'm', 'p'},
                {'c', 'l', 'o', 'j', 'u', 'r', 'e', 'r', 'm', 't'}
            }
        );

        assertEquals(expectedLocations, actualLocations);
    }

    @Test
    void testLocatesWordsWrittenRightToLeft() {
        Map<String, Optional<WordLocation>> expectedLocations = new HashMap<>();
        expectedLocations.put("clojure", Optional.of(new WordLocation(new Pair(1, 10), new Pair(7, 10))));
        expectedLocations.put("elixir", Optional.of(new WordLocation(new Pair(6, 5), new Pair(1, 5))));

        Set<String> searchWords = expectedLocations.keySet();

        Map<String, Optional<WordLocation>> actualLocations = wordSearcher.search(
            searchWords,
            new char[][]{
                {'j', 'e', 'f', 'b', 'l', 'p', 'e', 'p', 'r', 'e'},
                {'c', 'a', 'm', 'd', 'c', 'i', 'm', 'g', 't', 'c'},
                {'o', 'i', 'v', 'o', 'k', 'p', 'r', 'j', 's', 'm'},
                {'p', 'b', 'w', 'a', 's', 'q', 'r', 'o', 'u', 'a'},
                {'r', 'i', 'x', 'i', 'l', 'e', 'l', 'h', 'r', 's'},
                {'w', 'o', 'l', 'c', 'q', 'l', 'i', 'r', 'p', 'c'},
                {'s', 'c', 'r', 'e', 'e', 'a', 'u', 'm', 'g', 'r'},
                {'a', 'l', 'x', 'h', 'p', 'b', 'u', 'r', 'y', 'i'},
                {'j', 'a', 'l', 'a', 'y', 'c', 'a', 'l', 'm', 'p'},
                {'c', 'l', 'o', 'j', 'u', 'r', 'e', 'r', 'm', 't'}
            }
        );

        assertEquals(expectedLocations, actualLocations);
    }

    @Test
    void testLocatesWordsWrittenTopToBottom() {
        Map<String, Optional<WordLocation>> expectedLocations = new HashMap<>();
        expectedLocations.put("clojure", Optional.of(new WordLocation(new Pair(1, 10), new Pair(7, 10))));
        expectedLocations.put("elixir", Optional.of(new WordLocation(new Pair(6, 5), new Pair(1, 5))));
        expectedLocations.put("ecmascript", Optional.of(new WordLocation(new Pair(10, 1), new Pair(10, 10))));

        Set<String> searchWords = expectedLocations.keySet();

        Map<String, Optional<WordLocation>> actualLocations = wordSearcher.search(
            searchWords,
            new char[][]{
                {'j', 'e', 'f', 'b', 'l', 'p', 'e', 'p', 'r', 'e'},
                {'c', 'a', 'm', 'd', 'c', 'i', 'm', 'g', 't', 'c'},
                {'o', 'i', 'v', 'o', 'k', 'p', 'r', 'j', 's', 'm'},
                {'p', 'b', 'w', 'a', 's', 'q', 'r', 'o', 'u', 'a'},
                {'r', 'i', 'x', 'i', 'l', 'e', 'l', 'h', 'r', 's'},
                {'w', 'o', 'l', 'c', 'q', 'l', 'i', 'r', 'p', 'c'},
                {'s', 'c', 'r', 'e', 'e', 'a', 'u', 'm', 'g', 'r'},
                {'a', 'l', 'x', 'h', 'p', 'b', 'u', 'r', 'y', 'i'},
                {'j', 'a', 'l', 'a', 'y', 'c', 'a', 'l', 'm', 'p'},
                {'c', 'l', 'o', 'j', 'u', 'r', 'e', 'r', 'm', 't'}
            }
        );

        assertEquals(expectedLocations, actualLocations);
    }

    @Test
    void testLocatesWordsWrittenBottomToTop() {
        Map<String, Optional<WordLocation>> expectedLocations = new HashMap<>();
        expectedLocations.put("clojure", Optional.of(new WordLocation(new Pair(1, 10), new Pair(7, 10))));
        expectedLocations.put("elixir", Optional.of(new WordLocation(new Pair(6, 5), new Pair(1, 5))));
        expectedLocations.put("ecmascript", Optional.of(new WordLocation(new Pair(10, 1), new Pair(10, 10))));
        expectedLocations.put("rust", Optional.of(new WordLocation(new Pair(9, 5), new Pair(9, 2))));

        Set<String> searchWords = expectedLocations.keySet();

        Map<String, Optional<WordLocation>> actualLocations = wordSearcher.search(
            searchWords,
            new char[][]{
                {'j', 'e', 'f', 'b', 'l', 'p', 'e', 'p', 'r', 'e'},
                {'c', 'a', 'm', 'd', 'c', 'i', 'm', 'g', 't', 'c'},
                {'o', 'i', 'v', 'o', 'k', 'p', 'r', 'j', 's', 'm'},
                {'p', 'b', 'w', 'a', 's', 'q', 'r', 'o', 'u', 'a'},
                {'r', 'i', 'x', 'i', 'l', 'e', 'l', 'h', 'r', 's'},
                {'w', 'o', 'l', 'c', 'q', 'l', 'i', 'r', 'p', 'c'},
                {'s', 'c', 'r', 'e', 'e', 'a', 'u', 'm', 'g', 'r'},
                {'a', 'l', 'x', 'h', 'p', 'b', 'u', 'r', 'y', 'i'},
                {'j', 'a', 'l', 'a', 'y', 'c', 'a', 'l', 'm', 'p'},
                {'c', 'l', 'o', 'j', 'u', 'r', 'e', 'r', 'm', 't'}});

        assertEquals(expectedLocations, actualLocations);
    }

    @Test
    void testLocatesWordsWrittenTopLeftToBottomRight() {
        Map<String, Optional<WordLocation>> expectedLocations = new HashMap<>();
        expectedLocations.put("clojure", Optional.of(new WordLocation(new Pair(1, 10), new Pair(7, 10))));
        expectedLocations.put("elixir", Optional.of(new WordLocation(new Pair(6, 5), new Pair(1, 5))));
        expectedLocations.put("ecmascript", Optional.of(new WordLocation(new Pair(10, 1), new Pair(10, 10))));
        expectedLocations.put("rust", Optional.of(new WordLocation(new Pair(9, 5), new Pair(9, 2))));
        expectedLocations.put("java", Optional.of(new WordLocation(new Pair(1, 1), new Pair(4, 4))));

        Set<String> searchWords = expectedLocations.keySet();

        Map<String, Optional<WordLocation>> actualLocations = wordSearcher.search(
            searchWords,
            new char[][]{
                {'j', 'e', 'f', 'b', 'l', 'p', 'e', 'p', 'r', 'e'},
                {'c', 'a', 'm', 'd', 'c', 'i', 'm', 'g', 't', 'c'},
                {'o', 'i', 'v', 'o', 'k', 'p', 'r', 'j', 's', 'm'},
                {'p', 'b', 'w', 'a', 's', 'q', 'r', 'o', 'u', 'a'},
                {'r', 'i', 'x', 'i', 'l', 'e', 'l', 'h', 'r', 's'},
                {'w', 'o', 'l', 'c', 'q', 'l', 'i', 'r', 'p', 'c'},
                {'s', 'c', 'r', 'e', 'e', 'a', 'u', 'm', 'g', 'r'},
                {'a', 'l', 'x', 'h', 'p', 'b', 'u', 'r', 'y', 'i'},
                {'j', 'a', 'l', 'a', 'y', 'c', 'a', 'l', 'm', 'p'},
                {'c', 'l', 'o', 'j', 'u', 'r', 'e', 'r', 'm', 't'}});

        assertEquals(expectedLocations, actualLocations);
    }

    @Test
    void testLocatesWordsWrittenBottomRightToTopLeft() {
        Map<String, Optional<WordLocation>> expectedLocations = new HashMap<>();
        expectedLocations.put("clojure", Optional.of(new WordLocation(new Pair(1, 10), new Pair(7, 10))));
        expectedLocations.put("elixir", Optional.of(new WordLocation(new Pair(6, 5), new Pair(1, 5))));
        expectedLocations.put("ecmascript", Optional.of(new WordLocation(new Pair(10, 1), new Pair(10, 10))));
        expectedLocations.put("rust", Optional.of(new WordLocation(new Pair(9, 5), new Pair(9, 2))));
        expectedLocations.put("java", Optional.of(new WordLocation(new Pair(1, 1), new Pair(4, 4))));
        expectedLocations.put("lua", Optional.of(new WordLocation(new Pair(8, 9), new Pair(6, 7))));

        Set<String> searchWords = expectedLocations.keySet();

        Map<String, Optional<WordLocation>> actualLocations = wordSearcher.search(
            searchWords,
            new char[][]{
                {'j', 'e', 'f', 'b', 'l', 'p', 'e', 'p', 'r', 'e'},
                {'c', 'a', 'm', 'd', 'c', 'i', 'm', 'g', 't', 'c'},
                {'o', 'i', 'v', 'o', 'k', 'p', 'r', 'j', 's', 'm'},
                {'p', 'b', 'w', 'a', 's', 'q', 'r', 'o', 'u', 'a'},
                {'r', 'i', 'x', 'i', 'l', 'e', 'l', 'h', 'r', 's'},
                {'w', 'o', 'l', 'c', 'q', 'l', 'i', 'r', 'p', 'c'},
                {'s', 'c', 'r', 'e', 'e', 'a', 'u', 'm', 'g', 'r'},
                {'a', 'l', 'x', 'h', 'p', 'b', 'u', 'r', 'y', 'i'},
                {'j', 'a', 'l', 'a', 'y', 'c', 'a', 'l', 'm', 'p'},
                {'c', 'l', 'o', 'j', 'u', 'r', 'e', 'r', 'm', 't'}});

        assertEquals(expectedLocations, actualLocations);
    }

    @Test
    void testLocatesWordsWrittenBottomLeftToTopRight() {
        Map<String, Optional<WordLocation>> expectedLocations = new HashMap<>();
        expectedLocations.put("clojure", Optional.of(new WordLocation(new Pair(1, 10), new Pair(7, 10))));
        expectedLocations.put("elixir", Optional.of(new WordLocation(new Pair(6, 5), new Pair(1, 5))));
        expectedLocations.put("ecmascript", Optional.of(new WordLocation(new Pair(10, 1), new Pair(10, 10))));
        expectedLocations.put("rust", Optional.of(new WordLocation(new Pair(9, 5), new Pair(9, 2))));
        expectedLocations.put("java", Optional.of(new WordLocation(new Pair(1, 1), new Pair(4, 4))));
        expectedLocations.put("lua", Optional.of(new WordLocation(new Pair(8, 9), new Pair(6, 7))));
        expectedLocations.put("lisp", Optional.of(new WordLocation(new Pair(3, 6), new Pair(6, 3))));

        Set<String> searchWords = expectedLocations.keySet();

        Map<String, Optional<WordLocation>> actualLocations = wordSearcher.search(
            searchWords,
            new char[][]{
                {'j', 'e', 'f', 'b', 'l', 'p', 'e', 'p', 'r', 'e'},
                {'c', 'a', 'm', 'd', 'c', 'i', 'm', 'g', 't', 'c'},
                {'o', 'i', 'v', 'o', 'k', 'p', 'r', 'j', 's', 'm'},
                {'p', 'b', 'w', 'a', 's', 'q', 'r', 'o', 'u', 'a'},
                {'r', 'i', 'x', 'i', 'l', 'e', 'l', 'h', 'r', 's'},
                {'w', 'o', 'l', 'c', 'q', 'l', 'i', 'r', 'p', 'c'},
                {'s', 'c', 'r', 'e', 'e', 'a', 'u', 'm', 'g', 'r'},
                {'a', 'l', 'x', 'h', 'p', 'b', 'u', 'r', 'y', 'i'},
                {'j', 'a', 'l', 'a', 'y', 'c', 'a', 'l', 'm', 'p'},
                {'c', 'l', 'o', 'j', 'u', 'r', 'e', 'r', 'm', 't'}});

        assertEquals(expectedLocations, actualLocations);
    }

    @Test
    void testLocatesWordsWrittenTopRightToBottomLeft() {
        Map<String, Optional<WordLocation>> expectedLocations = new HashMap<>();
        expectedLocations.put("clojure", Optional.of(new WordLocation(new Pair(1, 10), new Pair(7, 10))));
        expectedLocations.put("elixir", Optional.of(new WordLocation(new Pair(6, 5), new Pair(1, 5))));
        expectedLocations.put("ecmascript", Optional.of(new WordLocation(new Pair(10, 1), new Pair(10, 10))));
        expectedLocations.put("rust", Optional.of(new WordLocation(new Pair(9, 5), new Pair(9, 2))));
        expectedLocations.put("java", Optional.of(new WordLocation(new Pair(1, 1), new Pair(4, 4))));
        expectedLocations.put("lua", Optional.of(new WordLocation(new Pair(8, 9), new Pair(6, 7))));
        expectedLocations.put("lisp", Optional.of(new WordLocation(new Pair(3, 6), new Pair(6, 3))));
        expectedLocations.put("ruby", Optional.of(new WordLocation(new Pair(8, 6), new Pair(5, 9))));

        Set<String> searchWords = expectedLocations.keySet();

        Map<String, Optional<WordLocation>> actualLocations = wordSearcher.search(
            searchWords,
            new char[][]{
                {'j', 'e', 'f', 'b', 'l', 'p', 'e', 'p', 'r', 'e'},
                {'c', 'a', 'm', 'd', 'c', 'i', 'm', 'g', 't', 'c'},
                {'o', 'i', 'v', 'o', 'k', 'p', 'r', 'j', 's', 'm'},
                {'p', 'b', 'w', 'a', 's', 'q', 'r', 'o', 'u', 'a'},
                {'r', 'i', 'x', 'i', 'l', 'e', 'l', 'h', 'r', 's'},
                {'w', 'o', 'l', 'c', 'q', 'l', 'i', 'r', 'p', 'c'},
                {'s', 'c', 'r', 'e', 'e', 'a', 'u', 'm', 'g', 'r'},
                {'a', 'l', 'x', 'h', 'p', 'b', 'u', 'r', 'y', 'i'},
                {'j', 'a', 'l', 'a', 'y', 'c', 'a', 'l', 'm', 'p'},
                {'c', 'l', 'o', 'j', 'u', 'r', 'e', 'r', 'm', 't'}});

        assertEquals(expectedLocations, actualLocations);
    }

    @Test
    void testFailsToLocateAWordsThatIsNotInThePuzzle() {
        Map<String, Optional<WordLocation>> expectedLocations = new HashMap<>();
        expectedLocations.put("clojure", Optional.of(new WordLocation(new Pair(1, 10), new Pair(7, 10))));
        expectedLocations.put("elixir", Optional.of(new WordLocation(new Pair(6, 5), new Pair(1, 5))));
        expectedLocations.put("ecmascript", Optional.of(new WordLocation(new Pair(10, 1), new Pair(10, 10))));
        expectedLocations.put("rust", Optional.of(new WordLocation(new Pair(9, 5), new Pair(9, 2))));
        expectedLocations.put("java", Optional.of(new WordLocation(new Pair(1, 1), new Pair(4, 4))));
        expectedLocations.put("lua", Optional.of(new WordLocation(new Pair(8, 9), new Pair(6, 7))));
        expectedLocations.put("lisp", Optional.of(new WordLocation(new Pair(3, 6), new Pair(6, 3))));
        expectedLocations.put("ruby", Optional.of(new WordLocation(new Pair(8, 6), new Pair(5, 9))));
        expectedLocations.put("haskell", Optional.empty());

        Set<String> searchWords = expectedLocations.keySet();

        Map<String, Optional<WordLocation>> actualLocations = wordSearcher.search(
            searchWords,
            new char[][]{
                {'j', 'e', 'f', 'b', 'l', 'p', 'e', 'p', 'r', 'e'},
                {'c', 'a', 'm', 'd', 'c', 'i', 'm', 'g', 't', 'c'},
                {'o', 'i', 'v', 'o', 'k', 'p', 'r', 'j', 's', 'm'},
                {'p', 'b', 'w', 'a', 's', 'q', 'r', 'o', 'u', 'a'},
                {'r', 'i', 'x', 'i', 'l', 'e', 'l', 'h', 'r', 's'},
                {'w', 'o', 'l', 'c', 'q', 'l', 'i', 'r', 'p', 'c'},
                {'s', 'c', 'r', 'e', 'e', 'a', 'u', 'm', 'g', 'r'},
                {'a', 'l', 'x', 'h', 'p', 'b', 'u', 'r', 'y', 'i'},
                {'j', 'a', 'l', 'a', 'y', 'c', 'a', 'l', 'm', 'p'},
                {'c', 'l', 'o', 'j', 'u', 'r', 'e', 'r', 'm', 't'}});

        assertEquals(expectedLocations, actualLocations);
    }

}
