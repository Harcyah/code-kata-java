package com.harcyah.kata.codingbat.array2.shift_left;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShiftLeftTest {

    @Test
    void testShiftLeft() {
        ShiftLeft shiftLeft = new ShiftLeft();
        assertThat(shiftLeft.shiftLeft(new int[]{6, 2, 5, 3}))
            .isEqualTo(new int[]{2, 5, 3, 6});
        assertThat(shiftLeft.shiftLeft(new int[]{1, 2}))
            .isEqualTo(new int[]{2, 1});
        assertThat(shiftLeft.shiftLeft(new int[]{1}))
            .isEqualTo(new int[]{1});
        assertThat(shiftLeft.shiftLeft(new int[]{}))
            .isEqualTo(new int[]{});
        assertThat(shiftLeft.shiftLeft(new int[]{1, 1, 2, 2, 4}))
            .isEqualTo(new int[]{1, 2, 2, 4, 1});
        assertThat(shiftLeft.shiftLeft(new int[]{1, 1, 1}))
            .isEqualTo(new int[]{1, 1, 1});
        assertThat(shiftLeft.shiftLeft(new int[]{1, 2, 3}))
            .isEqualTo(new int[]{2, 3, 1});
    }

}
