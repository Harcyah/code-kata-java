package com.harcyah.kata.codingbat.array1.plus_two;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlusTwoTest {

    @Test
    void testPlusTwo() {
        PlusTwo plusTwo = new PlusTwo();
        assertThat(plusTwo.plusTwo(new int[]{1, 2}, new int[]{3, 4})).isEqualTo(new int[]{1, 2, 3, 4});
        assertThat(plusTwo.plusTwo(new int[]{4, 4}, new int[]{2, 2})).isEqualTo(new int[]{4, 4, 2, 2});
        assertThat(plusTwo.plusTwo(new int[]{9, 2}, new int[]{3, 4})).isEqualTo(new int[]{9, 2, 3, 4});
    }

}
