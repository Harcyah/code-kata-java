package com.harcyah.kata.exercism.clock;

import lombok.EqualsAndHashCode;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@EqualsAndHashCode
public class Clock {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

    private LocalTime time;

    public Clock(int hours, int minutes) {
        this.time = LocalTime.of(0, 0).plusHours(hours).plusMinutes(minutes);
    }

    @Override
    public String toString() {
        return this.time.format(FORMATTER);
    }

    public void add(int minutes) {
        this.time = this.time.plusMinutes(minutes);
    }

}
