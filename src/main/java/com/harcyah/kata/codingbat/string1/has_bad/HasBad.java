package com.harcyah.kata.codingbat.string1.has_bad;

public class HasBad {

    public boolean hasBad(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.startsWith("bad") || str.startsWith("bad", 1);
    }

}
