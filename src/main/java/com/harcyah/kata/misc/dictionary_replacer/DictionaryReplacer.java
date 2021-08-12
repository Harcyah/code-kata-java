package com.harcyah.kata.misc.dictionary_replacer;

import java.util.Map;

public class DictionaryReplacer {

    public static String replace(String needle, Map<String, String> dictionary) {
        String out = needle;
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            out = out.replace("$" + entry.getKey() + "$", entry.getValue());
        }
        return out;
    }

}
