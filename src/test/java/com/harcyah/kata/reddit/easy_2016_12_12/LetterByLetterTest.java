package com.harcyah.kata.reddit.easy_2016_12_12;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LetterByLetterTest {

    private final LetterByLetter changer = new LetterByLetter();

    @Test
    void testChangeFloorToBrake() {
        List<String> changes = changer.change("floor", "brake");

        assertThat(changes).containsExactly(
            "floor",
            "bloor",
            "broor",
            "braor",
            "brakr",
            "brake"
        );
    }

    @Test
    void testChangeWoodToBook() {
        List<String> changes = changer.change("wood", "book");

        assertThat(changes).containsExactly(
            "wood",
            "bood",
            "book"
        );
    }

    @Test
    void testChangeAFallToTheFloorToBrakingTheDoorIn() {
        List<String> changes = changer.change("a fall to the floor", "braking the door in");

        assertThat(changes).containsExactly(
            "a fall to the floor",
            "b fall to the floor",
            "brfall to the floor",
            "braall to the floor",
            "brakll to the floor",
            "brakil to the floor",
            "brakin to the floor",
            "brakingto the floor",
            "braking o the floor",
            "braking t the floor",
            "braking ththe floor",
            "braking thehe floor",
            "braking the e floor",
            "braking the d floor",
            "braking the dofloor",
            "braking the dooloor",
            "braking the dooroor",
            "braking the door or",
            "braking the door ir",
            "braking the door in"
        );
    }

}
