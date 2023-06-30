package com.harcyah.kata.exercism.acronym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AcronymTest {

    @Test
    void fromTitleCasedPhrases() {
        final String phrase = "Portable Network Graphics";
        final String expected = "PNG";
        assertEquals(expected, Acronym.generate(phrase));
    }

    @Test
    void fromOtherTitleCasedPhrases() {
        final String phrase = "Ruby on Rails";
        final String expected = "ROR";
        assertEquals(expected, Acronym.generate(phrase));
    }

    @Test
    void fromInconsistentlyCasedPhrases() {
        final String phrase = "HyperText Markup Language";
        final String expected = "HTML";
        assertEquals(expected, Acronym.generate(phrase));
    }

    @Test
    void fromPhrasesWithPunctuation() {
        final String phrase = "First In, First Out";
        final String expected = "FIFO";
        assertEquals(expected, Acronym.generate(phrase));
    }

    @Test
    void fromOtherPhrasesWithPunctuation() {
        final String phrase = "PHP: Hypertext Preprocessor";
        final String expected = "PHP";
        assertEquals(expected, Acronym.generate(phrase));
    }

    @Test
    void fromPhrasesWithPunctuationAndSentenceCasing() {
        final String phrase = "Complementary metal-oxide semiconductor";
        final String expected = "CMOS";
        assertEquals(expected, Acronym.generate(phrase));
    }

}
