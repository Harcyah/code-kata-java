package com.harcyah.kata.exercism.clock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClockCreationTest {

    @Test
    void canPrintTimeOnTheHour() {
        assertEquals("08:00", new Clock(8, 0).toString());
    }

    @Test
    void canPrintTimeWithMinutes() {
        assertEquals("11:09", new Clock(11, 9).toString());
    }

    @Test
    void midnightPrintsAsZero() {
        assertEquals("00:00", new Clock(24, 0).toString());
    }

    @Test
    void hourRollsOver() {
        assertEquals("01:00", new Clock(25, 0).toString());
    }

    @Test
    void hourRollsOverContinuously() {
        assertEquals("04:00", new Clock(100, 0).toString());
    }

    @Test
    void sixtyMinutesIsNextHour() {
        assertEquals("02:00", new Clock(1, 60).toString());
    }

    @Test
    void minutesRollOver() {
        assertEquals("02:40", new Clock(0, 160).toString());
    }

    @Test
    void minutesRollOverContinuously() {
        assertEquals("04:43", new Clock(0, 1723).toString());
    }

    @Test
    void hourAndMinutesRollOver() {
        assertEquals("03:40", new Clock(25, 160).toString());
    }

    @Test
    void hourAndMinutesRollOverContinuously() {
        assertEquals("11:01", new Clock(201, 3001).toString());
    }

    @Test
    void hourAndMinutesRollOverToExactlyMidnight() {
        assertEquals("00:00", new Clock(72, 8640).toString());
    }

    @Test
    void negativeHour() {
        assertEquals("23:15", new Clock(-1, 15).toString());
    }

    @Test
    void negativeHourRollsOver() {
        assertEquals("23:00", new Clock(-25, 0).toString());
    }

    @Test
    void negativeHourRollsOverContinuously() {
        assertEquals("05:00", new Clock(-91, 0).toString());
    }

    @Test
    void negativeMinutes() {
        assertEquals("00:20", new Clock(1, -40).toString());
    }

    @Test
    void negativeMinutesRollOver() {
        assertEquals("22:20", new Clock(1, -160).toString());
    }

    @Test
    void negativeMinutesRollOverContinuously() {
        assertEquals("16:40", new Clock(1, -4820).toString());
    }

    @Test
    void negativeHourAndMinutesBothRollOver() {
        assertEquals("20:20", new Clock(-25, -160).toString());
    }

    @Test
    void negativeHourAndMinutesBothRollOverContinuously() {
        assertEquals("22:10", new Clock(-121, -5810).toString());
    }

}
