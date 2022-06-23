package com.harcyah.kata.codingbat.string1.the_end;

public class TheEnd {

    public String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }

}
