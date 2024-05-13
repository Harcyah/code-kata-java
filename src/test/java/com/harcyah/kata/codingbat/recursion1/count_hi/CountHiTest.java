package com.harcyah.kata.codingbat.recursion1.count_hi;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountHiTest {

    @Test
    void testCountHi() {
        CountHi countHi = new CountHi();
        assertThat(countHi.countHi("xxhixx")).isEqualTo(1);
        assertThat(countHi.countHi("xhixhix")).isEqualTo(2);
        assertThat(countHi.countHi("hi")).isEqualTo(1);
        assertThat(countHi.countHi("hihih")).isEqualTo(2);
        assertThat(countHi.countHi("h")).isZero();
        assertThat(countHi.countHi("")).isZero();
        assertThat(countHi.countHi("ihihihihih")).isEqualTo(4);
        assertThat(countHi.countHi("ihihihihihi")).isEqualTo(5);
        assertThat(countHi.countHi("hiAAhi12hi")).isEqualTo(3);
        assertThat(countHi.countHi("xhixhxihihhhih")).isEqualTo(3);
        assertThat(countHi.countHi("ship")).isEqualTo(1);
    }

}
