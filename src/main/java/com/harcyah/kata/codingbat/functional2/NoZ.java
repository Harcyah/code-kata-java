package com.harcyah.kata.codingbat.functional2;

import java.util.List;

public class NoZ {

    public List<String> noZ(List<String> strings) {
        return strings.stream().filter(x -> !x.contains("z")).toList();
    }

}
