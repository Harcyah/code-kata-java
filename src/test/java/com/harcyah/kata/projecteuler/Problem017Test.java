package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem017Test {

    @Test
    void testGetEnglishLiteralForNumberUnder20() {
        Problem017 sut = new Problem017();
        assertEquals("one", sut.getEnglishLiteralOf(1));
        assertEquals("ten", sut.getEnglishLiteralOf(10));
        assertEquals("fifteen", sut.getEnglishLiteralOf(15));
    }

    @Test
    void testGetEnglishLiteralForNumberBetween20And100() {
        Problem017 sut = new Problem017();
        assertEquals("twenty", sut.getEnglishLiteralOf(20));
        assertEquals("fifty-five", sut.getEnglishLiteralOf(55));
        assertEquals("ninety-nine", sut.getEnglishLiteralOf(99));
    }

    @Test
    void testGetEnglishLiteralForNumberBetween100And1000() {
        Problem017 sut = new Problem017();
        assertEquals("one hundred", sut.getEnglishLiteralOf(100));
        assertEquals("one thousand", sut.getEnglishLiteralOf(1000));
        assertEquals("five hundred", sut.getEnglishLiteralOf(500));
        assertEquals("six hundred and sixty-six", sut.getEnglishLiteralOf(666));
    }

    @Test
    void testCountLettersOfSumBetween() {
        Problem017 sut = new Problem017();
        assertEquals(19, sut.countLettersOfSumBetween(1, 5));
        assertEquals(21124, sut.countLettersOfSumBetween(1, 1000));
    }

    @Test
    void testGetLengthOfEnglishLiteral() {
        Problem017 sut = new Problem017();
        assertEquals(20, sut.getLengthOfEnglishLiteral(115));
        assertEquals(23, sut.getLengthOfEnglishLiteral(342));
    }

}
