package com.harcyah.kata.codingbat.string1.twice_n;

public class TwiceN {

    public String twiceN(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

}
