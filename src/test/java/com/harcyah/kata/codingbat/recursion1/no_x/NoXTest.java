package com.harcyah.kata.codingbat.recursion1.no_x;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NoXTest {

    @Test
    void testNoX() {
        NoX noX = new NoX();
        assertThat(noX.noX("xaxb")).isEqualTo("ab");
        assertThat(noX.noX("abc")).isEqualTo("abc");
        assertThat(noX.noX("xx")).isEmpty();
        assertThat(noX.noX("")).isEmpty();
        assertThat(noX.noX("axxbxx")).isEqualTo("ab");
        assertThat(noX.noX("Hellox")).isEqualTo("Hello");
    }

}
