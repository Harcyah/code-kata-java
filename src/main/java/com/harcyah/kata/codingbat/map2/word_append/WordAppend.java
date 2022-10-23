package com.harcyah.kata.codingbat.map2.word_append;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

    public String wordAppend(String[] strings) {
        StringBuilder sb = new StringBuilder("");
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            Integer appears = map.get(s);
            if (appears == null) {
                appears = 1;
            } else {
                appears = appears + 1;
            }
            map.put(s, appears);

            if ((appears > 0) && ((appears % 2) == 0)) {
                sb.append(s);
            }
        }
        return sb.toString();
    }

}
