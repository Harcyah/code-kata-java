package com.harcyah.kata.exercism.simple_cipher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomKeyCipherTest {

    private Cipher cipher;

    @BeforeEach
    void setup() {
        this.cipher = new Cipher();
    }

    @Test
    void cipherKeyIsMadeOfLetters() {
        assertTrue(cipher.getKey().matches("[a-z]+"));
    }

    @Test
    void defaultCipherKeyIs100Characters() {
        assertEquals(100, cipher.getKey().length());
    }

    @Test
    void cipherKeysAreRandomlyGenerated() {
        assertTrue(!(new Cipher().getKey().equals(cipher.getKey())));
    }

    /**
     * Here we take advantage of the fact that plaintext of "aaa..." doesn't output the key. This is a critical problem
     * with shift ciphers, some characters will always output the key verbatim.
     */
    @Test
    void cipherCanEncode() {
        String expectedOutput = cipher.getKey().substring(0, 10);

        assertEquals(expectedOutput, cipher.encode("aaaaaaaaaa"));
    }

    @Test
    void cipherCanDecode() {
        String expectedOutput = "aaaaaaaaaa";

        assertEquals(expectedOutput, cipher.decode(cipher.getKey().substring(0, 10)));
    }

    @Test
    void cipherIsReversible() {
        String plainText = "abcdefghij";

        assertEquals(plainText, cipher.decode(cipher.encode(plainText)));
    }

}
