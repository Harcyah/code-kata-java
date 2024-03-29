package com.harcyah.kata.reddit.easy_2015_02_16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryReaderTest {

    private static final String HELLO_WORLD = "0100100001100101011011000110110001101111001000000101011101101111011100100110110001100100";

    private static final String TEST_1 = "011100000110110001100101011000" +
            "010111001101100101001000000111" +
            "010001100001011011000110101100" +
            "100000011101000110111100100000" +
            "0110110101100101";

    private static final String TEST_2 = "011011000110100101100110011001" +
            "010010000001110010011010010110" +
            "011101101000011101000010000001" +
            "101110011011110111011100100000" +
            "011010010111001100100000011011" +
            "000110111101101110011001010110" +
            "110001111001";

    @Test
    void testHelloWorld() {
        BinaryReader br = new BinaryReader();
        assertEquals("Hello World", br.read(HELLO_WORLD));
    }

    @Test
    void testUnknownValue1() {
        BinaryReader br = new BinaryReader();
        assertEquals("please talk to me", br.read(TEST_1));
    }

    @Test
    void testUnknownValue2() {
        BinaryReader br = new BinaryReader();
        assertEquals("life right now is lonely", br.read(TEST_2));
    }

}
