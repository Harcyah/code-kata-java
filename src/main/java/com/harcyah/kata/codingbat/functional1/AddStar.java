package com.harcyah.kata.codingbat.functional1;

import java.util.List;

public class AddStar {

    public List<String> addStar(List<String> strings) {
        return strings.stream().map(x -> x + "*").toList();
    }

}
