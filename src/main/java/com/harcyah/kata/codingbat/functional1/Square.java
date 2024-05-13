package com.harcyah.kata.codingbat.functional1;

import java.util.List;

public class Square {

    public List<Integer> square(List<Integer> nums) {
        return nums.stream().map(x -> x * x).toList();
    }

}
