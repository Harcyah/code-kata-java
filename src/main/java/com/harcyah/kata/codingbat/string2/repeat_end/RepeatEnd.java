package com.harcyah.kata.codingbat.string2.repeat_end;

public class RepeatEnd {

    public String repeatEnd(String str, int n) {
        String suffix = str.substring(str.length() - n);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(suffix);
        }
        return sb.toString();
    }

}
