package com.harcyah.kata.codingbat.string3.without_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WithoutStringTest {

    @Test
    void testWithoutString() {
        WithoutString withoutString = new WithoutString();
        assertThat(withoutString.withoutString("Hello there", "llo")).isEqualTo("He there");
        assertThat(withoutString.withoutString("Hello there", "e")).isEqualTo("Hllo thr");
        assertThat(withoutString.withoutString("Hello there", "x")).isEqualTo("Hello there");
        assertThat(withoutString.withoutString("This is a FISH", "IS")).isEqualTo("Th  a FH");
        assertThat(withoutString.withoutString("THIS is a FISH", "is")).isEqualTo("TH  a FH");
        assertThat(withoutString.withoutString("THIS is a FISH", "iS")).isEqualTo("TH  a FH");
        assertThat(withoutString.withoutString("abxxxxab", "xx")).isEqualTo("abab");
        assertThat(withoutString.withoutString("abxxxab", "xx")).isEqualTo("abxab");
        assertThat(withoutString.withoutString("abxxxab", "x")).isEqualTo("abab");
        assertThat(withoutString.withoutString("xxx", "x")).isEmpty();
        assertThat(withoutString.withoutString("xxx", "xx")).isEqualTo("x");
        assertThat(withoutString.withoutString("xyzzy", "Y")).isEqualTo("xzz");
        assertThat(withoutString.withoutString("", "x")).isEmpty();
        assertThat(withoutString.withoutString("abcabc", "b")).isEqualTo("acac");
        assertThat(withoutString.withoutString("AA22bb", "2")).isEqualTo("AAbb");
        assertThat(withoutString.withoutString("1111", "1")).isEmpty();
        assertThat(withoutString.withoutString("1111", "11")).isEmpty();
        assertThat(withoutString.withoutString("MkjtMkx", "Mk")).isEqualTo("jtx");
        assertThat(withoutString.withoutString("Hi HoHo", "Ho")).isEqualTo("Hi ");
    }

}
