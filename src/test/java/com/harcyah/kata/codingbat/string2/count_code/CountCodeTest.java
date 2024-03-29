package com.harcyah.kata.codingbat.string2.count_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountCodeTest {

    @Test
    void testCountCode() {
        CountCode countCode = new CountCode();
        assertEquals(1, countCode.countCode("aaacodebbb"));
        assertEquals(2, countCode.countCode("codexxcode"));
        assertEquals(2, countCode.countCode("cozexxcope"));
        assertEquals(1, countCode.countCode("cozfxxcope"));
        assertEquals(1, countCode.countCode("xxcozeyycop"));
        assertEquals(0, countCode.countCode("cozcop"));
        assertEquals(0, countCode.countCode("abcxyz"));
        assertEquals(1, countCode.countCode("code"));
        assertEquals(0, countCode.countCode("ode"));
        assertEquals(0, countCode.countCode("c"));
        assertEquals(0, countCode.countCode(""));
        assertEquals(3, countCode.countCode("AAcodeBBcoleCCccoreDD"));
        assertEquals(2, countCode.countCode("AAcodeBBcoleCCccorfDD"));
        assertEquals(3, countCode.countCode("coAcodeBcoleccoreDD"));
    }

}
