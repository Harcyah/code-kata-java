package com.harcyah.kata.exercism.twelve_days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwelveDaysTest {

    @Test
    void testVerseOne() {
        String expectedVerseOne = "On the first day of Christmas my true love gave to me, " +
            "a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseOne, TwelveDays.verse(1));
    }

    @Test
    void testVerseTwo() {
        String expectedVerseTwo = "On the second day of Christmas my true love gave to me, two Turtle Doves, " +
            "and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseTwo, TwelveDays.verse(2));
    }

    @Test
    void testVerseThree() {
        String expectedVerseThree = "On the third day of Christmas my true love gave to me, three French Hens, " +
            "two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseThree, TwelveDays.verse(3));
    }

    @Test
    void testVerseFour() {
        String expectedVerseFour = "On the fourth day of Christmas my true love gave to me, four Calling Birds, " +
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseFour, TwelveDays.verse(4));
    }

    @Test
    void testVerseFive() {
        String expectedVerseFive = "On the fifth day of Christmas my true love gave to me, five Gold Rings, " +
            "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseFive, TwelveDays.verse(5));
    }

    @Test
    void testVerseSix() {
        String expectedVerseSix = "On the sixth day of Christmas my true love gave to me, six Geese-a-Laying, " +
            "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
            "and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseSix, TwelveDays.verse(6));
    }

    @Test
    void testVerseSeven() {
        String expectedVerseSeven = "On the seventh day of Christmas my true love gave to me, " +
            "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, " +
            "two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseSeven, TwelveDays.verse(7));
    }

    @Test
    void testVerseEight() {
        String expectedVerseEight = "On the eighth day of Christmas my true love gave to me, eight Maids-a-Milking," +
            " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseEight, TwelveDays.verse(8));
    }

    @Test
    void testVerseNine() {
        String expectedVerseNine = "On the ninth day of Christmas my true love gave to me, nine Ladies Dancing, " +
            "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
            "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseNine, TwelveDays.verse(9));
    }

    @Test
    void testVerseTen() {
        String expectedVerseTen = "On the tenth day of Christmas my true love gave to me, ten Lords-a-Leaping, " +
            "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, " +
            "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
            "and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseTen, TwelveDays.verse(10));
    }

    @Test
    void testVerseEleven() {
        String expectedVerseEleven = "On the eleventh day of Christmas my true love gave to me, " +
            "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
            "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseEleven, TwelveDays.verse(11));
    }

    @Test
    void testVerseTwelve() {
        String expectedVerseTwelve = "On the twelfth day of Christmas my true love gave to me, " +
            "twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, " +
            "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
            "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseTwelve, TwelveDays.verse(12));
    }

    @Test
    void testMultipleVerses() {
        String expectedVerseOneToThree = "On the first day of Christmas my true love gave to me, " +
            "a Partridge in a Pear Tree.\n\n" +
            "On the second day of Christmas my true love gave to me, two Turtle Doves, " +
            "and a Partridge in a Pear Tree.\n\n" +
            "On the third day of Christmas my true love gave to me, three French Hens, two Turtle Doves, " +
            "and a Partridge in a Pear Tree.\n";
        assertEquals(expectedVerseOneToThree, TwelveDays.verses(1, 3));
    }

    @Test
    void testSingWholeSong() {
        String expectedSong = "On the first day of Christmas my true love gave to me, a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the second day of Christmas my true love gave to me, two Turtle Doves, " +
            "and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the third day of Christmas my true love gave to me, three French Hens, two Turtle Doves, " +
            "and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the fourth day of Christmas my true love gave to me, four Calling Birds, three French Hens, " +
            "two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the fifth day of Christmas my true love gave to me, five Gold Rings, four Calling Birds, " +
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the sixth day of Christmas my true love gave to me, six Geese-a-Laying, five Gold Rings, " +
            "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the seventh day of Christmas my true love gave to me, seven Swans-a-Swimming, " +
            "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
            "and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the eighth day of Christmas my true love gave to me, eight Maids-a-Milking, " +
            "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the ninth day of Christmas my true love gave to me, nine Ladies Dancing, eight Maids-a-Milking," +
            " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the tenth day of Christmas my true love gave to me, ten Lords-a-Leaping, nine Ladies Dancing," +
            " eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
            "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the eleventh day of Christmas my true love gave to me, eleven Pipers Piping, " +
            "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, " +
            "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
            "and a Partridge in a Pear Tree.\n" +
            "\n" +
            "On the twelfth day of Christmas my true love gave to me, twelve Drummers Drumming, " +
            "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
            "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
            "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertEquals(expectedSong, TwelveDays.sing());
    }

}
