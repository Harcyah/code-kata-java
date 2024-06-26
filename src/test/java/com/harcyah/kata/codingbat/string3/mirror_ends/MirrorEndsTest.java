package com.harcyah.kata.codingbat.string3.mirror_ends;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MirrorEndsTest {

    @Test
    void testMirrorEnds() {
        MirrorEnds mirrorEnds = new MirrorEnds();
        assertThat(mirrorEnds.mirrorEnds("abXYZba")).isEqualTo("ab");
        assertThat(mirrorEnds.mirrorEnds("abca")).isEqualTo("a");
        assertThat(mirrorEnds.mirrorEnds("aba")).isEqualTo("aba");
        assertThat(mirrorEnds.mirrorEnds("abab")).isEmpty();
        assertThat(mirrorEnds.mirrorEnds("xxx")).isEqualTo("xxx");
        assertThat(mirrorEnds.mirrorEnds("xxYxx")).isEqualTo("xxYxx");
        assertThat(mirrorEnds.mirrorEnds("Hi and iH")).isEqualTo("Hi ");
        assertThat(mirrorEnds.mirrorEnds("x")).isEqualTo("x");
        assertThat(mirrorEnds.mirrorEnds("")).isEmpty();
        assertThat(mirrorEnds.mirrorEnds("123and then 321")).isEqualTo("123");
        assertThat(mirrorEnds.mirrorEnds("band andab")).isEqualTo("ba");
    }

}
