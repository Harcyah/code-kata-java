package com.harcyah.kata.codingbat.warmup2.string_bits;

public class StringBits {

    public String stringBits(String str) {
        StringBuilder f = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                f.append(str.charAt(i));
            }
        }
        return f.toString();
    }

}
