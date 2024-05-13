package com.harcyah.kata.codingbat.warmup2.string_times;

public class StringTimes {

    public String stringTimes(String str, int n) {
        StringBuilder f = new StringBuilder();
        for (int i = 0; i < n; i++) {
            f.append(str);
        }
        return f.toString();
    }

}
