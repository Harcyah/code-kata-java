package com.harcyah.kata.projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem003Test {

    @Test
    void testProblem003() {
        Problem003 sut = new Problem003();
        assertEquals(29, sut.largestPrimeFactor(13195L));
        assertEquals(6857, sut.largestPrimeFactor(600851475143L));
    }

}
