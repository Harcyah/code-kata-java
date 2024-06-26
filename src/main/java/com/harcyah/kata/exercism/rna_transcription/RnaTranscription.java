package com.harcyah.kata.exercism.rna_transcription;

import lombok.experimental.UtilityClass;

import java.util.HashMap;
import java.util.Map;

@UtilityClass
public class RnaTranscription {

    private static final Map<Character, Character> MAPPING = new HashMap<>();

    static {
        MAPPING.put('G', 'C');
        MAPPING.put('C', 'G');
        MAPPING.put('T', 'A');
        MAPPING.put('A', 'U');
    }

    public static String ofDna(String source) {
        StringBuilder rna = new StringBuilder();
        char[] chars = source.toCharArray();
        for (char c : chars) {
            rna.append(MAPPING.get(c));
        }
        return rna.toString();
    }

}
