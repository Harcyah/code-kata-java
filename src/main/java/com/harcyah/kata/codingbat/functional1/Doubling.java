package com.harcyah.kata.codingbat.functional1;

import java.util.List;

public class Doubling {

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(x -> x * 2).toList();
    }

}
