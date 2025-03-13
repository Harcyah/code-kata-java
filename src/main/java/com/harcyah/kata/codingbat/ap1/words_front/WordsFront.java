package com.harcyah.kata.codingbat.ap1.words_front;

public class WordsFront {

    public String[] wordsFront(String[] words, int n) {
        String[] results = new String[n];
        System.arraycopy(words, 0, results, 0, n);
        return results;
    }

}
