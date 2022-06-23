package com.harcyah.kata.codingbat.recursion2.group_no_adj;

public class GroupNoAdj {

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }

        int curr = nums[start];
        return groupNoAdj(start + 2, nums, target - curr) || groupNoAdj(start + 1, nums, target);
    }

}
