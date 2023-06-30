package com.harcyah.kata.exercism.isogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsogramCheckerTest {

    @Test
    void testIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("duplicates"));
    }

    @Test
    void testNotIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("eleven"));
    }

    @Test
    void testMediumLongIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("subdermatoglyphic"));
    }

    @Test
    void testCaseInsensitive() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("Alphabet"));
    }

    @Test
    void testIsogramWithHyphen() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("thumbscrew-japingly"));
    }

    @Test
    void testIgnoresMultipleHyphens() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("Hjelmqvist-Gryb-Zock-Pfund-Wax"));
    }

    @Test
    void testWorksWithGermanLetters() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("Heizölrückstoßabdämpfung"));
    }

    @Test
    void testIgnoresSpaces() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("the quick brown fox"));
    }

    @Test
    void testIgnoresSpaces2() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("Emily Jung Schwartzkopf"));
    }

    @Test
    void testDuplicateAccentedLetters() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("éléphant"));
    }

}
