package com.harcyah.kata.codingbat.array1.same_first_last;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SameFirstLastTest {

    @Test
    void testSameFirstLast() {
        SameFirstLast sameFirstLast = new SameFirstLast();
        assertThat(sameFirstLast.sameFirstLast(new int[]{1, 2, 3})).isFalse();
        assertThat(sameFirstLast.sameFirstLast(new int[]{1, 2, 3, 1})).isTrue();
        assertThat(sameFirstLast.sameFirstLast(new int[]{1, 2, 1})).isTrue();
        assertThat(sameFirstLast.sameFirstLast(new int[]{7})).isTrue();
        assertThat(sameFirstLast.sameFirstLast(new int[]{})).isFalse();
        assertThat(sameFirstLast.sameFirstLast(new int[]{1, 2, 3, 4, 5, 1})).isTrue();
        assertThat(sameFirstLast.sameFirstLast(new int[]{1, 2, 3, 4, 5, 13})).isFalse();
        assertThat(sameFirstLast.sameFirstLast(new int[]{13, 2, 3, 4, 5, 13})).isTrue();
        assertThat(sameFirstLast.sameFirstLast(new int[]{7, 7})).isTrue();
    }

}
