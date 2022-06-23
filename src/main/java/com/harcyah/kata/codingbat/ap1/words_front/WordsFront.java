package com.harcyah.kata.codingbat.ap1.words_front;

public class WordsFront {

    public String[] wordsFront(String[] words, int n) {
        String[] results = new String[n];
        for (int i = 0; i < n; i++)
            results[i] = words[i];
        return results;
    }

}
