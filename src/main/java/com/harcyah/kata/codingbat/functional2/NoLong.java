package com.harcyah.kata.codingbat.functional2;

import java.util.List;

public class NoLong {

    public List<String> noLong(List<String> strings) {
        return strings.stream().filter(x -> x.length() < 4).toList();
    }

}
