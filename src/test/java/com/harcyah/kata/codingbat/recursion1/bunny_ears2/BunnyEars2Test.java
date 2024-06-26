package com.harcyah.kata.codingbat.recursion1.bunny_ears2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BunnyEars2Test {

    @Test
    void testBunnyEars2() {
        BunnyEars2 bunnyEars2 = new BunnyEars2();
        assertThat(bunnyEars2.bunnyEars2(0)).isZero();
        assertThat(bunnyEars2.bunnyEars2(1)).isEqualTo(2);
        assertThat(bunnyEars2.bunnyEars2(2)).isEqualTo(5);
        assertThat(bunnyEars2.bunnyEars2(3)).isEqualTo(7);
        assertThat(bunnyEars2.bunnyEars2(4)).isEqualTo(10);
        assertThat(bunnyEars2.bunnyEars2(5)).isEqualTo(12);
        assertThat(bunnyEars2.bunnyEars2(6)).isEqualTo(15);
        assertThat(bunnyEars2.bunnyEars2(10)).isEqualTo(25);
    }

}
