package com.harcyah.kata.exercism.run_length_encoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RunLengthEncodingTest {
    private RunLengthEncoding runLengthEncoding;

    @BeforeEach
    void setUp() {
        runLengthEncoding = new RunLengthEncoding();
    }

    @Test
    void encodeEmpty() {
        assertEquals("", runLengthEncoding.encode(""));
    }

    @Test
    void encodeWithOnlySingleValues() {
        assertEquals("XYZ", runLengthEncoding.encode("XYZ"));
    }

    @Test
    void encodeWithNoSingleValues() {
        assertEquals("2A3B4C", runLengthEncoding.encode("AABBBCCCC"));
    }

    @Test
    void encodeWithMixedValues() {
        assertEquals("12WB12W3B24WB", runLengthEncoding.encode("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB"));
    }

    @Test
    void encodeWithWhitespaceValues() {
        assertEquals("2 hs2q q2w2 ", runLengthEncoding.encode("  hsqq qww  "));
    }

    @Test
    void encodeWithLowercaseValues() {
        assertEquals("2a3b4c", runLengthEncoding.encode("aabbbcccc"));
    }

    @Test
    void decodeEmpty() {
        assertEquals("", runLengthEncoding.decode(""));
    }

    @Test
    void decodeWithOnlySingleValues() {
        assertEquals("XYZ", runLengthEncoding.decode("XYZ"));
    }

    @Test
    void decodeWithNoSingleValues() {
        assertEquals("AABBBCCCC", runLengthEncoding.decode("2A3B4C"));
    }

    @Test
    void decodeWithMixedValues() {
        assertEquals("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB", runLengthEncoding.decode("12WB12W3B24WB"));
    }

    @Test
    void decodeWithWhitespaceValues() {
        assertEquals("  hsqq qww  ", runLengthEncoding.decode("2 hs2q q2w2 "));
    }

    @Test
    void decodeWithLowercaseValues() {
        assertEquals("aabbbcccc", runLengthEncoding.decode("2a3b4c"));
    }

    @Test
    void encodeThenDecode() {
        String inOut = "zzz ZZ  zZ";
        String encoded = runLengthEncoding.encode(inOut);
        assertEquals(inOut, runLengthEncoding.decode(encoded));
    }

}
