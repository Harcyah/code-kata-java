package com.harcyah.kata.codingbat.array3.count_clumps;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountClumpsTest {

    @Test
    void testCountClumps() {
        CountClumps countClumps = new CountClumps();
        assertThat(countClumps.countClumps(new int[]{1, 2, 2, 3, 4, 4})).isEqualTo(2);
        assertThat(countClumps.countClumps(new int[]{1, 1, 2, 1, 1})).isEqualTo(2);
        assertThat(countClumps.countClumps(new int[]{1, 1, 1, 1, 1})).isEqualTo(1);
        assertThat(countClumps.countClumps(new int[]{1, 2, 3})).isZero();
        assertThat(countClumps.countClumps(new int[]{2, 2, 1, 1, 1, 2, 1, 1, 2, 2})).isEqualTo(4);
        assertThat(countClumps.countClumps(new int[]{0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2})).isEqualTo(4);
        assertThat(countClumps.countClumps(new int[]{0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2})).isEqualTo(5);
        assertThat(countClumps.countClumps(new int[]{0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2})).isEqualTo(5);
        assertThat(countClumps.countClumps(new int[]{})).isZero();
    }

}
