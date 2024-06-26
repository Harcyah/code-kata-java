package com.harcyah.kata.codingbat.recursion1.bunny_ears;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BunnyEarsTest {

    @Test
    void testBunnyEars() {
        BunnyEars bunnyEars = new BunnyEars();
        assertThat(bunnyEars.bunnyEars(0)).isZero();
        assertThat(bunnyEars.bunnyEars(1)).isEqualTo(2);
        assertThat(bunnyEars.bunnyEars(2)).isEqualTo(4);
        assertThat(bunnyEars.bunnyEars(3)).isEqualTo(6);
        assertThat(bunnyEars.bunnyEars(4)).isEqualTo(8);
        assertThat(bunnyEars.bunnyEars(5)).isEqualTo(10);
        assertThat(bunnyEars.bunnyEars(12)).isEqualTo(24);
        assertThat(bunnyEars.bunnyEars(50)).isEqualTo(100);
        assertThat(bunnyEars.bunnyEars(234)).isEqualTo(468);
    }

}
