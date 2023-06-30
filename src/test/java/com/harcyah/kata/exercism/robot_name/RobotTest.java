package com.harcyah.kata.exercism.robot_name;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RobotTest {

    private static final String EXPECTED_ROBOT_NAME_PATTERN = "[A-Z]{2}\\d{3}";
    private final Robot robot = new Robot();

    @Test
    void hasName() {
        assertIsValidName(robot.getName());
    }

    @Test
    void differentRobotsHaveDifferentNames() {
        assertThat(robot.getName()).isNotEqualTo(new Robot().getName());
    }

    @Test
    void resetName() {
        final String name = robot.getName();
        robot.reset();
        final String name2 = robot.getName();
        assertThat(name).isNotEqualTo(name2);
        assertIsValidName(name2);
    }

    private static void assertIsValidName(String name) {
        assertThat(name.matches(EXPECTED_ROBOT_NAME_PATTERN)).isTrue();
    }

}
