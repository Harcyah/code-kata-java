package com.harcyah.kata.misc.version;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VersionPartTest {

    @Test
    void testVersionPartNumber() {
        VersionPart vp = new VersionPart("123");
        assertThat(vp.getNumber()).isEqualTo(123);
        assertThat(vp.getString()).isNull();
        assertThat(vp.getRaw()).isEqualTo("123");
    }

    @Test
    void testVersionPartString() {
        VersionPart vp = new VersionPart("abc");
        assertThat(vp.getNumber()).isNull();
        assertThat(vp.getString()).isEqualTo("abc");
        assertThat(vp.getRaw()).isEqualTo("abc");
    }

    @Test
    void testVersionPartAlphanumeric() {
        VersionPart vp = new VersionPart("123abc");
        assertThat(vp.getNumber()).isEqualTo(123);
        assertThat(vp.getString()).isEqualTo("abc");
        assertThat(vp.getRaw()).isEqualTo("123abc");
    }

    @Test
    void testVersionPartEmpty() {
        VersionPart vp = new VersionPart("");
        assertThat(vp.getNumber()).isNull();
        assertThat(vp.getString()).isNull();
        assertThat(vp.getRaw()).isNull();
    }

}
