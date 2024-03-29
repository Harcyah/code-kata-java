package com.harcyah.kata.codingbat.array1.fix23;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Fix23Test {

    @Test
    void testFix23() {
        Fix23 fix23 = new Fix23();
        assertThat(fix23.fix23(new int[]{1, 2, 3})).isEqualTo(new int[]{1, 2, 0});
        assertThat(fix23.fix23(new int[]{2, 3, 5})).isEqualTo(new int[]{2, 0, 5});
        assertThat(fix23.fix23(new int[]{1, 2, 1})).isEqualTo(new int[]{1, 2, 1});
        assertThat(fix23.fix23(new int[]{3, 2, 1})).isEqualTo(new int[]{3, 2, 1});
        assertThat(fix23.fix23(new int[]{2, 2, 3})).isEqualTo(new int[]{2, 2, 0});
        assertThat(fix23.fix23(new int[]{2, 3, 3})).isEqualTo(new int[]{2, 0, 3});
    }

}
