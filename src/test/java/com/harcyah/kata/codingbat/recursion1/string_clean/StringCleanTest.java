package com.harcyah.kata.codingbat.recursion1.string_clean;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCleanTest {

    @Test
    void testStringClean() {
        StringClean stringClean = new StringClean();
        assertThat(stringClean.stringClean("yyzzza")).isEqualTo("yza");
        assertThat(stringClean.stringClean("abbbcdd")).isEqualTo("abcd");
        assertThat(stringClean.stringClean("Hello")).isEqualTo("Helo");
        assertThat(stringClean.stringClean("XXabcYY")).isEqualTo("XabcY");
        assertThat(stringClean.stringClean("112ab445")).isEqualTo("12ab45");
        assertThat(stringClean.stringClean("Hello Bookkeeper")).isEqualTo("Helo Bokeper");
    }

}
