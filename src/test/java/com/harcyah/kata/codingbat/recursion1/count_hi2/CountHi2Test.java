package com.harcyah.kata.codingbat.recursion1.count_hi2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountHi2Test {

    @Test
    void testCountHi2() {
        CountHi2 countHi2 = new CountHi2();
        assertThat(countHi2.countHi2("ahixhi")).isEqualTo(1);
        assertThat(countHi2.countHi2("ahibhi")).isEqualTo(2);
        assertThat(countHi2.countHi2("xhixhi")).isZero();
        assertThat(countHi2.countHi2("hixhi")).isEqualTo(1);
        assertThat(countHi2.countHi2("hixhhi")).isEqualTo(2);
        assertThat(countHi2.countHi2("hihihi")).isEqualTo(3);
        assertThat(countHi2.countHi2("hihihix")).isEqualTo(3);
        assertThat(countHi2.countHi2("xhihihix")).isEqualTo(2);
        assertThat(countHi2.countHi2("xxhi")).isZero();
        assertThat(countHi2.countHi2("hixxhi")).isEqualTo(1);
        assertThat(countHi2.countHi2("hi")).isEqualTo(1);
        assertThat(countHi2.countHi2("xxxx")).isZero();
        assertThat(countHi2.countHi2("h")).isZero();
        assertThat(countHi2.countHi2("x")).isZero();
        assertThat(countHi2.countHi2("")).isZero();
        assertThat(countHi2.countHi2("Hellohi")).isEqualTo(1);
    }

}
