package com.harcyah.kata.exercism.robot_simulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RobotSimulatorTest {

    @Test
    void testRobotIsCreatedWithCorrectInitialPosition() {
        final GridPosition initialGridPosition = new GridPosition(0, 0);
        final RobotSimulator robot = new RobotSimulator(initialGridPosition, Orientation.NORTH);

        assertTrue(robot.getGridPosition().equals(initialGridPosition));
    }

    @Test
    void testRobotIsCreatedWithCorrectInitialOrientation() {
        final Orientation initialOrientation = Orientation.NORTH;
        final RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), initialOrientation);

        assertTrue(robot.getOrientation().equals(initialOrientation));
    }

    @Test
    void testTurningRightDoesNotChangePosition() {
        final GridPosition initialGridPosition = new GridPosition(0, 0);
        final RobotSimulator robot = new RobotSimulator(initialGridPosition, Orientation.NORTH);

        robot.turnRight();

        assertTrue(robot.getGridPosition().equals(initialGridPosition));
    }

    @Test
    void testTurningRightCorrectlyChangesOrientationFromNorthToEast() {
        final RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.NORTH);

        robot.turnRight();

        final Orientation expectedOrientation = Orientation.EAST;

        assertTrue(robot.getOrientation().equals(expectedOrientation));
    }

    @Test
    void testTurningRightCorrectlyChangesOrientationFromEastToSouth() {
        final RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.EAST);

        robot.turnRight();

        final Orientation expectedOrientation = Orientation.SOUTH;

        assertTrue(robot.getOrientation().equals(expectedOrientation));
    }

    @Test
    void testTurningRightCorrectlyChangesOrientationFromSouthToWest() {
        final RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.SOUTH);

        robot.turnRight();

        final Orientation expectedOrientation = Orientation.WEST;

        assertTrue(robot.getOrientation().equals(expectedOrientation));
    }

    @Test
    void testTurningRightCorrectlyChangesOrientationFromWestToNorth() {
        final RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.WEST);

        robot.turnRight();

        final Orientation expectedOrientation = Orientation.NORTH;

        assertTrue(robot.getOrientation().equals(expectedOrientation));
    }

    @Test
    void testTurningLeftDoesNotChangePosition() {
        final GridPosition initialGridPosition = new GridPosition(0, 0);
        final RobotSimulator robot = new RobotSimulator(initialGridPosition, Orientation.NORTH);

        robot.turnLeft();

        assertTrue(robot.getGridPosition().equals(initialGridPosition));
    }

    @Test
    void testTurningLeftCorrectlyChangesOrientationFromNorthToWest() {
        final RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.NORTH);

        robot.turnLeft();

        final Orientation expectedOrientation = Orientation.WEST;

        assertTrue(robot.getOrientation().equals(expectedOrientation));
    }

    @Test
    void testTurningLeftCorrectlyChangesOrientationFromWestToSouth() {
        final RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.WEST);

        robot.turnLeft();

        final Orientation expectedOrientation = Orientation.SOUTH;

        assertTrue(robot.getOrientation().equals(expectedOrientation));
    }

    @Test
    void testTurningLeftCorrectlyChangesOrientationFromSouthToEast() {
        final RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.SOUTH);

        robot.turnLeft();

        final Orientation expectedOrientation = Orientation.EAST;

        assertTrue(robot.getOrientation().equals(expectedOrientation));
    }

    @Test
    void testTurningLeftCorrectlyChangesOrientationFromEastToNorth() {
        final RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.EAST);

        robot.turnLeft();

        final Orientation expectedOrientation = Orientation.NORTH;

        assertTrue(robot.getOrientation().equals(expectedOrientation));
    }

    @Test
    void testAdvancingDoesNotChangeOrientation() {
        final Orientation initialOrientation = Orientation.NORTH;
        final RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), initialOrientation);

        robot.advance();

        assertTrue(robot.getOrientation().equals(initialOrientation));
    }

    @Test
    void testAdvancingWhenFacingNorthIncreasesYCoordinateByOne() {
        final RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.NORTH);

        robot.advance();

        final GridPosition expectedGridPosition = new GridPosition(0, 1);

        assertTrue(robot.getGridPosition().equals(expectedGridPosition));
    }

    @Test
    void testAdvancingWhenFacingSouthDecreasesYCoordinateByOne() {
        final RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.SOUTH);

        robot.advance();

        final GridPosition expectedGridPosition = new GridPosition(0, -1);

        assertTrue(robot.getGridPosition().equals(expectedGridPosition));
    }

    @Test
    void testAdvancingWhenFacingEastIncreasesXCoordinateByOne() {
        final RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.EAST);

        robot.advance();

        final GridPosition expectedGridPosition = new GridPosition(1, 0);

        assertTrue(robot.getGridPosition().equals(expectedGridPosition));
    }

    @Test
    void testAdvancingWhenFacingWestDecreasesXCoordinateByOne() {
        final RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.WEST);

        robot.advance();

        final GridPosition expectedGridPosition = new GridPosition(-1, 0);

        assertTrue(robot.getGridPosition().equals(expectedGridPosition));
    }

    @Test
    void testInstructionsToMoveWestAndNorth() {
        final RobotSimulator robot = new RobotSimulator(new GridPosition(0, 0), Orientation.NORTH);

        robot.simulate("LAAARALA");

        final GridPosition expectedGridPosition = new GridPosition(-4, 1);
        final Orientation expectedOrientation = Orientation.WEST;

        assertTrue(robot.getGridPosition().equals(expectedGridPosition));
        assertTrue(robot.getOrientation().equals(expectedOrientation));
    }

    @Test
    void testInstructionsToMoveWestAndSouth() {
        final RobotSimulator robot = new RobotSimulator(new GridPosition(2, -7), Orientation.EAST);

        robot.simulate("RRAAAAALA");

        final GridPosition expectedGridPosition = new GridPosition(-3, -8);
        final Orientation expectedOrientation = Orientation.SOUTH;

        assertTrue(robot.getGridPosition().equals(expectedGridPosition));
        assertTrue(robot.getOrientation().equals(expectedOrientation));
    }

    @Test
    void testInstructionsToMoveEastAndNorth() {
        final RobotSimulator robot = new RobotSimulator(new GridPosition(8, 4), Orientation.SOUTH);

        robot.simulate("LAAARRRALLLL");

        final GridPosition expectedGridPosition = new GridPosition(11, 5);
        final Orientation expectedOrientation = Orientation.NORTH;

        assertTrue(robot.getGridPosition().equals(expectedGridPosition));
        assertTrue(robot.getOrientation().equals(expectedOrientation));
    }

}
