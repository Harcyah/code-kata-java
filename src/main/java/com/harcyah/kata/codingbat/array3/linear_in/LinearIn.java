package com.harcyah.kata.codingbat.array3.linear_in;

public class LinearIn {

    public boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) {
            return true;
        }

        int outerIterator = 0;
        for (int value : inner) {
            // Is this value in outer, between i and outer.length ?
            boolean found = false;
            for (; (outerIterator < outer.length) && !found; outerIterator++) {
                if (outer[outerIterator] == value) {
                    found = true;
                }
            }

            if (!found) {
                return false;
            }
        }
        return true;
    }

}
