package com.harcyah.kata.codingbat.map2.first_char;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class FirstCharTest {

    @Test
    void testFirstChar() {
        FirstChar firstChar = new FirstChar();
        assertThat(firstChar.firstChar(new String[] { "salt", "tea", "soda", "toast" }))
            .isEqualTo(Map.of("t", "teatoast", "s", "saltsoda"));
        assertThat(firstChar.firstChar(new String[] { "aa", "bb", "cc", "aAA", "cCC", "d" }))
            .isEqualTo(Map.of("d", "d", "b", "bb", "c", "cccCC", "a", "aaaAA"));
        assertThat(firstChar.firstChar(new String[] {}))
            .isEqualTo(Map.of());
        assertThat(firstChar.firstChar(new String[] { "apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells" }))
            .isEqualTo(Map.of("s", "saltsun", "b", "bellsbellsbells", "a", "appleaardvark", "z", "zen"));
    }

}
