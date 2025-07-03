package com.harcyah.kata.misc.diamond;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiamondTest {

    @Test
    void diamondOfA() {
        Diamond diamond = new Diamond();
        String s = diamond.diamondOf('A');
        assertEquals("A", s);
    }

    @Test
    void diamondOfC() {
        Diamond diamond = new Diamond();
        String s = diamond.diamondOf('C');
        assertEquals(
            "  A  " +
            " B B " +
            "C   C" +
            " B B " +
            "  A  ",
            s);
    }

    @Test
    void diamondOfE() {
        Diamond diamond = new Diamond();
        String s = diamond.diamondOf('E');
        assertEquals(
                "    A    " +
                "   B B   " +
                "  C   C  " +
                " D     D " +
                "E       E" +
                " D     D " +
                "  C   C  " +
                "   B B   " +
                "    A    ",
                s);
    }

}
