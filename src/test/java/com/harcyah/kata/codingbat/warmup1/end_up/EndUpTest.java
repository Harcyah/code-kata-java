package com.harcyah.kata.codingbat.warmup1.end_up;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EndUpTest {

    @Test
    void testEndUp() {
        EndUp endUp = new EndUp();
        assertEquals("HeLLO", endUp.endUp("Hello"));
        assertEquals("hi thERE", endUp.endUp("hi there"));
        assertEquals("HI", endUp.endUp("hi"));
        assertEquals("woo HOO", endUp.endUp("woo hoo"));
        assertEquals("xyZ12", endUp.endUp("xyz12"));
        assertEquals("X", endUp.endUp("x"));
        assertEquals("", endUp.endUp(""));
    }

}
