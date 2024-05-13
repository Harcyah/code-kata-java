package com.harcyah.kata.exercism.pangram;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Pangrams {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static boolean isPangram(String source) {
        String alphabet = ALPHABET;
        for (Character character : source.toCharArray()) {
            char test = Character.toLowerCase(character);
            alphabet = alphabet.replace(test, ' ');
        }
        return alphabet.trim().isEmpty();
    }

}
