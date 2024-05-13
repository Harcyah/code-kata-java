package com.harcyah.kata.exercism.pythagorean_triplet;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PythagoreanTripletTest {

    @Test
    void shouldCalculateSum() {
        PythagoreanTriplet sut = new PythagoreanTriplet(3, 4, 5);
        final int expected = 12;
        final int actual = sut.calculateSum();
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateProduct() {
        PythagoreanTriplet sut = new PythagoreanTriplet(3, 4, 5);
        final long expected = 60L;
        final long actual = sut.calculateProduct();
        assertEquals(expected, actual);
    }

    @Test
    void testIsPythagoreanOK() {
        PythagoreanTriplet sut = new PythagoreanTriplet(3, 4, 5);
        assertTrue(sut.isPythagorean());
    }

    @Test
    void testIsPythagoreanFail() {
        PythagoreanTriplet sut = new PythagoreanTriplet(5, 6, 7);
        assertFalse(sut.isPythagorean());
    }

    @Test
    void shouldMakeTripletsUpToTen() {
        final List<Long> actual
                = PythagoreanTriplet
                .makeTripletsList()
                .withFactorsLessThanOrEqualTo(10)
                .build()
                .stream()
                .map(PythagoreanTriplet::calculateProduct)
                .sorted()
                .toList();
        final List<Long> expected = List.of(60L, 480L);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMakeTripletsElevenToTwenty() {
        final List<Long> actual
                = PythagoreanTriplet
                .makeTripletsList()
                .withFactorsGreaterThanOrEqualTo(11)
                .withFactorsLessThanOrEqualTo(20)
                .build()
                .stream()
                .map(PythagoreanTriplet::calculateProduct)
                .sorted(Double::compare)
                .toList();
        final List<Long> expected = List.of(3840L);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMakeTripletsAndFilterOnSum() {
        final List<Long> actual
                = PythagoreanTriplet
                .makeTripletsList()
                .withFactorsLessThanOrEqualTo(100)
                .thatSumTo(180)
                .build()
                .stream()
                .map(PythagoreanTriplet::calculateProduct)
                .sorted(Double::compare)
                .toList();
        final List<Long> expected = List.of(118080L, 168480L, 202500L);
        assertEquals(expected, actual);
    }

}
