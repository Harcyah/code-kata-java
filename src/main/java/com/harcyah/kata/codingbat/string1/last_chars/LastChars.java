package com.harcyah.kata.codingbat.string1.last_chars;

public class LastChars {

    public String lastChars(String a, String b) {
        String firstOfA = a.isEmpty() ? "@" : a.substring(0, 1);
        String lastOfB = b.isEmpty() ? "@" : b.substring(b.length() - 1);
        return firstOfA + lastOfB;
    }

}
