package com.harcyah.kata.codingbat.map2.pairs;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class PairsTest {

    @Test
    void pairs() {
        Pairs pairs = new Pairs();
        assertThat(pairs.pairs(new String[]{"code", "bug"})).isEqualTo(Map.of("b", "g", "c", "e"));
        assertThat(pairs.pairs(new String[]{"man", "moon", "main"})).isEqualTo(Map.of("m", "n"));
        assertThat(pairs.pairs(new String[]{"man", "moon", "good", "night"})).isEqualTo(Map.of("g", "d", "n", "t", "m", "n"));
        assertThat(pairs.pairs(new String[]{})).isEqualTo(Map.of());
        assertThat(pairs.pairs(new String[]{"a", "b"})).isEqualTo(Map.of("b", "b", "a", "a"));
        assertThat(pairs.pairs(new String[]{"are", "codes", "and", "cods"})).isEqualTo(Map.of("c", "s", "a", "d"));
        assertThat(pairs.pairs(new String[]{"apple", "banana", "tea", "coffee"})).isEqualTo(Map.of("t", "a", "b", "a", "c", "e", "a", "e"));
    }

}
