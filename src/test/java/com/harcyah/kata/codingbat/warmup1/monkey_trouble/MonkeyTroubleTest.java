package com.harcyah.kata.codingbat.warmup1.monkey_trouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MonkeyTroubleTest {

    @Test
    void testMonkeyTrouble() {
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        assertTrue(monkeyTrouble.monkeyTrouble(true, true));
        assertTrue(monkeyTrouble.monkeyTrouble(false, false));
        assertFalse(monkeyTrouble.monkeyTrouble(true, false));
        assertFalse(monkeyTrouble.monkeyTrouble(false, true));
    }

}
