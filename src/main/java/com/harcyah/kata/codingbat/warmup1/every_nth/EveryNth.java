package com.harcyah.kata.codingbat.warmup1.every_nth;

public class EveryNth {

    public String everyNth(String str, int n) {
        StringBuilder f = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % n == 0) {
                f.append(str.charAt(i));
            }
        }
        return f.toString();
    }

}
