package com.harcyah.kata.exercism.series;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SeriesTest {

    @Test
    void hasDigitsShort() {
        Series sut = new Series("01234");
        List<Integer> expected = List.of(0, 1, 2, 3, 4);
        List<Integer> actual = sut.getDigits();
        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

    @Test
    void hasDigitsLong() {
        Series sut = new Series("0123456789");
        List<Integer> expected = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> actual = sut.getDigits();
        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

    @Test
    void keepsTheDigitOrderIfReversed() {
        Series sut = new Series("9876543210");
        List<Integer> expected = List.of(9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
        List<Integer> actual = sut.getDigits();
        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

    @Test
    void keepsArbitraryDigitOrder() {
        Series sut = new Series("936923468");
        List<Integer> expected = List.of(9, 3, 6, 9, 2, 3, 4, 6, 8);
        List<Integer> actual = sut.getDigits();
        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

    @Test
    void canSliceByOne() {
        Series sut = new Series("01234");
        List<List<Integer>> expected = List.of(
                List.of(0),
                List.of(1),
                List.of(2),
                List.of(3),
                List.of(4));
        List<List<Integer>> actual = sut.slices(1);
        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

    @Test
    void canSliceByTwo() {
        Series sut = new Series("98273463");
        List<List<Integer>> expected = List.of(
                List.of(9, 8),
                List.of(8, 2),
                List.of(2, 7),
                List.of(7, 3),
                List.of(3, 4),
                List.of(4, 6),
                List.of(6, 3));
        List<List<Integer>> actual = sut.slices(2);
        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

    @Test
    void canSliceByThree() {
        Series sut = new Series("01234");
        List<List<Integer>> expected = List.of(
                List.of(0, 1, 2),
                List.of(1, 2, 3),
                List.of(2, 3, 4));
        List<List<Integer>> actual = sut.slices(3);
        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

    @Test
    void canSliceByThreeWithDuplicateDigits() {
        Series sut = new Series("31001");
        List<List<Integer>> expected = List.of(
                List.of(3, 1, 0),
                List.of(1, 0, 0),
                List.of(0, 0, 1));
        List<List<Integer>> actual = sut.slices(3);
        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

    @Test
    void canSliceByFour() {
        Series sut = new Series("91274");
        List<List<Integer>> expected = List.of(
                List.of(9, 1, 2, 7),
                List.of(1, 2, 7, 4));
        List<List<Integer>> actual = sut.slices(4);
        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

    @Test
    void canSliceByFive() {
        Series sut = new Series("81228");
        List<List<Integer>> expected = List.of(
                List.of(8, 1, 2, 2, 8));
        List<List<Integer>> actual = sut.slices(5);
        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals(expected, actual);
    }

    @Test
    void throwsAnErrorIfNotEnoughDigitsToSlice() {
        assertThatThrownBy(() -> new Series("01032987583").slices(12))
            .isInstanceOf(IllegalArgumentException.class);
    }

}
