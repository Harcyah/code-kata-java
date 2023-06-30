package com.harcyah.kata.codingbat.array1.make_pi;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MakePiTest {

    @Test
    void testMakePi() {
        MakePi makePi = new MakePi();
        assertThat(makePi.makePi()).isEqualTo(new int[]{3, 1, 4});
    }

}
