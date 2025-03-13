package com.harcyah.kata.codingbat.string1.at_first;

public class AtFirst {

    public String atFirst(String str) {
        StringBuilder at = new StringBuilder("@@");
        if (str.length() >= 2) {
            at.setCharAt(1, str.charAt(1));
        }
        if (str.length() >= 1) {
            at.setCharAt(0, str.charAt(0));
        }
        return at.toString();
    }

}
