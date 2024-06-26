package com.harcyah.kata.codingbat.functional2;

import java.util.List;

public class NoYy {

    public List<String> noYy(List<String> strings) {
        return strings.stream()
            .map(x -> x + "y")
            .filter(x -> !x.contains("yy"))
            .toList();
    }

}
