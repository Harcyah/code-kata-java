package com.harcyah.kata.codingbat.array1.make_middle;

public class MakeMiddle {

    public int[] makeMiddle(int[] nums) {
        return new int[]{nums[(nums.length / 2) - 1], nums[nums.length / 2]};
    }

}
