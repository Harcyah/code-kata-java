package com.harcyah.kata.codingbat.string2.repeat_front;

public class RepeatFront {

    public String repeatFront(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str.substring(0, n - i));
        }
        return sb.toString();
    }

}
