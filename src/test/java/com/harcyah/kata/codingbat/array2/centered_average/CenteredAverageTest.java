package com.harcyah.kata.codingbat.array2.centered_average;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CenteredAverageTest {

    @Test
    void testCenteredAverage() {
        CenteredAverage centeredAverage = new CenteredAverage();
        assertThat(centeredAverage.centeredAverage(new int[]{1, 2, 3, 4, 100}))
            .isEqualTo(3);
        assertThat(centeredAverage.centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}))
            .isEqualTo(5);
        assertThat(centeredAverage.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}))
            .isEqualTo(-3);
        assertThat(centeredAverage.centeredAverage(new int[]{5, 3, 4, 6, 2}))
            .isEqualTo(4);
        assertThat(centeredAverage.centeredAverage(new int[]{5, 3, 4, 0, 100}))
            .isEqualTo(4);
        assertThat(centeredAverage.centeredAverage(new int[]{100, 0, 5, 3, 4}))
            .isEqualTo(4);
        assertThat(centeredAverage.centeredAverage(new int[]{4, 0, 100}))
            .isEqualTo(4);
        assertThat(centeredAverage.centeredAverage(new int[]{0, 2, 3, 4, 100}))
            .isEqualTo(3);
        assertThat(centeredAverage.centeredAverage(new int[]{1, 1, 100}))
            .isEqualTo(1);
        assertThat(centeredAverage.centeredAverage(new int[]{7, 7, 7}))
            .isEqualTo(7);
        assertThat(centeredAverage.centeredAverage(new int[]{1, 7, 8}))
            .isEqualTo(7);
        assertThat(centeredAverage.centeredAverage(new int[]{1, 1, 99, 99}))
            .isEqualTo(50);
        assertThat(centeredAverage.centeredAverage(new int[]{1000, 0, 1, 99}))
            .isEqualTo(50);
        assertThat(centeredAverage.centeredAverage(new int[]{4, 4, 4, 4, 5}))
            .isEqualTo(4);
        assertThat(centeredAverage.centeredAverage(new int[]{4, 4, 4, 1, 5}))
            .isEqualTo(4);
        assertThat(centeredAverage.centeredAverage(new int[]{6, 4, 8, 12, 3}))
            .isEqualTo(6);
    }

}

