package com.harcyah.kata.codingbat.string3.happy_g;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HappyGTest {

    @Test
    void testHappyG() {
        HappyG sut = new HappyG();
        assertThat(sut.happyG("xxggxx")).isTrue();
        assertThat(sut.happyG("xxgxx")).isFalse();
        assertThat(sut.happyG("xxggyygxx")).isFalse();
        assertThat(sut.happyG("g")).isFalse();
        assertThat(sut.happyG("gg")).isTrue();
        assertThat(sut.happyG("")).isTrue();
        assertThat(sut.happyG("xxgggxyz")).isTrue();
        assertThat(sut.happyG("xxgggxyg")).isFalse();
        assertThat(sut.happyG("xxgggxygg")).isTrue();
        assertThat(sut.happyG("mgm")).isFalse();
        assertThat(sut.happyG("mggm")).isTrue();
        assertThat(sut.happyG("yyygggxyy")).isTrue();
    }

}
