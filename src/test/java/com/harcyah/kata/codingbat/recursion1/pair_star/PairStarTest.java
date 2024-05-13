package com.harcyah.kata.codingbat.recursion1.pair_star;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PairStarTest {

    @Test
    void testPairStar() {
        PairStar pairStar = new PairStar();
        assertThat(pairStar.pairStar("hello")).isEqualTo("hel*lo");
        assertThat(pairStar.pairStar("xxyy")).isEqualTo("x*xy*y");
        assertThat(pairStar.pairStar("aaaa")).isEqualTo("a*a*a*a");
        assertThat(pairStar.pairStar("aaab")).isEqualTo("a*a*ab");
        assertThat(pairStar.pairStar("aa")).isEqualTo("a*a");
        assertThat(pairStar.pairStar("a")).isEqualTo("a");
        assertThat(pairStar.pairStar("")).isEmpty();
        assertThat(pairStar.pairStar("noadjacent")).isEqualTo("noadjacent");
        assertThat(pairStar.pairStar("abba")).isEqualTo("ab*ba");
        assertThat(pairStar.pairStar("abbba")).isEqualTo("ab*b*ba");
    }

}
