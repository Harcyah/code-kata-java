package com.harcyah.kata.codingbat.string3.count_triple;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountTripleTest {

    @Test
    void testCountTriple() {
        CountTriple sut = new CountTriple();
        assertThat(sut.countTriple("abcXXXabc")).isEqualTo(1);
        assertThat(sut.countTriple("xxxabyyyycd")).isEqualTo(3);
        assertThat(sut.countTriple("a")).isEqualTo(0);
        assertThat(sut.countTriple("")).isEqualTo(0);
        assertThat(sut.countTriple("XXXabc")).isEqualTo(1);
        assertThat(sut.countTriple("XXXXabc")).isEqualTo(2);
        assertThat(sut.countTriple("XXXXXabc")).isEqualTo(3);
        assertThat(sut.countTriple("222abyyycdXXX")).isEqualTo(3);
        assertThat(sut.countTriple("abYYYabXXXXXab")).isEqualTo(4);
        assertThat(sut.countTriple("abYYXabXXYXXab")).isEqualTo(0);
        assertThat(sut.countTriple("abYYXabXXYXXab")).isEqualTo(0);
        assertThat(sut.countTriple("122abhhh2")).isEqualTo(1);
    }

}
