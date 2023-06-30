package com.harcyah.kata.reddit.easy_2016_02_16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AtbashCipherTest {

    protected AtbashCipher cipher = new AtbashCipher();

    @Test
    void testCipher() {
        assertEquals("ullyzi", cipher.encode("foobar"));
        assertEquals("draziw", cipher.encode("wizard"));
        assertEquals("/i/wzrobkiltiznnvi", cipher.encode("/r/dailyprogrammer"));
        assertEquals("this is an example of the atbash cipher", cipher.encode("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi"));
    }

}
