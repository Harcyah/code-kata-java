package com.harcyah.kata.codingbat.functional1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Math1Test {

    @Test
    void testMath1() {
        Math1 math1 = new Math1();
        assertThat(math1.math1(List.of(1, 2, 3)))
            .containsExactly(20, 30, 40);
        assertThat(math1.math1(List.of(6, 8, 6, 8, 1)))
            .containsExactly(70, 90, 70, 90, 20);
        assertThat(math1.math1(List.of(10)))
            .containsExactly(110);
        assertThat(math1.math1(List.of()))
            .containsExactly();
        assertThat(math1.math1(List.of(5, 10)))
            .containsExactly(60, 110);
        assertThat(math1.math1(List.of(-1, -2, -3, -2, -1)))
            .containsExactly(0, -10, -20, -10, 0);
        assertThat(math1.math1(List.of(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2)))
            .containsExactly(70, -20, 130, 240, 50, 20, 200, 120, 30, 40, 30);
    }

}
