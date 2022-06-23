package com.harcyah.kata.codingbat.warmup1.end_up;

public class EndUp {

    public String endUp(String str) {
        int length = str.length();
        if (length < 3) {
            return str.toUpperCase();
        }

        return str.substring(0, length - 3) + str.substring(length - 3, length - 0).toUpperCase();
    }

}
