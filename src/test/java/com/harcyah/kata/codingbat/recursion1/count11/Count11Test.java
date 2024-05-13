package com.harcyah.kata.codingbat.recursion1.count11;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Count11Test {

    @Test
    void testCount11() {
        Count11 count11 = new Count11();
        assertThat(count11.count11("11abc11")).isEqualTo(2);
        assertThat(count11.count11("abc11x11x11")).isEqualTo(3);
        assertThat(count11.count11("111")).isEqualTo(1);
        assertThat(count11.count11("1111")).isEqualTo(2);
        assertThat(count11.count11("1")).isZero();
        assertThat(count11.count11("")).isZero();
        assertThat(count11.count11("hi")).isZero();
        assertThat(count11.count11("11x111x1111")).isEqualTo(4);
        assertThat(count11.count11("1x111")).isEqualTo(1);
        assertThat(count11.count11("1Hello1")).isZero();
        assertThat(count11.count11("Hello")).isZero();
    }

}
