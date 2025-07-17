package com.harcyah.kata.misc.version;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VersionComparatorTest {

    private final VersionComparator sut = new VersionComparator();

    @Test
    void testNullOrder() {
        assertThat(sut.compare(null, "2")).isNegative();
        assertThat(sut.compare("2", null)).isPositive();
        assertThat(sut.compare(null, null)).isZero();
    }

    @Test
    void testBasicNumericOrder() {
        assertThat(sut.compare("1", "2")).isNegative();
        assertThat(sut.compare("2", "1")).isPositive();
        assertThat(sut.compare("1", "1")).isZero();
        assertThat(sut.compare("1", "12")).isNegative();
        assertThat(sut.compare("2", "12")).isNegative();
    }

    @Test
    void testSubversionNumericOrder() {
        assertThat(sut.compare("1.1", "1.2")).isNegative();
        assertThat(sut.compare("1.2", "1.1")).isPositive();
        assertThat(sut.compare("1.1", "1.1")).isZero();

        assertThat(sut.compare("1.1", "2.1")).isNegative();
        assertThat(sut.compare("1.2", "2.1")).isNegative();
        assertThat(sut.compare("1.12", "1.1")).isPositive();
    }

    @Test
    void testSubversionLengthOrder() {
        assertThat(sut.compare("1.1", "1.1.1")).isNegative();
        assertThat(sut.compare("1.2", "1.1.1")).isPositive();
    }

    @Test
    void testNumericLessThanNonNumeric() {
        assertThat(sut.compare("1.1", "1.a")).isNegative();
        assertThat(sut.compare("1.2", "1.1a")).isNegative();
        assertThat(sut.compare("1.2", "1.-")).isNegative();
        assertThat(sut.compare("1.2", "1. ")).isNegative();
    }

    @Test
    void testNonNumericOrder() {
        assertThat(sut.compare("a", "b")).isNegative();
        assertThat(sut.compare("B", "a")).isNegative();
        assertThat(sut.compare("a", "ab")).isNegative();
        assertThat(sut.compare("1.1a", "1.1b")).isNegative();
    }

    @Test
    void testMixedNumericNonNumeric() {
        assertThat(sut.compare("2.1b", "3.1a")).isNegative();
        assertThat(sut.compare("3.1.3", "3.1a.2beta")).isNegative();
        assertThat(sut.compare("1.1a.2", "1.1b.1")).isNegative();
    }

}
