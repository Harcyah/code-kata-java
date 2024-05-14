package com.harcyah.kata.exercism.space_age;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SpaceAge {

    private static final long SECONDS_IN_YEAR = 31557600L;

    private static final double EARTH_ORBITAL_PERIOD = 1.0 * SECONDS_IN_YEAR;
    private static final double MERCURY_ORBITAL_PERIOD = 0.2408467 * SECONDS_IN_YEAR;
    private static final double VENUS_ORBITAL_PERIOD = 0.61519726 * SECONDS_IN_YEAR;
    private static final double MARS_ORBITAL_PERIOD = 1.8808158 * SECONDS_IN_YEAR;
    private static final double JUPITER_ORBITAL_PERIOD = 11.862615 * SECONDS_IN_YEAR;
    private static final double SATURN_ORBITAL_PERIOD = 29.447498 * SECONDS_IN_YEAR;
    private static final double URANUS_ORBITAL_PERIOD = 84.016846 * SECONDS_IN_YEAR;
    private static final double NEPTUNE_ORBITAL_PERIOD = 164.79132 * SECONDS_IN_YEAR;

    private final long seconds;

    public double onEarth() {
        return seconds / EARTH_ORBITAL_PERIOD;
    }

    public double onSaturn() {
        return seconds / SATURN_ORBITAL_PERIOD;
    }

    public double onJupiter() {
        return seconds / JUPITER_ORBITAL_PERIOD;
    }

    public double onMars() {
        return seconds / MARS_ORBITAL_PERIOD;
    }

    public double onUranus() {
        return seconds / URANUS_ORBITAL_PERIOD;
    }

    public double onVenus() {
        return seconds / VENUS_ORBITAL_PERIOD;
    }

    public double onMercury() {
        return seconds / MERCURY_ORBITAL_PERIOD;
    }

    public double onNeptune() {
        return seconds / NEPTUNE_ORBITAL_PERIOD;
    }

}
