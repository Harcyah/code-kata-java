package com.harcyah.kata.exercism.clock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClockAddTest {

    @Test
    void addMinutes() {
        Clock clock = new Clock(10, 0);
        clock.add(3);
        assertEquals("10:03", clock.toString());
    }

    @Test
    void addNoMinutes() {
        Clock clock = new Clock(6, 41);
        clock.add(0);
        assertEquals("06:41", clock.toString());
    }

    @Test
    void addToNextHour() {
        Clock clock = new Clock(0, 45);
        clock.add(40);
        assertEquals("01:25", clock.toString());
    }

    @Test
    void addMoreThanOneHour() {
        Clock clock = new Clock(10, 0);
        clock.add(61);
        assertEquals("11:01", clock.toString());
    }

    @Test
    void addMoreThanTwoHoursWithCarry() {
        Clock clock = new Clock(0, 45);
        clock.add(160);
        assertEquals("03:25", clock.toString());
    }

    @Test
    void addAcrossMidnight() {
        Clock clock = new Clock(23, 59);
        clock.add(2);
        assertEquals("00:01", clock.toString());
    }

    @Test
    void addMoreThanOneDay() {
        Clock clock = new Clock(5, 32);
        clock.add(1500);
        assertEquals("06:32", clock.toString());
    }

    @Test
    void addMoreThanTwoDays() {
        Clock clock = new Clock(1, 1);
        clock.add(3500);
        assertEquals("11:21", clock.toString());
    }

    @Test
    void subtractMinutes() {
        Clock clock = new Clock(10, 3);
        clock.add(-3);
        assertEquals("10:00", clock.toString());
    }

    @Test
    void subtractToPreviousHour() {
        Clock clock = new Clock(10, 3);
        clock.add(-30);
        assertEquals("09:33", clock.toString());
    }

    @Test
    void subtractMoreThanAnHour() {
        Clock clock = new Clock(10, 3);
        clock.add(-70);
        assertEquals("08:53", clock.toString());
    }

    @Test
    void subtractAcrossMidnight() {
        Clock clock = new Clock(0, 3);
        clock.add(-4);
        assertEquals("23:59", clock.toString());
    }

    @Test
    void subtractMoreThanTwoHours() {
        Clock clock = new Clock(0, 0);
        clock.add(-160);
        assertEquals("21:20", clock.toString());
    }

    @Test
    void subtractMoreThanTwoHoursWithBorrow() {
        Clock clock = new Clock(6, 15);
        clock.add(-160);
        assertEquals("03:35", clock.toString());
    }

    @Test
    void subtractMoreThanOneDay() {
        Clock clock = new Clock(5, 32);
        clock.add(-1500);
        assertEquals("04:32", clock.toString());
    }

    @Test
    void subtractMoreThanTwoDays() {
        Clock clock = new Clock(2, 20);
        clock.add(-3000);
        assertEquals("00:20", clock.toString());
    }

}
