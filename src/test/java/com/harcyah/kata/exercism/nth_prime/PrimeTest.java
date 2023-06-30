package com.harcyah.kata.exercism.nth_prime;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PrimeTest {

    @Test
    void testFirstPrime() {
        assertThat(Prime.nth(1)).isEqualTo(2);
    }

    @Test
    void testSecondPrime() {
        assertThat(Prime.nth(2)).isEqualTo(3);
    }

    @Test
    void testSixthPrime() {
        assertThat(Prime.nth(6)).isEqualTo(13);
    }

    @Test
    void testBigPrime() {
        assertThat(Prime.nth(10001)).isEqualTo(104743);
    }

    @Test
    void testUndefinedPrime() {
        assertThatThrownBy(() -> Prime.nth(0))
            .isInstanceOf(IllegalArgumentException.class);
    }

}
