package com.harcyah.kata.exercism.rna_transcription;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RnaTranscriptionTest {

    @Test
    void testRnaTranscriptionOfEmptyDnaIsEmptyRna() {
        assertEquals("", RnaTranscription.ofDna(""));
    }

    @Test
    void testRnaTranscriptionOfCytosineIsGuanine() {
        assertEquals("G", RnaTranscription.ofDna("C"));
    }

    @Test
    void testRnaTranscriptionOfGuanineIsCytosine() {
        assertEquals("C", RnaTranscription.ofDna("G"));
    }

    @Test
    void testRnaTranscriptionOfThymineIsAdenine() {
        assertEquals("A", RnaTranscription.ofDna("T"));
    }

    @Test
    void testRnaTranscriptionOfAdenineIsUracil() {
        assertEquals("U", RnaTranscription.ofDna("A"));
    }

    @Test
    void testRnaTranscription() {
        assertEquals("UGCACCAGAAUU", RnaTranscription.ofDna("ACGTGGTCTTAA"));
    }

}
