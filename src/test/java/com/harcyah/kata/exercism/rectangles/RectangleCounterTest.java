package com.harcyah.kata.exercism.rectangles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleCounterTest {

    private RectangleCounter rectangleCounter;

    @BeforeEach
    void setUp() {
        rectangleCounter = new RectangleCounter();
    }

    @Test
    void testInputWithNoColumnsContainsNoRectangles() {
        String[] inputGrid = new String[]{};

        assertEquals(0, rectangleCounter.countRectangles(inputGrid));
    }

    @Test
    void testNonTrivialInputWithNoRectangles() {
        String[] inputGrid = new String[]{" "};

        assertEquals(0, rectangleCounter.countRectangles(inputGrid));
    }

    @Test
    void testInputWithOneRectangle() {
        String[] inputGrid = new String[]{
            "+-+",
            "| |",
            "+-+"
        };

        assertEquals(1, rectangleCounter.countRectangles(inputGrid));
    }

    @Test
    void testInputWithTwoRectanglesWithoutSharedEdges() {
        String[] inputGrid = new String[]{
            "  +-+",
            "  | |",
            "+-+-+",
            "| |  ",
            "+-+  "
        };

        assertEquals(2, rectangleCounter.countRectangles(inputGrid));
    }

    @Test
    void testInputWithFiveRectanglesWithSharedEdges() {
        String[] inputGrid = new String[]{
            "  +-+",
            "  | |",
            "+-+-+",
            "| | |",
            "+-+-+"
        };

        assertEquals(5, rectangleCounter.countRectangles(inputGrid));
    }

    @Test
    void testThatRectangleOfHeightOneIsCounted() {
        String[] inputGrid = new String[]{
            "+--+",
            "+--+"
        };

        assertEquals(1, rectangleCounter.countRectangles(inputGrid));
    }

    @Test
    void testThatRectangleOfWidthOneIsCounted() {
        String[] inputGrid = new String[]{
            "++",
            "||",
            "++"
        };

        assertEquals(1, rectangleCounter.countRectangles(inputGrid));
    }

    @Test
    void testThatOneByOneSquareIsCounted() {
        String[] inputGrid = new String[]{
            "++",
            "++"
        };

        assertEquals(1, rectangleCounter.countRectangles(inputGrid));
    }

    @Test
    void testThatIncompleteRectanglesAreNotCounted() {
        String[] inputGrid = new String[]{
            "  +-+",
            "    |",
            "+-+-+",
            "| | -",
            "+-+-+"
        };

        assertEquals(1, rectangleCounter.countRectangles(inputGrid));
    }

    @Test
    void testThatRectanglesOfDifferentSizesAreAllCounted() {
        String[] inputGrid = new String[]{
            "+------+----+",
            "|      |    |",
            "+---+--+    |",
            "|   |       |",
            "+---+-------+"
        };

        assertEquals(3, rectangleCounter.countRectangles(inputGrid));
    }

    @Test
    void testThatIntersectionsWithoutCornerCharacterDoNotCountAsRectangleCorners() {
        String[] inputGrid = new String[]{
            "+------+----+",
            "|      |    |",
            "+------+    |",
            "|   |       |",
            "+---+-------+"
        };

        assertEquals(2, rectangleCounter.countRectangles(inputGrid));
    }

    @Test
    void testLargeInputWithManyRectangles() {
        String[] inputGrid = new String[]{
            "+---+--+----+",
            "|   +--+----+",
            "+---+--+    |",
            "|   +--+----+",
            "+---+--+--+-+",
            "+---+--+--+-+",
            "+------+  | |",
            "          +-+"
        };

        assertEquals(60, rectangleCounter.countRectangles(inputGrid));
    }

}
