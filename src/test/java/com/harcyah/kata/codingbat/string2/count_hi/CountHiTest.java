package com.harcyah.kata.codingbat.string2.count_hi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountHiTest {

    @Test
    void testCountHi() {
        CountHi countHi = new CountHi();
        assertEquals(1, countHi.countHi("abc hi ho"));
        assertEquals(2, countHi.countHi("ABChi hi"));
        assertEquals(2, countHi.countHi("hihi"));
        assertEquals(2, countHi.countHi("hiHIhi"));
        assertEquals(0, countHi.countHi(""));
        assertEquals(0, countHi.countHi("h"));
        assertEquals(1, countHi.countHi("hi"));
        assertEquals(0, countHi.countHi("Hi is no HI on ahI"));
        assertEquals(2, countHi.countHi("hiho not HOHIhi"));
    }

}
