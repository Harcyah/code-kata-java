package com.harcyah.kata.codingbat.string3.sum_numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumNumbersTest {

    @Test
    void testSumNumbers() {
        SumNumbers sumNumbers = new SumNumbers();
        assertThat(sumNumbers.sumNumbers("abc123xyz")).isEqualTo(123);
        assertThat(sumNumbers.sumNumbers("aa11b33")).isEqualTo(44);
        assertThat(sumNumbers.sumNumbers("7 11")).isEqualTo(18);
        assertThat(sumNumbers.sumNumbers("Chocolate")).isZero();
        assertThat(sumNumbers.sumNumbers("5hoco1a1e")).isEqualTo(7);
        assertThat(sumNumbers.sumNumbers("5$$1;;1!!")).isEqualTo(7);
        assertThat(sumNumbers.sumNumbers("a1234bb11")).isEqualTo(1245);
        assertThat(sumNumbers.sumNumbers("")).isZero();
        assertThat(sumNumbers.sumNumbers("a22bbb3")).isEqualTo(25);
    }

}
