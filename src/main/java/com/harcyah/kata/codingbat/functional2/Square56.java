package com.harcyah.kata.codingbat.functional2;

import java.util.List;

public class Square56 {

    public List<Integer> square56(List<Integer> nums) {
        return nums.stream()
            .map(x -> x * x)
            .map(x -> x + 10)
            .filter(x -> x % 10 != 5)
            .filter(x -> x % 10 != 6)
            .toList();
    }

}
