package com.harcyah.kata.codingbat.string2.plus_out;

public class PlusOut {

    public String plusOut(String source, String word) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            String rem = source.substring(i);
            if (rem.startsWith(word)) {
                out.append(word);
                i += word.length() - 1;
            } else {
                out.append('+');
            }
        }
        return out.toString();
    }

}
