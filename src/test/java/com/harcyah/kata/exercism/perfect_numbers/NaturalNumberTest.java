package com.harcyah.kata.exercism.perfect_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NaturalNumberTest {

    @Test
    void testSmallPerfectNumberIsClassifiedCorrectly() {
        assertEquals(Classification.PERFECT, new NaturalNumber(6).getClassification());
    }

    @Test
    void testMediumPerfectNumberIsClassifiedCorrectly() {
        assertEquals(Classification.PERFECT, new NaturalNumber(28).getClassification());
    }

    @Test
    void testLargePerfectNumberIsClassifiedCorrectly() {
        assertEquals(Classification.PERFECT, new NaturalNumber(33550336).getClassification());
    }

    @Test
    void testSmallAbundantNumberIsClassifiedCorrectly() {
        assertEquals(Classification.ABUNDANT, new NaturalNumber(12).getClassification());
    }

    @Test
    void testMediumAbundantNumberIsClassifiedCorrectly() {
        assertEquals(Classification.ABUNDANT, new NaturalNumber(24).getClassification());
    }

    @Test
    void testLargeAbundantNumberIsClassifiedCorrectly() {
        assertEquals(Classification.ABUNDANT, new NaturalNumber(33550335).getClassification());
    }

    @Test
    void testSmallDeficientNumberIsClassifiedCorrectly() {
        assertEquals(Classification.DEFICIENT, new NaturalNumber(8).getClassification());
    }

    @Test
    void testMediumNumberIsClassifiedCorrectly() {
        assertEquals(Classification.DEFICIENT, new NaturalNumber(31).getClassification());
    }

    @Test
    void testLargeDeficientNumberIsClassifiedCorrectly() {
        assertEquals(Classification.DEFICIENT, new NaturalNumber(33550337).getClassification());
    }

}
