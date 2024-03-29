package com.harcyah.kata.exercism.saddle_points;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * version: 1.0.0
 */
class SaddlePointsTest {

    @Test
    void testCanIdentifySingleSaddlePoint() {
        Matrix matrix = new Matrix(List.of(
            List.of(9, 8, 7),
            List.of(5, 3, 2),
            List.of(6, 6, 7)
        ));

        Set<MatrixCoordinate> expectedSaddlePoints = Set.of(new MatrixCoordinate(1, 0));

        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

    @Test
    void testCanIdentifyThatEmptyMatrixHasNoSaddlePoints() {
        Matrix matrix = new Matrix(new ArrayList<>());

        Set<MatrixCoordinate> expectedSaddlePoints = Set.of();

        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

    @Test
    void testCanIdentifyLackOfSaddlePointsWhenThereAreNone() {
        Matrix matrix = new Matrix(List.of(
            List.of(1, 2, 3),
            List.of(3, 1, 2),
            List.of(2, 3, 1)
        ));

        Set<MatrixCoordinate> expectedSaddlePoints = Set.of();

        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

    @Test
    void testCanIdentifyMultipleSaddlePoints() {
        Matrix matrix = new Matrix(List.of(
            List.of(4, 5, 4),
            List.of(3, 5, 5),
            List.of(1, 5, 4)
        ));

        Set<MatrixCoordinate> expectedSaddlePoints = Set.of(
            new MatrixCoordinate(0, 1),
            new MatrixCoordinate(1, 1),
            new MatrixCoordinate(2, 1)
        );

        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

    @Test
    void testCanIdentifySaddlePointInBottomRightCorner() {
        Matrix matrix = new Matrix(List.of(
            List.of(8, 7, 9),
            List.of(6, 7, 6),
            List.of(3, 2, 5)
        ));

        Set<MatrixCoordinate> expectedSaddlePoints = Set.of(new MatrixCoordinate(2, 2));

        assertEquals(expectedSaddlePoints, matrix.getSaddlePoints());
    }

}
