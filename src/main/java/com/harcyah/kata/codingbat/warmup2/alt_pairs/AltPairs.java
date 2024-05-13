package com.harcyah.kata.codingbat.warmup2.alt_pairs;

public class AltPairs {

    public String altPairs(String str) {
        StringBuilder f = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            f.append(str.charAt(i));
            if (str.length() > i + 1) {
                f.append(str.charAt(i + 1));
            }
        }
        return f.toString();
    }

}
