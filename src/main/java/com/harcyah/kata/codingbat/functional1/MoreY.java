package com.harcyah.kata.codingbat.functional1;

import java.util.List;

public class MoreY {

    public List<String> moreY(List<String> strings) {
        return strings.stream().map(x -> "y" + x + "y").toList();
    }

}
