package com.harcyah.kata.codingbat.recursion1.count_x;

public class CountX {

    public int countX(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        if (str.length() == 1) {
            return prefixCharValue(str);
        }
        return prefixCharValue(str) + countX(str.substring(1));
    }

    private int prefixCharValue(String s) {
        return s.charAt(0) == 'x' ? 1 : 0;
    }

}
