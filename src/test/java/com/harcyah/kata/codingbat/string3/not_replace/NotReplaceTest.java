package com.harcyah.kata.codingbat.string3.not_replace;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NotReplaceTest {

    @Test
    void testNotReplace() {
        NotReplace notReplace = new NotReplace();
        assertThat(notReplace.notReplace("is test")).isEqualTo("is not test");
        assertThat(notReplace.notReplace("is-is")).isEqualTo("is not-is not");
        assertThat(notReplace.notReplace("This is right")).isEqualTo("This is not right");
        assertThat(notReplace.notReplace("This is isabell")).isEqualTo("This is not isabell");
        assertThat(notReplace.notReplace("")).isEmpty();
        assertThat(notReplace.notReplace("is")).isEqualTo("is not");
        assertThat(notReplace.notReplace("isis")).isEqualTo("isis");
        assertThat(notReplace.notReplace("Dis is bliss is")).isEqualTo("Dis is not bliss is not");
        assertThat(notReplace.notReplace("is his")).isEqualTo("is not his");
        assertThat(notReplace.notReplace("xis yis")).isEqualTo("xis yis");
        assertThat(notReplace.notReplace("AAAis is")).isEqualTo("AAAis is not");
    }

}
