package com.harcyah.kata.codingbat.string2.zip_zap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZipZapTest {

    @Test
    void testZipZap() {
        ZipZap zipZap = new ZipZap();
        assertEquals("zpXzp", zipZap.zipZap("zipXzap"));
        assertEquals("zpzp", zipZap.zipZap("zopzop"));
        assertEquals("zzzpzp", zipZap.zipZap("zzzopzop"));
        assertEquals("zibzp", zipZap.zipZap("zibzap"));
        assertEquals("zp", zipZap.zipZap("zip"));
        assertEquals("zi", zipZap.zipZap("zi"));
        assertEquals("z", zipZap.zipZap("z"));
        assertEquals("", zipZap.zipZap(""));
        assertEquals("zp", zipZap.zipZap("zzp"));
        assertEquals("abcppp", zipZap.zipZap("abcppp"));
        assertEquals("azbcppp", zipZap.zipZap("azbcppp"));
        assertEquals("azbcpzp", zipZap.zipZap("azbcpzpp"));
    }

}
