package com.harcyah.kata.codingbat.warmup2.array_front9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayFront9Test {

    @Test
    void testArrayFront9() {
        ArrayFront9 arrayFront9 = new ArrayFront9();
        assertTrue(arrayFront9.arrayFront9(new int[]{1, 2, 9, 3, 4}));
        assertFalse(arrayFront9.arrayFront9(new int[]{1, 2, 3, 4, 9}));
        assertFalse(arrayFront9.arrayFront9(new int[]{1, 2, 3, 4, 5}));
        assertTrue(arrayFront9.arrayFront9(new int[]{9, 2, 3}));
        assertTrue(arrayFront9.arrayFront9(new int[]{1, 9, 9}));
        assertFalse(arrayFront9.arrayFront9(new int[]{1, 2, 3}));
        assertTrue(arrayFront9.arrayFront9(new int[]{1, 9}));
        assertFalse(arrayFront9.arrayFront9(new int[]{5, 5}));
        assertFalse(arrayFront9.arrayFront9(new int[]{2}));
        assertTrue(arrayFront9.arrayFront9(new int[]{9}));
        assertFalse(arrayFront9.arrayFront9(new int[]{}));
        assertTrue(arrayFront9.arrayFront9(new int[]{3, 9, 2, 3, 3}));
    }

}
