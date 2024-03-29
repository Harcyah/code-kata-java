package com.harcyah.kata.codingbat.string1.without_end;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WithoutEndTest {

    @Test
    void testWithoutEnd() {
        WithoutEnd withoutEnd = new WithoutEnd();
        assertEquals("ell", withoutEnd.withoutEnd("Hello"));
        assertEquals("av", withoutEnd.withoutEnd("java"));
        assertEquals("odin", withoutEnd.withoutEnd("coding"));
        assertEquals("od", withoutEnd.withoutEnd("code"));
        assertEquals("", withoutEnd.withoutEnd("ab"));
        assertEquals("hocolate", withoutEnd.withoutEnd("Chocolate!"));
        assertEquals("itte", withoutEnd.withoutEnd("kitten"));
        assertEquals("ooho", withoutEnd.withoutEnd("woohoo"));
    }

}
