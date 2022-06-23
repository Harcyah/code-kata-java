package com.harcyah.kata.codingbat.warmup2.string_yak;

public class StringYak {

    public String stringYak(String str) {
        StringBuffer f = new StringBuffer(str);
        for (int i = 0; i < f.length() - 2; i++) {
            if (f.charAt(i) == 'y' && f.charAt(i + 2) == 'k') {
                f.delete(i, i + 3);
            }
        }
        return f.toString();
    }

}
