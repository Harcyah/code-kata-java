package com.harcyah.kata.codingbat.string1.middle_two;

public class MiddleTwo {

    public String middleTwo(String str) {
        int length = str.length();
        int half = length / 2;
        return str.substring(half - 1, half + 1);
    }

}
