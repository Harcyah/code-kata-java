package com.harcyah.kata.exercism.anagram;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AnagramTest {

    @Test
    void testNoMatches() {
        Anagram detector = new Anagram("diaper");
        assertThat(detector.match(List.of("hello", "world", "zombies", "pants"))).isEmpty();
    }

    @Test
    void testSimpleAnagram() {
        Anagram detector = new Anagram("ant");
        List<String> anagram = detector.match(List.of("tan", "stand", "at"));
        assertThat(anagram).containsExactly("tan");
    }

    @Test
    void testDetectMultipleAnagrams() {
        Anagram detector = new Anagram("master");
        List<String> anagrams = detector.match(List.of("stream", "pigeon", "maters"));
        assertThat(anagrams).contains("maters", "stream");
    }

    @Test
    void testDoesNotConfuseDifferentDuplicates() {
        Anagram detector = new Anagram("galea");
        List<String> anagrams = detector.match(List.of("eagle"));
        assertThat(anagrams).isEmpty();
    }

    @Test
    void testIdenticalWordIsNotAnagram() {
        Anagram detector = new Anagram("corn");
        List<String> anagrams = detector.match(List.of("corn", "dark", "Corn", "rank", "CORN", "cron", "park"));
        assertThat(anagrams).containsExactly("cron");
    }

    @Test
    void testEliminateAnagramsWithSameChecksum() {
        Anagram detector = new Anagram("mass");
        assertThat(detector.match(List.of("last")).isEmpty());
    }

    @Test
    void testEliminateAnagramSubsets() {
        Anagram detector = new Anagram("good");
        assertThat(detector.match(List.of("dog", "goody"))).isEmpty();
    }

    @Test
    void testDetectAnagrams() {
        Anagram detector = new Anagram("listen");
        List<String> anagrams = detector.match(List.of("enlists", "google", "inlets", "banana"));
        assertThat(anagrams).contains("inlets");
    }

    @Test
    void testMultipleAnagrams() {
        Anagram detector = new Anagram("allergy");
        List<String> anagrams = detector.match(List.of("gallery", "ballerina", "regally", "clergy", "largely", "leading"));
        assertThat(anagrams).contains("gallery", "largely", "regally");
    }

    @Test
    void testAnagramsAreCaseInsensitive() {
        Anagram detector = new Anagram("Orchestra");
        List<String> anagrams = detector.match(List.of("cashregister", "Carthorse", "radishes"));
        assertThat(anagrams).contains("Carthorse");
    }

}
