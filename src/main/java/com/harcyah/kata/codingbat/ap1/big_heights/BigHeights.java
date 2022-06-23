package com.harcyah.kata.codingbat.ap1.big_heights;

public class BigHeights {

    public int bigHeights(int[] heights, int start, int end) {
        int counter = 0;
        for (int i = start; i < end; i++) {
            int lo = heights[i];
            int hi = heights[i + 1];
            counter += Math.abs(lo - hi) >= 5 ? 1 : 0;
        }
        return counter;
    }

}
