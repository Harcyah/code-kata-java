package com.harcyah.kata.codingbat.recursion1.power_n;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PowerNTest {

    @Test
    void testPowerN() {
        PowerN powerN = new PowerN();
        assertThat(powerN.powerN(3, 1))
            .isEqualTo(3);
        assertThat(powerN.powerN(3, 2))
            .isEqualTo(9);
        assertThat(powerN.powerN(3, 3))
            .isEqualTo(27);
        assertThat(powerN.powerN(2, 1))
            .isEqualTo(2);
        assertThat(powerN.powerN(2, 2))
            .isEqualTo(4);
        assertThat(powerN.powerN(2, 3))
            .isEqualTo(8);
        assertThat(powerN.powerN(2, 4))
            .isEqualTo(16);
        assertThat(powerN.powerN(2, 5))
            .isEqualTo(32);
        assertThat(powerN.powerN(10, 1))
            .isEqualTo(10);
        assertThat(powerN.powerN(10, 2))
            .isEqualTo(100);
        assertThat(powerN.powerN(10, 3))
            .isEqualTo(1000);
    }

}
