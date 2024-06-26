package com.harcyah.kata.codingbat.string3.sum_digits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumDigitsTest {

    @Test
    void testSumDigits() {
        SumDigits sumDigits = new SumDigits();
        assertThat(sumDigits.sumDigits("aa1bc2d3")).isEqualTo(6);
        assertThat(sumDigits.sumDigits("aa11b33")).isEqualTo(8);
        assertThat(sumDigits.sumDigits("Chocolate")).isZero();
        assertThat(sumDigits.sumDigits("5hoco1a1e")).isEqualTo(7);
        assertThat(sumDigits.sumDigits("123abc123")).isEqualTo(12);
        assertThat(sumDigits.sumDigits("")).isZero();
        assertThat(sumDigits.sumDigits("Hello")).isZero();
        assertThat(sumDigits.sumDigits("X1z9b2")).isEqualTo(12);
        assertThat(sumDigits.sumDigits("5432a")).isEqualTo(14);
    }

}
