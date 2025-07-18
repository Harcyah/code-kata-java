package com.harcyah.kata.reddit.easy_2016_03_28;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GarageDoorTest {

    @Test
    void testGarageDoorOpening() {
        // Given
        GarageDoor door = new GarageDoor();
        List<Event> events = List.of(
            new EventButton(),
            new EventCycleComplete(),
            new EventButton(),
            new EventButton(),
            new EventButton(),
            new EventButton(),
            new EventButton(),
            new EventCycleComplete()
        );

        // When
        door.process(events);

        // Then
        assertThat(door.getState()).isEqualTo(State.CLOSED);
    }

}
