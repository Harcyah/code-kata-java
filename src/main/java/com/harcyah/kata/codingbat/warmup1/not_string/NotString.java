package com.harcyah.kata.codingbat.warmup1.not_string;

public class NotString {

    public String notString(String str) {
        return str.startsWith("not") ? str : "not " + str;
    }

}
