package com.harcyah.kata.codingbat.string2.repeat_separator;

public class RepeatSeparator {

    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0; i < count - 1; i++) {
            sb.append(sep);
            sb.append(word);
        }
        return sb.toString();
    }

}
