package com.harcyah.kata.exercism.robot_simulator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RobotSimulatorTest {

    @Test
    void testRobotIsCreatedWithCorrectInitialPosition() {
        GridPosition initialGridPosition = new GridPosition(0, 0);
        RobotSimulator robot = new RobotSimulator(initialGridPosition, Orientation.NORTH);

        assertThat(robot.getGridPosition()).isEqualTo(initialGridPosition);
    }

    @Test
    void testRobotIsCreatedWithCorrectInitialOrientation() {
        Orientation initialOrientation = Orientation.NORTH;
        RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), initialOrientation);

        assertThat(robot.getOrientation()).isEqualTo(initialOrientation);
    }

    @Test
    void testTurningRightDoesNotChangePosition() {
        GridPosition initialGridPosition = new GridPosition(0, 0);
        RobotSimulator robot = new RobotSimulator(initialGridPosition, Orientation.NORTH);

        robot.turnRight();

        assertThat(robot.getGridPosition()).isEqualTo(initialGridPosition);
    }

    @Test
    void testTurningRightCorrectlyChangesOrientationFromNorthToEast() {
        RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.NORTH);

        robot.turnRight();

        Orientation expectedOrientation = Orientation.EAST;

        assertThat(robot.getOrientation()).isEqualTo(expectedOrientation);
    }

    @Test
    void testTurningRightCorrectlyChangesOrientationFromEastToSouth() {
        RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.EAST);

        robot.turnRight();

        Orientation expectedOrientation = Orientation.SOUTH;

        assertThat(robot.getOrientation()).isEqualTo(expectedOrientation);
    }

    @Test
    void testTurningRightCorrectlyChangesOrientationFromSouthToWest() {
        RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.SOUTH);

        robot.turnRight();

        Orientation expectedOrientation = Orientation.WEST;

        assertThat(robot.getOrientation()).isEqualTo(expectedOrientation);
    }

    @Test
    void testTurningRightCorrectlyChangesOrientationFromWestToNorth() {
        RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.WEST);

        robot.turnRight();

        Orientation expectedOrientation = Orientation.NORTH;

        assertThat(robot.getOrientation()).isEqualTo(expectedOrientation);
    }

    @Test
    void testTurningLeftDoesNotChangePosition() {
        GridPosition initialGridPosition = new GridPosition(0, 0);
        RobotSimulator robot = new RobotSimulator(initialGridPosition, Orientation.NORTH);

        robot.turnLeft();

        assertThat(robot.getGridPosition()).isEqualTo(initialGridPosition);
    }

    @Test
    void testTurningLeftCorrectlyChangesOrientationFromNorthToWest() {
        RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.NORTH);

        robot.turnLeft();

        Orientation expectedOrientation = Orientation.WEST;

        assertThat(robot.getOrientation()).isEqualTo(expectedOrientation);
    }

    @Test
    void testTurningLeftCorrectlyChangesOrientationFromWestToSouth() {
        RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.WEST);

        robot.turnLeft();

        Orientation expectedOrientation = Orientation.SOUTH;

        assertThat(robot.getOrientation()).isEqualTo(expectedOrientation);
    }

    @Test
    void testTurningLeftCorrectlyChangesOrientationFromSouthToEast() {
        RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.SOUTH);

        robot.turnLeft();

        Orientation expectedOrientation = Orientation.EAST;

        assertThat(robot.getOrientation()).isEqualTo(expectedOrientation);
    }

    @Test
    void testTurningLeftCorrectlyChangesOrientationFromEastToNorth() {
        RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.EAST);

        robot.turnLeft();

        Orientation expectedOrientation = Orientation.NORTH;

        assertThat(robot.getOrientation()).isEqualTo(expectedOrientation);
    }

    @Test
    void testAdvancingDoesNotChangeOrientation() {
        Orientation initialOrientation = Orientation.NORTH;
        RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), initialOrientation);

        robot.advance();

        assertThat(robot.getOrientation()).isEqualTo(initialOrientation);
    }

    @Test
    void testAdvancingWhenFacingNorthIncreasesYCoordinateByOne() {
        RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.NORTH);

        robot.advance();

        GridPosition expectedGridPosition = new GridPosition(0, 1);

        assertThat(robot.getGridPosition()).isEqualTo(expectedGridPosition);
    }

    @Test
    void testAdvancingWhenFacingSouthDecreasesYCoordinateByOne() {
        RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.SOUTH);

        robot.advance();

        GridPosition expectedGridPosition = new GridPosition(0, -1);

        assertThat(robot.getGridPosition()).isEqualTo(expectedGridPosition);
    }

    @Test
    void testAdvancingWhenFacingEastIncreasesXCoordinateByOne() {
        RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.EAST);

        robot.advance();

        GridPosition expectedGridPosition = new GridPosition(1, 0);

        assertThat(robot.getGridPosition()).isEqualTo(expectedGridPosition);
    }

    @Test
    void testAdvancingWhenFacingWestDecreasesXCoordinateByOne() {
        RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.WEST);

        robot.advance();

        GridPosition expectedGridPosition = new GridPosition(-1, 0);

        assertThat(robot.getGridPosition()).isEqualTo(expectedGridPosition);
    }

    @Test
    void testInstructionsToMoveWestAndNorth() {
        RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.NORTH);

        robot.simulate("LAAARALA");

        GridPosition expectedGridPosition = new GridPosition(-4, 1);
        Orientation expectedOrientation = Orientation.WEST;

        assertThat(robot.getGridPosition()).isEqualTo(expectedGridPosition);
        assertThat(robot.getOrientation()).isEqualTo(expectedOrientation);
    }

    @Test
    void testInstructionsToMoveWestAndSouth() {
        RobotSimulator robot = new RobotSimulator(new GridPosition(2, -7), Orientation.EAST);

        robot.simulate("RRAAAAALA");

        GridPosition expectedGridPosition = new GridPosition(-3, -8);
        Orientation expectedOrientation = Orientation.SOUTH;

        assertThat(robot.getGridPosition()).isEqualTo(expectedGridPosition);
        assertThat(robot.getOrientation()).isEqualTo(expectedOrientation);
    }

    @Test
    void testInstructionsToMoveEastAndNorth() {
        RobotSimulator robot = new RobotSimulator(new GridPosition(8, 4), Orientation.SOUTH);

        robot.simulate("LAAARRRALLLL");

        GridPosition expectedGridPosition = new GridPosition(11, 5);
        Orientation expectedOrientation = Orientation.NORTH;

        assertThat(robot.getGridPosition()).isEqualTo(expectedGridPosition);
        assertThat(robot.getOrientation()).isEqualTo(expectedOrientation);
    }

}
