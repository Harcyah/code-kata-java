package com.harcyah.kata.exercism.all_your_base;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BaseConverterTest {

    @Test
    void testSingleBitOneToDecimal() {
        BaseConverter baseConverter = new BaseConverter(2, new int[]{1});

        int[] expectedDigits = new int[]{1};
        int[] actualDigits = baseConverter.convertToBase(10);

        assertArrayEquals(
            expectedDigits,
            actualDigits,
            String.format(
                "Expected digits: %s but found digits: %s",
                Arrays.toString(expectedDigits),
                Arrays.toString(actualDigits))
        );
    }

    @Test
    void testBinaryToSingleDecimal() {
        BaseConverter baseConverter = new BaseConverter(2, new int[]{1, 0, 1});

        int[] expectedDigits = new int[]{5};
        int[] actualDigits = baseConverter.convertToBase(10);

        assertArrayEquals(
            expectedDigits,
            actualDigits,
            String.format(
                "Expected digits: %s but found digits: %s",
                Arrays.toString(expectedDigits),
                Arrays.toString(actualDigits))
        );
    }

    @Test
    void testSingleDecimalToBinary() {
        BaseConverter baseConverter = new BaseConverter(10, new int[]{5});

        int[] expectedDigits = new int[]{1, 0, 1};
        int[] actualDigits = baseConverter.convertToBase(2);

        assertArrayEquals(
            expectedDigits,
            actualDigits,
            String.format(
                "Expected digits: %s but found digits: %s",
                Arrays.toString(expectedDigits),
                Arrays.toString(actualDigits))
        );
    }

    @Test
    void testBinaryToMultipleDecimal() {
        BaseConverter baseConverter = new BaseConverter(2, new int[]{1, 0, 1, 0, 1, 0});

        int[] expectedDigits = new int[]{4, 2};
        int[] actualDigits = baseConverter.convertToBase(10);

        assertArrayEquals(
            expectedDigits,
            actualDigits,
            String.format(
                "Expected digits: %s but found digits: %s",
                Arrays.toString(expectedDigits),
                Arrays.toString(actualDigits))
        );
    }

    @Test
    void testDecimalToBinary() {
        BaseConverter baseConverter = new BaseConverter(10, new int[]{4, 2});

        int[] expectedDigits = new int[]{1, 0, 1, 0, 1, 0};
        int[] actualDigits = baseConverter.convertToBase(2);

        assertArrayEquals(
            expectedDigits,
            actualDigits,
            String.format(
                "Expected digits: %s but found digits: %s",
                Arrays.toString(expectedDigits),
                Arrays.toString(actualDigits))
        );
    }

    @Test
    void testTrinaryToHexadecimal() {
        BaseConverter baseConverter = new BaseConverter(3, new int[]{1, 1, 2, 0});

        int[] expectedDigits = new int[]{2, 10};
        int[] actualDigits = baseConverter.convertToBase(16);

        assertArrayEquals(
            expectedDigits,
            actualDigits,
            String.format(
                "Expected digits: %s but found digits: %s",
                Arrays.toString(expectedDigits),
                Arrays.toString(actualDigits))
        );
    }

    @Test
    void testHexadecimalToTrinary() {
        BaseConverter baseConverter = new BaseConverter(16, new int[]{2, 10});

        int[] expectedDigits = new int[]{1, 1, 2, 0};
        int[] actualDigits = baseConverter.convertToBase(3);

        assertArrayEquals(
            expectedDigits,
            actualDigits,
            String.format(
                "Expected digits: %s but found digits: %s",
                Arrays.toString(expectedDigits),
                Arrays.toString(actualDigits))
        );
    }

    @Test
    void test15BitInteger() {
        BaseConverter baseConverter = new BaseConverter(97, new int[]{3, 46, 60});

        int[] expectedDigits = new int[]{6, 10, 45};
        int[] actualDigits = baseConverter.convertToBase(73);

        assertArrayEquals(
            expectedDigits,
            actualDigits,
            String.format(
                "Expected digits: %s but found digits: %s",
                Arrays.toString(expectedDigits),
                Arrays.toString(actualDigits))
        );
    }

    @Test
    void testEmptyDigits() {
        assertThatThrownBy(() -> new BaseConverter(2, new int[]{}))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("You must supply at least one digit.");
    }

    @Test
    void testSingleZero() {
        BaseConverter baseConverter = new BaseConverter(10, new int[]{0});

        int[] expectedDigits = new int[]{0};
        int[] actualDigits = baseConverter.convertToBase(2);

        assertArrayEquals(
            expectedDigits,
            actualDigits,
            String.format(
                "Expected digits: %s but found digits: %s",
                Arrays.toString(expectedDigits),
                Arrays.toString(actualDigits))
        );
    }

    @Test
    void testMultipleZeros() {
        assertThatThrownBy(() -> new BaseConverter(10, new int[]{0, 0, 0}))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Digits may not contain leading zeros.");
    }

    @Test
    void testLeadingZeros() {
        assertThatThrownBy(() -> new BaseConverter(7, new int[]{0, 6, 0}))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Digits may not contain leading zeros.");
    }

    @Test
    void testNegativeDigit() {
        assertThatThrownBy(() -> new BaseConverter(2, new int[]{1, -1, 1, 0, 1, 0}))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Digits may not be negative.");
    }

    @Test
    void testInvalidPositiveDigit() {
        assertThatThrownBy(() -> new BaseConverter(2, new int[]{1, 2, 1, 0, 1, 0}))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("All digits must be strictly less than the base.");
    }

    @Test
    void testFirstBaseIsOne() {
        assertThatThrownBy(() -> new BaseConverter(1, new int[]{}))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Bases must be at least 2.");
    }

    @Test
    void testSecondBaseIsOne() {
        BaseConverter baseConverter = new BaseConverter(2, new int[]{1, 0, 1, 0, 1, 0});

        assertThatThrownBy(() -> baseConverter.convertToBase(1))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Bases must be at least 2.");
    }

    @Test
    void testFirstBaseIsZero() {
        assertThatThrownBy(() -> new BaseConverter(0, new int[]{}))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Bases must be at least 2.");
    }

    @Test
    void testSecondBaseIsZero() {
        BaseConverter baseConverter = new BaseConverter(2, new int[]{1, 0, 1, 0, 1, 0});

        assertThatThrownBy(() -> baseConverter.convertToBase(0))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Bases must be at least 2.");
    }

    @Test
    void testFirstBaseIsNegative() {
        assertThatThrownBy(() -> new BaseConverter(-2, new int[]{}))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Bases must be at least 2.");
    }

    @Test
    void testSecondBaseIsNegative() {
        BaseConverter baseConverter = new BaseConverter(2, new int[]{1});

        assertThatThrownBy(() -> baseConverter.convertToBase(-7))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Bases must be at least 2.");
    }

}
