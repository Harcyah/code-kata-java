package com.harcyah.kata.codingbat.recursion1.change_pi;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ChangePiTest {

    @Test
    void testChangePi() {
        ChangePi changePi = new ChangePi();
        assertThat(changePi.changePi("xpix")).isEqualTo("x3.14x");
        assertThat(changePi.changePi("pipi")).isEqualTo("3.143.14");
        assertThat(changePi.changePi("pip")).isEqualTo("3.14p");
        assertThat(changePi.changePi("pi")).isEqualTo("3.14");
        assertThat(changePi.changePi("hip")).isEqualTo("hip");
        assertThat(changePi.changePi("p")).isEqualTo("p");
        assertThat(changePi.changePi("x")).isEqualTo("x");
        assertThat(changePi.changePi("")).isEmpty();
        assertThat(changePi.changePi("pixx")).isEqualTo("3.14xx");
        assertThat(changePi.changePi("xyzzy")).isEqualTo("xyzzy");
    }

}
