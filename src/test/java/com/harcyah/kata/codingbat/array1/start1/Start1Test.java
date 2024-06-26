package com.harcyah.kata.codingbat.array1.start1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Start1Test {

    @Test
    void testStart1() {
        Start1 start1 = new Start1();
        assertThat(start1.start1(new int[]{1, 2, 3}, new int[]{1, 3})).isEqualTo(2);
        assertThat(start1.start1(new int[]{7, 2, 3}, new int[]{1})).isEqualTo(1);
        assertThat(start1.start1(new int[]{1, 2}, new int[]{})).isEqualTo(1);
        assertThat(start1.start1(new int[]{}, new int[]{1, 2})).isEqualTo(1);
        assertThat(start1.start1(new int[]{7}, new int[]{})).isZero();
        assertThat(start1.start1(new int[]{7}, new int[]{1})).isEqualTo(1);
        assertThat(start1.start1(new int[]{1}, new int[]{1})).isEqualTo(2);
        assertThat(start1.start1(new int[]{7}, new int[]{8})).isZero();
        assertThat(start1.start1(new int[]{}, new int[]{})).isZero();
        assertThat(start1.start1(new int[]{1, 3}, new int[]{1})).isEqualTo(2);
    }

}
