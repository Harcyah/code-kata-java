package com.harcyah.kata.exercism.sum_of_multiples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfMultiplesTest {

    @Test
    void testSumOfMultiplesOf3and4UpToOne() {
        SumOfMultiples mySum = new SumOfMultiples();
        int[] set = {
            3,
            5
        };
        int output = mySum.sum(1, set);
        assertEquals(0, output);
    }

    @Test
    void testSumOfMultiplesOf3and5UpToFour() {
        SumOfMultiples mySum = new SumOfMultiples();
        int[] set = {
            3,
            5
        };
        int output = mySum.sum(4, set);
        assertEquals(3, output);
    }

    @Test
    void testSumOfMultiplesOf3and5UpToTen() {
        SumOfMultiples mySum = new SumOfMultiples();
        int[] set = {
            3,
            5
        };
        int output = mySum.sum(10, set);
        assertEquals(23, output);
    }

    @Test
    void testSumOfMultiplesOf3and5UpToOneHundred() {
        SumOfMultiples mySum = new SumOfMultiples();
        int[] set = {
            3,
            5
        };
        int output = mySum.sum(100, set);
        assertEquals(2318, output);
    }

    @Test
    void testSumOfMultiplesOf3and5UpToOneThousand() {
        SumOfMultiples mySum = new SumOfMultiples();
        int[] set = {
            3,
            5
        };
        int output = mySum.sum(1000, set);
        assertEquals(233168, output);
    }

    @Test
    void testSumOfMultiplesOf7and13and17UpToTwenty() {
        SumOfMultiples mySum = new SumOfMultiples();
        int[] set = {
            7,
            13,
            17
        };
        int output = mySum.sum(20, set);
        assertEquals(51, output);
    }

    @Test
    void testSumOfMultiplesOf4and6UpToFifteen() {
        SumOfMultiples mySum = new SumOfMultiples();
        int[] set = {
            4,
            6
        };
        int output = mySum.sum(15, set);
        assertEquals(30, output);
    }

    @Test
    void testSumOfMultiplesOf5and6and8UpToOneHundredFifty() {
        SumOfMultiples mySum = new SumOfMultiples();
        int[] set = {
            5,
            6,
            8
        };
        int output = mySum.sum(150, set);
        assertEquals(4419, output);
    }

    @Test
    void testSumOfMultiplesOf5and25UpToTwoHundredSeventyFive() {
        SumOfMultiples mySum = new SumOfMultiples();
        int[] set = {
            5,
            25
        };
        int output = mySum.sum(51, set);
        assertEquals(275, output);
    }

    @Test
    void testSumOfMultiplesOf43and47UpToTenThousand() {
        SumOfMultiples mySum = new SumOfMultiples();
        int[] set = {
            43,
            47
        };
        int output = mySum.sum(10000, set);
        assertEquals(2203160, output);
    }

    @Test
    void testSumOfMultiplesOfOneUpToOneHundred() {
        SumOfMultiples mySum = new SumOfMultiples();
        int[] set = {
            1
        };
        int output = mySum.sum(100, set);
        assertEquals(4950, output);
    }

    @Test
    void testSumOfMultiplesOfNoneUpToTenThousand() {
        SumOfMultiples mySum = new SumOfMultiples();
        int[] set = {};
        int output = mySum.sum(10000, set);
        assertEquals(0, output);
    }

}
