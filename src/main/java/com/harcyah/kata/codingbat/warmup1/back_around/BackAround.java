package com.harcyah.kata.codingbat.warmup1.back_around;

public class BackAround {

    public String backAround(String str) {
        char last = str.charAt(str.length() - 1);
        return last + str + last;
    }

}
