package com.harcyah.kata.exercism.queen_attack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QueenAttackCalculatorTest {

    @Test
    void testCoordinateWithNegativeRankNotAllowed() {
        assertThatThrownBy(() -> new BoardCoordinate(-2, 2))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Coordinate must have positive rank.");
    }

    @Test
    void testCoordinateWithRankGreaterThan7NotAllowed() {
        assertThatThrownBy(() -> new BoardCoordinate(8, 4))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Coordinate must have rank <= 7.");
    }

    @Test
    void testCoordinateWithNegativeFileNotAllowed() {
        assertThatThrownBy(() -> new BoardCoordinate(2, -2))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Coordinate must have positive file.");
    }

    @Test
    void testCoordinateWithFileGreaterThan7NotAllowed() {
        assertThatThrownBy(() -> new BoardCoordinate(4, 8))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Coordinate must have file <= 7.");
    }

    @Test
    void testNullCoordinateNotAllowed() {
        assertThatThrownBy(() -> new QueenAttackCalculator(null, new BoardCoordinate(0, 7)))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("You must supply valid board coordinates for both Queens.");
    }

    @Test
    void testQueensMustNotOccupyTheSameSquare() {
        assertThatThrownBy(() -> new QueenAttackCalculator(new BoardCoordinate(2, 2), new BoardCoordinate(2, 2)))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Queens may not occupy the same board coordinate.");
    }

    @Test
    void testQueensThatDoNotShareRankFileOrDiagonalCannotAttack() {
        QueenAttackCalculator calculator = new QueenAttackCalculator(new BoardCoordinate(2, 4), new BoardCoordinate(6, 6));

        assertFalse(calculator.canQueensAttackOneAnother());
    }

    @Test
    void testQueensCanAttackOnTheSameRank() {
        QueenAttackCalculator calculator = new QueenAttackCalculator(new BoardCoordinate(2, 4), new BoardCoordinate(2, 6));

        assertTrue(calculator.canQueensAttackOneAnother());
    }

    @Test
    void testQueensCanAttackOnTheSameFile() {
        QueenAttackCalculator calculator = new QueenAttackCalculator(new BoardCoordinate(4, 5), new BoardCoordinate(2, 5));

        assertTrue(calculator.canQueensAttackOneAnother());
    }

    @Test
    void testQueensCanAttackOnFirstDiagonal() {
        QueenAttackCalculator calculator = new QueenAttackCalculator(new BoardCoordinate(2, 2), new BoardCoordinate(0, 4));

        assertTrue(calculator.canQueensAttackOneAnother());
    }

    @Test
    void testQueensCanAttackOnSecondDiagonal() {
        QueenAttackCalculator calculator = new QueenAttackCalculator(new BoardCoordinate(2, 2), new BoardCoordinate(3, 1));

        assertTrue(calculator.canQueensAttackOneAnother());
    }

    @Test
    void testQueensCanAttackOnThirdDiagonal() {
        QueenAttackCalculator calculator = new QueenAttackCalculator(new BoardCoordinate(2, 2), new BoardCoordinate(1, 1));

        assertTrue(calculator.canQueensAttackOneAnother());
    }

    @Test
    void testQueensCanAttackOnFourthDiagonal() {
        QueenAttackCalculator calculator = new QueenAttackCalculator(new BoardCoordinate(2, 2), new BoardCoordinate(5, 5));

        assertTrue(calculator.canQueensAttackOneAnother());
    }

}
