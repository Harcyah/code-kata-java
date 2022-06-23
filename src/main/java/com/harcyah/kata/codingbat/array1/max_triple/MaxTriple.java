package com.harcyah.kata.codingbat.array1.max_triple;

public class MaxTriple {

    public int maxTriple(int[] nums) {
        return Math.max(Math.max(nums[0], nums[nums.length - 1]), nums[nums.length / 2]);
    }

}
