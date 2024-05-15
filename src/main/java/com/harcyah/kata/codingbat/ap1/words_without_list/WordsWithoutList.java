package com.harcyah.kata.codingbat.ap1.words_without_list;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {

    public List<String> wordsWithoutList(String[] words, int len) {
        List<String> output = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len)
                output.add(word);
        }
        return output;
    }

}
