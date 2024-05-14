package com.harcyah.kata.pape;

import org.junit.jupiter.api.Test;

import static com.harcyah.kata.pape.BytesRepresentation.Unit.BYTE;
import static com.harcyah.kata.pape.BytesRepresentation.Unit.GIGA_BYTE;
import static com.harcyah.kata.pape.BytesRepresentation.Unit.KILO_BYTE;
import static com.harcyah.kata.pape.BytesRepresentation.Unit.MEGA_BYTE;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BytesRepresentationTest {

    protected BytesRepresentation br = new BytesRepresentation();

    @Test
    void testBytes() {
        assertEquals("123.0 BYTE", br.toBytesString(BYTE, 123));
        assertEquals("123.0 BYTE", br.toBytesString(123));
    }

    @Test
    void testKyloBytes() {
        assertEquals("15.323 KILO_BYTE", br.toBytesString(KILO_BYTE, 15323));
        assertEquals("15.323 KILO_BYTE", br.toBytesString(15323));
    }

    @Test
    void testMegaBytes() {
        assertEquals("15.323 MEGA_BYTE", br.toBytesString(MEGA_BYTE, 15323000));
        assertEquals("15.323 MEGA_BYTE", br.toBytesString(15323000));
    }

    @Test
    void testGigaBytes() {
        assertEquals("1.532300001 GIGA_BYTE", br.toBytesString(GIGA_BYTE, 1532300001));
        assertEquals("1.532300001 GIGA_BYTE", br.toBytesString(1532300001));
    }

}
