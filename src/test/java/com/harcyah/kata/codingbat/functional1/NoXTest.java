package com.harcyah.kata.codingbat.functional1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class NoXTest {

    @Test
    void testNoX() {
        NoX noX = new NoX();
        assertThat(noX.noX(List.of("ax", "bb", "cx")))
            .containsExactly("a", "bb", "c");
        assertThat(noX.noX(List.of("xxax", "xbxbx", "xxcx")))
            .containsExactly("a", "bb", "c");
        assertThat(noX.noX(List.of("x")))
            .containsExactly("");
        assertThat(noX.noX(List.of("")))
            .containsExactly("");
        assertThat(noX.noX(List.of()))
            .containsExactly();
        assertThat(noX.noX(List.of("the", "taxi")))
            .containsExactly("the", "tai");
        assertThat(noX.noX(List.of("the", "xxtxaxixxx")))
            .containsExactly("the", "tai");
        assertThat(noX.noX(List.of("this", "is", "the", "x")))
            .containsExactly("this", "is", "the", "");
    }

}
