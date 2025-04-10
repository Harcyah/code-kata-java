package com.harcyah.kata.codingbat.warmup1.max1020;

public class Max1020 {

    public int max1020(int a, int b) {
        boolean isA = isIn(a, 10, 20);
        boolean isB = isIn(b, 10, 20);
        if (!isA && !isB) {
            return 0;
        }

        if (!isA) {
            return b;
        }

        if (!isB) {
            return a;
        }

        return Math.max(a, b);
    }

    public boolean isIn(int v, int min, int max) {
        return v >= min && v <= max;
    }

}
