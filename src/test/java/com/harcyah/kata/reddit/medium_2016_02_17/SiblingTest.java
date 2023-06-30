package com.harcyah.kata.reddit.medium_2016_02_17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SiblingTest {

    @Test
    void testTop() {
        Square firstLevelNeighbour = Sibling.TOP.getNeighbour(5, 5, 1);
        Square secondLevelNeighbour = Sibling.TOP.getNeighbour(5, 5, 2);
        assertEquals(5, firstLevelNeighbour.col);
        assertEquals(4, firstLevelNeighbour.row);
        assertEquals(5, secondLevelNeighbour.col);
        assertEquals(3, secondLevelNeighbour.row);
    }

    @Test
    void testBottom() {
        Square firstLevelNeighbour = Sibling.BOTTOM.getNeighbour(5, 5, 1);
        Square secondLevelNeighbour = Sibling.BOTTOM.getNeighbour(5, 5, 2);
        assertEquals(5, firstLevelNeighbour.col);
        assertEquals(6, firstLevelNeighbour.row);
        assertEquals(5, secondLevelNeighbour.col);
        assertEquals(7, secondLevelNeighbour.row);
    }

    @Test
    void testRight() {
        Square firstLevelNeighbour = Sibling.RIGHT.getNeighbour(5, 5, 1);
        Square secondLevelNeighbour = Sibling.RIGHT.getNeighbour(5, 5, 2);
        assertEquals(6, firstLevelNeighbour.col);
        assertEquals(5, firstLevelNeighbour.row);
        assertEquals(7, secondLevelNeighbour.col);
        assertEquals(5, secondLevelNeighbour.row);
    }

    @Test
    void testLeft() {
        Square firstLevelNeighbour = Sibling.LEFT.getNeighbour(5, 5, 1);
        Square secondLevelNeighbour = Sibling.LEFT.getNeighbour(5, 5, 2);
        assertEquals(4, firstLevelNeighbour.col);
        assertEquals(5, firstLevelNeighbour.row);
        assertEquals(3, secondLevelNeighbour.col);
        assertEquals(5, secondLevelNeighbour.row);
    }

    @Test
    void testTopRight() {
        Square firstLevelNeighbour = Sibling.TOP_RIGHT.getNeighbour(5, 5, 1);
        Square secondLevelNeighbour = Sibling.TOP_RIGHT.getNeighbour(5, 5, 2);
        assertEquals(6, firstLevelNeighbour.col);
        assertEquals(4, firstLevelNeighbour.row);
        assertEquals(7, secondLevelNeighbour.col);
        assertEquals(3, secondLevelNeighbour.row);
    }

    @Test
    void testBottomRight() {
        Square firstLevelNeighbour = Sibling.BOTTOM_RIGHT.getNeighbour(5, 5, 1);
        Square secondLevelNeighbour = Sibling.BOTTOM_RIGHT.getNeighbour(5, 5, 2);
        assertEquals(6, firstLevelNeighbour.col);
        assertEquals(6, firstLevelNeighbour.row);
        assertEquals(7, secondLevelNeighbour.col);
        assertEquals(7, secondLevelNeighbour.row);
    }

    @Test
    void testBottomLeft() {
        Square firstLevelNeighbour = Sibling.BOTTOM_LEFT.getNeighbour(5, 5, 1);
        Square secondLevelNeighbour = Sibling.BOTTOM_LEFT.getNeighbour(5, 5, 2);
        assertEquals(4, firstLevelNeighbour.col);
        assertEquals(6, firstLevelNeighbour.row);
        assertEquals(3, secondLevelNeighbour.col);
        assertEquals(7, secondLevelNeighbour.row);
    }

    @Test
    void testTopLeft() {
        Square firstLevelNeighbour = Sibling.TOP_LEFT.getNeighbour(5, 5, 1);
        Square secondLevelNeighbour = Sibling.TOP_LEFT.getNeighbour(5, 5, 2);
        assertEquals(4, firstLevelNeighbour.col);
        assertEquals(4, firstLevelNeighbour.row);
        assertEquals(3, secondLevelNeighbour.col);
        assertEquals(3, secondLevelNeighbour.row);
    }

}
