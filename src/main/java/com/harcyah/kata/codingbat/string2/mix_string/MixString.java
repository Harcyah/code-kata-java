package com.harcyah.kata.codingbat.string2.mix_string;

public class MixString {

    public String mixString(String a, String b) {
        int l = Math.max(a.length(), b.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l; i++) {
            if (a.length() >= i + 1) {
                sb.append(a.charAt(i));
            }
            if (b.length() >= i + 1) {
                sb.append(b.charAt(i));
            }
        }
        return sb.toString();
    }

}
