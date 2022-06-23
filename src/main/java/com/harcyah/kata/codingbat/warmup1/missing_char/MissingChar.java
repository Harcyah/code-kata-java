package com.harcyah.kata.codingbat.warmup1.missing_char;

public class MissingChar {

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

}
