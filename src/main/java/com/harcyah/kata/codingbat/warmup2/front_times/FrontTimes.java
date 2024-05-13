package com.harcyah.kata.codingbat.warmup2.front_times;

public class FrontTimes {

    public String frontTimes(String str, int n) {
        String prefix = str.length() < 3 ? str : str.substring(0, 3);
        StringBuilder f = new StringBuilder();
        for (int i = 0; i < n; i++) {
            f.append(prefix);
        }
        return f.toString();
    }

}
