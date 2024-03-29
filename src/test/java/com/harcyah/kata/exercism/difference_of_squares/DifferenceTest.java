package com.harcyah.kata.exercism.difference_of_squares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DifferenceTest {

    @Test
    void testSquareOfSum5() {
        final int expected = 225;
        final int actual = Difference.computeSquareOfSumTo(5);
        assertEquals(expected, actual);
    }

    @Test
    void testSquareOfSum10() {
        final int expected = 3025;
        final int actual = Difference.computeSquareOfSumTo(10);
        assertEquals(expected, actual);
    }

    @Test
    void testSquareOfSum100() {
        final int expected = 25502500;
        final int actual = Difference.computeSquareOfSumTo(100);
        assertEquals(expected, actual);
    }

    @Test
    void testSumOfSquares5() {
        final int expected = 55;
        final int actual = Difference.computeSumOfSquaresTo(5);
        assertEquals(expected, actual);
    }

    @Test
    void testSumOfSquares10() {
        final int expected = 385;
        final int actual = Difference.computeSumOfSquaresTo(10);
        assertEquals(expected, actual);
    }

    @Test
    void testSumOfSquares100() {
        final int expected = 338350;
        final int actual = Difference.computeSumOfSquaresTo(100);
        assertEquals(expected, actual);
    }

    @Test
    void testDifferenceOfSquares0() {
        final int expected = 0;
        final int actual = Difference.betweenSquareOfSumAndSumOfSquaresTo(0);
        assertEquals(expected, actual);
    }

    @Test
    void testDifferenceOfSquares5() {
        final int expected = 170;
        final int actual = Difference.betweenSquareOfSumAndSumOfSquaresTo(5);
        assertEquals(expected, actual);
    }

    @Test
    void testDifferenceOfSquares10() {
        final int expected = 2640;
        final int actual = Difference.betweenSquareOfSumAndSumOfSquaresTo(10);
        assertEquals(expected, actual);
    }

    @Test
    void testDifferenceOfSquares100() {
        final int expected = 25164150;
        final int actual = Difference.betweenSquareOfSumAndSumOfSquaresTo(100);
        assertEquals(expected, actual);
    }

}
