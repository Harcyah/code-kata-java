package com.harcyah.kata.codingbat.warmup1.has_teen;

public class HasTeen {

    public boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public boolean isTeen(int v) {
        return v >= 13 && v <= 19;
    }

}
