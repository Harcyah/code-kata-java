package com.harcyah.kata.reddit.easy_2016_04_18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShannonEntropyTest {

    protected ShannonEntropy shannonEntropy = new ShannonEntropy();

    @Test
    void testCompute() {
        assertEquals(1.84644, shannonEntropy.compute("1223334444"), 0.00001);
        assertEquals(3.18083, shannonEntropy.compute("Hello, world!"), 0.00001);
    }

}
