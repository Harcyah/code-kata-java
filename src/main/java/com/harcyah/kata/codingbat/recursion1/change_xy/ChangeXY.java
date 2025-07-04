package com.harcyah.kata.codingbat.recursion1.change_xy;

public class ChangeXY {

    public String changeXY(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.length() == 1) {
            return headChar(str);
        }
        return headChar(str) + changeXY(str.substring(1));
    }

    private String headChar(String str) {
        String prefix = str.substring(0, 1);
        if (prefix.equals("x")) {
            return "y";
        } else {
            return prefix;
        }
    }

}
