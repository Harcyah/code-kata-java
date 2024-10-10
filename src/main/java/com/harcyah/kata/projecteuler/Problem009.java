package com.harcyah.kata.projecteuler;

public class Problem009 {

    public long getSpecialPythagoreanTriplet() {
        for (long a = 1; a < 1000; a++) {
            for (long b = 2; b < 1000; b++) {
                for (long c = 3; c < 1000; c++) {
                    if ((a + b + c) == 1000 && ((a * a) + (b * b)) == (c * c)) {
                        return a * b * c;
                    }
                }
            }
        }
        throw new UnsupportedOperationException();
    }

}
