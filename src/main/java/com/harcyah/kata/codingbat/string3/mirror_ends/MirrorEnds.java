package com.harcyah.kata.codingbat.string3.mirror_ends;

public class MirrorEnds {

    public String mirrorEnds(String source) {
        String mirror = "";
        for (int i = 0; i < source.length(); i++) {
            int end = source.length() - 1 - i;
            char a = source.charAt(i);
            char b = source.charAt(end);
            if (a == b) {
                mirror += a;
            } else {
                break;
            }
        }
        return mirror;
    }

}
