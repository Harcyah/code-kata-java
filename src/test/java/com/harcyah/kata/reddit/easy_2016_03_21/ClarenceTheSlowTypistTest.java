package com.harcyah.kata.reddit.easy_2016_03_21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClarenceTheSlowTypistTest {

    private static final String IP = "219.45.143.143";

    protected ClarenceTheSlowTypist typist = new ClarenceTheSlowTypist();

    @Test
    void testSolve() {
        assertEquals(27.38, typist.solve(IP), 0.01);
    }

}
