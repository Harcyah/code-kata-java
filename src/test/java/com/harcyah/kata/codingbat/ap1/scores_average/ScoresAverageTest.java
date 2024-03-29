package com.harcyah.kata.codingbat.ap1.scores_average;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScoresAverageTest {

    @Test
    void testScoresAverage() {
        ScoresAverage scoresAverage = new ScoresAverage();
        assertEquals(4, scoresAverage.scoresAverage(new int[]{2, 2, 4, 4}));
        assertEquals(4, scoresAverage.scoresAverage(new int[]{4, 4, 4, 2, 2, 2}));
        assertEquals(4, scoresAverage.scoresAverage(new int[]{3, 4, 5, 1, 2, 3}));
        assertEquals(6, scoresAverage.scoresAverage(new int[]{5, 6}));
        assertEquals(5, scoresAverage.scoresAverage(new int[]{5, 4}));
        assertEquals(5, scoresAverage.scoresAverage(new int[]{5, 4, 5, 6, 2, 1, 2, 3}));
    }

}
