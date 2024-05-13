package com.harcyah.kata.codingbat.warmup2.string_x;

public class StringX {

    public String stringX(String str) {
        if (str.equals("") || str.equals("x")) {
            return str;
        }
        StringBuilder f = new StringBuilder();
        f.append(str.charAt(0));
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                f.append(str.charAt(i));
            }
        }
        f.append(str.charAt(str.length() - 1));
        return f.toString();
    }

}
