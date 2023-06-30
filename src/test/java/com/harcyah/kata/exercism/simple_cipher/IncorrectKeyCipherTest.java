package com.harcyah.kata.exercism.simple_cipher;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class IncorrectKeyCipherTest {

    @Test
    void cipherThrowsWithAllCapsKey() {
        assertThatThrownBy(() -> new Cipher("ABCDEF"))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void cipherThrowsWithAnyCapsKey() {
        assertThatThrownBy(() -> new Cipher("abcdEFg"))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void cipherThrowsWithNumericKey() {
        assertThatThrownBy(() -> new Cipher("12345"))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void cipherThrowsWithAnyNumericKey() {
        assertThatThrownBy(() -> new Cipher("abcd345ef"))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void cipherThrowsWithEmptyKey() {
        assertThatThrownBy(() -> new Cipher(""))
            .isInstanceOf(IllegalArgumentException.class);
    }

}
