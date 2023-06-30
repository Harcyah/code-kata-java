package com.harcyah.kata.exercism.clock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ClockEqualTest {

    @Test
    void clocksWithSameTimeAreEqual() {
        assertEquals(new Clock(15, 37), new Clock(15, 37));
    }

    @Test
    void clocksAMinuteApartAreNotEqual() {
        assertNotEquals(new Clock(15, 36), new Clock(15, 37));
    }

    @Test
    void clocksAnHourApartAreNotEqual() {
        assertNotEquals(new Clock(14, 37), new Clock(15, 37));
    }

    @Test
    void clocksWithHourOverflow() {
        assertEquals(new Clock(10, 37), new Clock(34, 37));
    }

    @Test
    void clocksWithHourOverflowBySeveralDays() {
        assertEquals(new Clock(3, 11), new Clock(99, 11));
    }

    @Test
    void clocksWithNegateHour() {
        assertEquals(new Clock(22, 40), new Clock(-2, 40));
    }

    @Test
    void clocksWithNegativeHourThatWraps() {
        assertEquals(new Clock(17, 3), new Clock(-31, 3));
    }

    @Test
    void clocksWithNegativeHourThatWrapsMultipleTimes() {
        assertEquals(new Clock(13, 49), new Clock(-83, 49));
    }

    @Test
    void clocksWithMinuteOverflow() {
        assertEquals(new Clock(0, 1), new Clock(0, 1441));
    }

    @Test
    void clocksWithMinuteOverflowBySeveralDays() {
        assertEquals(new Clock(2, 2), new Clock(2, 4322));
    }

    @Test
    void clocksWithNegativeMinutes() {
        assertEquals(new Clock(2, 40), new Clock(3, -20));
    }

    @Test
    void clocksWithNegativeMinutesThatWraps() {
        assertEquals(new Clock(4, 10), new Clock(5, -1490));
    }

    @Test
    void clocksWithNegativeMinutesThatWrapsMultipleTimes() {
        assertEquals(new Clock(6, 15), new Clock(6, -4305));
    }

    @Test
    void clocksWithNegativeHoursAndMinutes() {
        assertEquals(new Clock(7, 32), new Clock(-12, -268));
    }

    @Test
    void clocksWithNegativeHoursAndMinutesThatWrap() {
        assertEquals(new Clock(18, 7), new Clock(-54, -11513));
    }

}
