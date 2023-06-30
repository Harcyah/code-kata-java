package com.harcyah.kata.exercism.minesweeper;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MinesweeperBoardTest {

    @Test
    void testInputBoardWithNoRowsAndNoColumns() {
        List<String> inputBoard = Collections.emptyList();
        List<String> expectedAnnotatedRepresentation = Collections.emptyList();
        List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    void testInputBoardWithOneRowAndNoColumns() {
        List<String> inputBoard = Collections.singletonList("");
        List<String> expectedAnnotatedRepresentation = Collections.singletonList("");
        List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    void testInputBoardWithNoMines() {
        List<String> inputBoard = List.of(
                "   ",
                "   ",
                "   ");

        List<String> expectedAnnotatedRepresentation = List.of(
                "   ",
                "   ",
                "   ");

        List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    void testInputBoardWithOnlyMines() {
        List<String> inputBoard = List.of(
                "***",
                "***",
                "***");

        List<String> expectedAnnotatedRepresentation = List.of(
                "***",
                "***",
                "***");

        List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    void testInputBoardWithSingleMineAtCenter() {
        List<String> inputBoard = List.of(
                "   ",
                " * ",
                "   ");

        List<String> expectedAnnotatedRepresentation = List.of(
                "111",
                "1*1",
                "111");

        List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    void testInputBoardWithMinesAroundPerimeter() {
        List<String> inputBoard = List.of(
                "***",
                "* *",
                "***");

        List<String> expectedAnnotatedRepresentation = List.of(
                "***",
                "*8*",
                "***");

        List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    void testInputBoardWithSingleRowAndTwoMines() {
        List<String> inputBoard = Collections.singletonList(
                " * * ");

        List<String> expectedAnnotatedRepresentation = Collections.singletonList(
                "1*2*1");

        List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    void testInputBoardWithSingleRowAndTwoMinesAtEdges() {
        List<String> inputBoard = Collections.singletonList(
                "*   *");

        List<String> expectedAnnotatedRepresentation = Collections.singletonList(
                "*1 1*");

        List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    void testInputBoardWithSingleColumnAndTwoMines() {
        List<String> inputBoard = List.of(
                " ",
                "*",
                " ",
                "*",
                " ");

        List<String> expectedAnnotatedRepresentation = List.of(
                "1",
                "*",
                "2",
                "*",
                "1");

        List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    void testInputBoardWithSingleColumnAndTwoMinesAtEdges() {
        List<String> inputBoard = List.of(
                "*",
                " ",
                " ",
                " ",
                "*");

        List<String> expectedAnnotatedRepresentation = List.of(
                "*",
                "1",
                " ",
                "1",
                "*");

        List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    void testInputBoardWithMinesInCross() {
        List<String> inputBoard = List.of(
                "  *  ",
                "  *  ",
                "*****",
                "  *  ",
                "  *  ");

        List<String> expectedAnnotatedRepresentation = List.of(
                " 2*2 ",
                "25*52",
                "*****",
                "25*52",
                " 2*2 ");

        List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    void testLargeInputBoard() {
        List<String> inputBoard = List.of(
                " *  * ",
                "  *   ",
                "    * ",
                "   * *",
                " *  * ",
                "      ");

        List<String> expectedAnnotatedRepresentation = List.of(
                "1*22*1",
                "12*322",
                " 123*2",
                "112*4*",
                "1*22*2",
                "111111");

        List<String> actualAnnotatedRepresentation = new MinesweeperBoard(inputBoard).getAnnotatedRepresentation();

        assertEquals(expectedAnnotatedRepresentation, actualAnnotatedRepresentation);
    }

    @Test
    void testNullInputBoardIsRejected() {
        assertThatThrownBy(() -> new MinesweeperBoard(null))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Input board may not be null.");
    }

    @Test
    void testInputBoardWithInvalidSymbolsIsRejected() {
        assertThatThrownBy(() -> new MinesweeperBoard(Collections.singletonList(" * & ")))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Input board can only contain the characters ' ' and '*'.");
    }

    @Test
    void testInputBoardWithInconsistentRowLengthsIsRejected() {
        List<String> board = List.of(
            "*",
            "**",
            "* *",
            "*  *",
            "*   *");

        assertThatThrownBy(() -> new MinesweeperBoard(board))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Input board rows must all have the same number of columns.");
    }

}
