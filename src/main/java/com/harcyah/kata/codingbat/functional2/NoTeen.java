package com.harcyah.kata.codingbat.functional2;

import java.util.List;

public class NoTeen {

    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(x -> (x < 13 || x > 19)).toList();
    }

}
