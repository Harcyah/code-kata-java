package com.harcyah.kata.pape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallestDistanceBetweenTwoNeighbouringTest {

    @Test
    void testGetFirstTest() {
        SmallestDistanceBetweenTwoNeighbouring problem = new SmallestDistanceBetweenTwoNeighbouring();
        int index = problem.get(new int[]{4, 8, 6, 1, 2, 9, 4});
        assertEquals(3, index);
    }

    @Test
    void testGetPrimeNumbers() {
        SmallestDistanceBetweenTwoNeighbouring problem = new SmallestDistanceBetweenTwoNeighbouring();
        int index = problem.get(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53});
        assertEquals(0, index);
    }

    @Test
    void testGetPrimeNumbersReversed() {
        SmallestDistanceBetweenTwoNeighbouring problem = new SmallestDistanceBetweenTwoNeighbouring();
        int index = problem.get(new int[]{53, 47, 43, 41, 37, 31, 29, 23, 19, 17, 13, 11, 7, 5, 3, 2});
        assertEquals(14, index);
    }

}
