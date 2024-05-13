package com.harcyah.kata.codingbat.recursion1.count_x;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountXTest {

    @Test
    void testCountX() {
        CountX countX = new CountX();
        assertThat(countX.countX("xxhixx"))
            .isEqualTo(4);
        assertThat(countX.countX("xhixhix"))
            .isEqualTo(3);
        assertThat(countX.countX("hi"))
            .isZero();
        assertThat(countX.countX("h"))
            .isZero();
        assertThat(countX.countX("x"))
            .isEqualTo(1);
        assertThat(countX.countX(""))
            .isZero();
        assertThat(countX.countX("hihi"))
            .isZero();
        assertThat(countX.countX("hiAAhi12hi"))
            .isZero();
    }

}
