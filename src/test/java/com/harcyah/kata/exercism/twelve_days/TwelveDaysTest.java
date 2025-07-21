package com.harcyah.kata.exercism.twelve_days;

import org.junit.jupiter.api.Test;

import static io.hosuaby.inject.resources.core.InjectResources.resource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TwelveDaysTest {

    @Test
    void verseOne() {
        String expected = resource().withPath("com/harcyah/kata/exercism/twelve_days/01.txt").text();
        assertEquals(expected, TwelveDays.verse(1));
    }

    @Test
    void verseTwo() {
        String expected = resource().withPath("com/harcyah/kata/exercism/twelve_days/02.txt").text();
        assertEquals(expected, TwelveDays.verse(2));
    }

    @Test
    void verseThree() {
        String expected = resource().withPath("com/harcyah/kata/exercism/twelve_days/03.txt").text();
        assertEquals(expected, TwelveDays.verse(3));
    }

    @Test
    void verseFour() {
        String expected = resource().withPath("com/harcyah/kata/exercism/twelve_days/04.txt").text();
        assertEquals(expected, TwelveDays.verse(4));
    }

    @Test
    void verseFive() {
        String expected = resource().withPath("com/harcyah/kata/exercism/twelve_days/05.txt").text();
        assertEquals(expected, TwelveDays.verse(5));
    }

    @Test
    void verseSix() {
        String expected = resource().withPath("com/harcyah/kata/exercism/twelve_days/06.txt").text();
        assertEquals(expected, TwelveDays.verse(6));
    }

    @Test
    void verseSeven() {
        String expected = resource().withPath("com/harcyah/kata/exercism/twelve_days/07.txt").text();
        assertEquals(expected, TwelveDays.verse(7));
    }

    @Test
    void verseEight() {
        String expected = resource().withPath("com/harcyah/kata/exercism/twelve_days/08.txt").text();
        assertEquals(expected, TwelveDays.verse(8));
    }

    @Test
    void verseNine() {
        String expected = resource().withPath("com/harcyah/kata/exercism/twelve_days/09.txt").text();
        assertEquals(expected, TwelveDays.verse(9));
    }

    @Test
    void verseTen() {
        String expected = resource().withPath("com/harcyah/kata/exercism/twelve_days/10.txt").text();
        assertEquals(expected, TwelveDays.verse(10));
    }

    @Test
    void verseEleven() {
        String expected = resource().withPath("com/harcyah/kata/exercism/twelve_days/11.txt").text();
        assertEquals(expected, TwelveDays.verse(11));
    }

    @Test
    void verseTwelve() {
        String expected = resource().withPath("com/harcyah/kata/exercism/twelve_days/12.txt").text();
        assertEquals(expected, TwelveDays.verse(12));
    }

    @Test
    void multipleVerses() {
        String expected = resource().withPath("com/harcyah/kata/exercism/twelve_days/multiple.txt").text();
        assertEquals(expected, TwelveDays.verses(1, 3));
    }

    @Test
    void wholeSong() {
        String expected = resource().withPath("com/harcyah/kata/exercism/twelve_days/whole.txt").text();
        assertEquals(expected, TwelveDays.sing());
    }

}
