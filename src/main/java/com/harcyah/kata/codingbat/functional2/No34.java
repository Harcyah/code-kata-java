package com.harcyah.kata.codingbat.functional2;

import java.util.List;

public class No34 {

    public List<String> no34(List<String> strings) {
        return strings.stream().filter(x -> x.length() != 3 && x.length() != 4).toList();
    }

}
