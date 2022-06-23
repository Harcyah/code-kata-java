package com.harcyah.kata.codingbat.string2.prefix_again;

public class PrefixAgain {

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        String theend = str.substring(n);
        return theend.contains(prefix);
    }

}
