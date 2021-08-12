package com.harcyah.kata.misc.dictionary_replacer;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

// Source: https://codingdojo.org/kata/DictionaryReplacer/
class DictionaryReplacerTest {

    @Test
    public void testSample1() {
        Map<String, String> dictionary = Map.of();
        assertThat(DictionaryReplacer.replace("", dictionary)).isEqualTo("");
    }

    @Test
    public void testSample2() {
        Map<String, String> dictionary = Map.of("temp", "temporary");
        assertThat(DictionaryReplacer.replace("$temp$", dictionary)).isEqualTo("temporary");
    }

    @Test
    public void testSample3() {
        Map<String, String> dictionary = Map.of("temp", "temporary", "name", "John Doe");
        assertThat(DictionaryReplacer.replace("$temp$ here comes the name $name$", dictionary)).isEqualTo("temporary here comes the name John Doe");
    }

}
