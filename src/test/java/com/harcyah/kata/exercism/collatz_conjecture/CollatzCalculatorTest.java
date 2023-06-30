package com.harcyah.kata.exercism.collatz_conjecture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CollatzCalculatorTest {

    private CollatzCalculator collatzCalculator;

    @BeforeEach
    void setUp() {
        collatzCalculator = new CollatzCalculator();
    }

    @Test
    void testZeroStepsRequiredWhenStartingFrom1() {
        assertEquals(0, collatzCalculator.computeStepCount(1));
    }

    @Test
    void testCorrectNumberOfStepsWhenAllStepsAreDivisions() {
        assertEquals(4, collatzCalculator.computeStepCount(16));
    }

    @Test
    void testCorrectNumberOfStepsWhenBothStepTypesAreNeeded() {
        assertEquals(9, collatzCalculator.computeStepCount(12));
    }

    @Test
    void testAVeryLargeInput() {
        assertEquals(152, collatzCalculator.computeStepCount(1000000));
    }

    @Test
    void testZeroIsConsideredInvalidInput() {
        assertThatThrownBy(() -> collatzCalculator.computeStepCount(0))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Only natural numbers are allowed");
    }

    @Test
    void testNegativeIntegerIsConsideredInvalidInput() {
        assertThatThrownBy(() -> collatzCalculator.computeStepCount(-15))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Only natural numbers are allowed");
    }

}
