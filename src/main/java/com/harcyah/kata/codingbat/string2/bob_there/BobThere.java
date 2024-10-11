package com.harcyah.kata.codingbat.string2.bob_there;

public class BobThere {

    public boolean bobThere(String it) {
        if (it == null || it.length() < 3) {
            return false;
        }

        for (int i = 0; i < it.length() - 2; i++) {
            char left = it.charAt(i);
            char right = it.charAt(i + 2);
            if (left == right && left == 'b') {
                return true;
            }
        }

        return false;
    }

}
