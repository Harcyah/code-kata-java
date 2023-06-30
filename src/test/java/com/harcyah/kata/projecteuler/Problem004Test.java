package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem004Test {

    @Test
    void testProblem004() {
        Problem004 sut = new Problem004();
        assertEquals(9009, sut.getLargestPalindrome(2));
        assertEquals(906609, sut.getLargestPalindrome(3));
    }

}
