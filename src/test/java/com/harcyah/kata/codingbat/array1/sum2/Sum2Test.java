package com.harcyah.kata.codingbat.array1.sum2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Sum2Test {

    @Test
    void testSum2() {
        Sum2 sum2 = new Sum2();
        assertThat(sum2.sum2(new int[]{1, 2, 3})).isEqualTo(3);
        assertThat(sum2.sum2(new int[]{1, 1})).isEqualTo(2);
        assertThat(sum2.sum2(new int[]{1, 1, 1, 1})).isEqualTo(2);
        assertThat(sum2.sum2(new int[]{1, 2})).isEqualTo(3);
        assertThat(sum2.sum2(new int[]{1})).isEqualTo(1);
        assertThat(sum2.sum2(new int[]{})).isZero();
        assertThat(sum2.sum2(new int[]{4, 5, 6})).isEqualTo(9);
        assertThat(sum2.sum2(new int[]{4})).isEqualTo(4);
    }

}
