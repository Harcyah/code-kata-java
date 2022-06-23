package com.harcyah.kata.codingbat.string1.extra_front;

public class ExtraFront {

    public String extraFront(String str) {
        String prefix = str.substring(0, Math.min(2, str.length()));
        return prefix + prefix + prefix;
    }

}
