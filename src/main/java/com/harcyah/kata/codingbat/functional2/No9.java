package com.harcyah.kata.codingbat.functional2;

import java.util.List;

public class No9 {

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(x -> x % 10 != 9).toList();
    }

}
