package com.harcyah.kata.exercism.simple_cipher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubstitutionCipherTest {

    private static final String KEY = "abcdefghij";
    private Cipher cipher;

    @BeforeEach
    void setup() {
        this.cipher = new Cipher(KEY);
    }

    @Test
    void cipherKeepsTheSubmittedKey() {
        assertEquals(KEY, cipher.getKey());
    }

    @Test
    void cipherCanEncodeWithGivenKey() {
        String expectedOutput = "abcdefghij";

        assertEquals(expectedOutput, cipher.encode("aaaaaaaaaa"));
    }

    @Test
    void cipherCanDecodeWithGivenKey() {
        String expectedOutput = "aaaaaaaaaa";

        assertEquals(expectedOutput, cipher.decode("abcdefghij"));
    }

    @Test
    void cipherIsReversibleGivenKey() {
        String plainText = "abcdefghij";

        assertEquals(plainText, cipher.decode(cipher.encode("abcdefghij")));
    }

    @Test
    void cipherCanDoubleShiftEncode() {
        String plainText = "iamapandabear";
        String expectedOutput = "qayaeaagaciai";

        assertEquals(expectedOutput, new Cipher(plainText).encode(plainText));
    }

    @Test
    void cipherCanWrapEncode() {
        String expectedOutput = "zabcdefghi";

        assertEquals(expectedOutput, cipher.encode("zzzzzzzzzz"));
    }

    @Test
    void cipherCanEncodeMessageThatIsShorterThanTheKey() {
        String expectedOutput = "abcde";

        assertEquals(expectedOutput, cipher.encode("aaaaa"));
    }

    @Test
    void cipherCanDecodeMessageThatIsShorterThanTheKey() {
        String expectedOutput = "aaaaa";

        assertEquals(expectedOutput, cipher.decode("abcde"));
    }

}
