package com.harcyah.kata.codingbat.recursion1.no_x;

public class NoX {

    public String noX(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.length() == 1) {
            return handle(str);
        }
        return handle(str) + noX(str.substring(1));
    }

    private String handle(String str) {
        String prefix = str.substring(0, 1);
        if (prefix.equals("x")) {
            return "";
        } else {
            return prefix;
        }
    }

}
