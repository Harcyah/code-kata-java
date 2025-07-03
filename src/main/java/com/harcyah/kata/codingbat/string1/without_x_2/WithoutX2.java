package com.harcyah.kata.codingbat.string1.without_x_2;

public class WithoutX2 {

    public String withoutX2(String str) {
        StringBuilder out = new StringBuilder();
        if (!str.isEmpty() && str.charAt(0) != 'x') {
            out.append(str.charAt(0));
        }
        if (str.length() >= 2 && str.charAt(1) != 'x') {
            out.append(str.charAt(1));
        }
        if (str.length() >= 3) {
            out.append(str.substring(2));
        }
        return out.toString();
    }

}
