package com.harcyah.kata.codingbat.string1.start_word;

public class StartWord {

    public String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }

        StringBuilder out = new StringBuilder();
        out.append(str.charAt(0));
        for (int i = 1; i < word.length(); i++) {
            if (str.charAt(i) == word.charAt(i)) {
                out.append(str.charAt(i));
            } else {
                return "";
            }
        }
        return out.toString();
    }

}
