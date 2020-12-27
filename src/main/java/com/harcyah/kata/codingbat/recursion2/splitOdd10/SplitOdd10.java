package com.harcyah.kata.codingbat.recursion2.splitOdd10;

public class SplitOdd10 {

    public boolean splitOdd10(int[] nums) {
        return canSplit(0, nums, 0, 0);
    }

    private boolean canSplit(int start, int[] nums, int left, int right) {
        if (start >= nums.length) {
            return ((left % 10) == 0) && ((right & 1) == 1);
        } else {
            return canSplit(start + 1, nums, left + nums[start], right) || canSplit(start + 1, nums, left, right + nums[start]);
        }
    }

}
