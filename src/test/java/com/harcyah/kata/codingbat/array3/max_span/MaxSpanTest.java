package com.harcyah.kata.codingbat.array3.max_span;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxSpanTest {

    @Test
    void testMaxSpan() {
        MaxSpan maxSpan = new MaxSpan();
        assertThat(maxSpan.maxSpan(new int[]{1, 2, 1, 1, 3})).isEqualTo(4);
        assertThat(maxSpan.maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4})).isEqualTo(6);
        assertThat(maxSpan.maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4})).isEqualTo(6);
        assertThat(maxSpan.maxSpan(new int[]{3, 3, 3})).isEqualTo(3);
        assertThat(maxSpan.maxSpan(new int[]{3, 9, 3})).isEqualTo(3);
        assertThat(maxSpan.maxSpan(new int[]{3, 9, 9})).isEqualTo(2);
        assertThat(maxSpan.maxSpan(new int[]{3, 9})).isEqualTo(1);
        assertThat(maxSpan.maxSpan(new int[]{3, 3})).isEqualTo(2);
        assertThat(maxSpan.maxSpan(new int[]{})).isZero();
        assertThat(maxSpan.maxSpan(new int[]{1})).isEqualTo(1);
    }

}
