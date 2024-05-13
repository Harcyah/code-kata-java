package com.harcyah.kata.codingbat.string3.same_ends;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SameEndsTest {

    @Test
    void testSameEnds() {
        SameEnds sameEnds = new SameEnds();
        assertThat(sameEnds.sameEnds("abXYab")).isEqualTo("ab");
        assertThat(sameEnds.sameEnds("xx")).isEqualTo("x");
        assertThat(sameEnds.sameEnds("xxx")).isEqualTo("x");
        assertThat(sameEnds.sameEnds("xxxx")).isEqualTo("xx");
        assertThat(sameEnds.sameEnds("javaXYZjava")).isEqualTo("java");
        assertThat(sameEnds.sameEnds("javajava")).isEqualTo("java");
        assertThat(sameEnds.sameEnds("xavaXYZjava")).isEmpty();
        assertThat(sameEnds.sameEnds("Hello! and Hello!")).isEqualTo("Hello!");
        assertThat(sameEnds.sameEnds("x")).isEmpty();
        assertThat(sameEnds.sameEnds("")).isEmpty();
        assertThat(sameEnds.sameEnds("abcb")).isEmpty();
        assertThat(sameEnds.sameEnds("mymmy")).isEqualTo("my");
    }

}
