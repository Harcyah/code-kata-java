package com.harcyah.kata.codingbat.string3.happy_g;

public class HappyG {

    public boolean happyG(String source) {
        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            if (c == 'g' && !leftHappyG(source, i) && !rightHappyG(source, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean leftHappyG(String source, int i) {
        if ((i - 1) < 0) {
            return false;
        }
        char c = source.charAt(i - 1);
        return c == 'g';
    }

    private boolean rightHappyG(String source, int i) {
        if ((i + 1) >= source.length()) {
            return false;
        }
        char c = source.charAt(i + 1);
        return c == 'g';
    }

}
