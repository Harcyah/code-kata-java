package com.harcyah.kata.codingbat.string1.without_end_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WithoutEnd2Test {

    @Test
    void testWithoutEnd2() {
        WithoutEnd2 withoutEnd2 = new WithoutEnd2();
        assertEquals("ell", withoutEnd2.withouEnd2("Hello"));
        assertEquals("b", withoutEnd2.withouEnd2("abc"));
        assertEquals("", withoutEnd2.withouEnd2("ab"));
        assertEquals("", withoutEnd2.withouEnd2("a"));
        assertEquals("", withoutEnd2.withouEnd2(""));
        assertEquals("old", withoutEnd2.withouEnd2("coldy"));
        assertEquals("ava cod", withoutEnd2.withouEnd2("java code"));
    }

}
