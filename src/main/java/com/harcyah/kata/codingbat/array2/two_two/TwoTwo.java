package com.harcyah.kata.codingbat.array2.two_two;

public class TwoTwo {

    public boolean twoTwo(int[] nums) {
        if (nums.length == 0) {
            return true;
        }
        if (nums.length == 1) {
            return nums[0] != 2;
        }

        // head check
        int head = nums[0];
        if ((head == 2) && !nextToTwo(nums, 0)) {
            return false;
        }

        // tail check
        int tail = nums[nums.length - 1];
        if ((tail == 2) && !nextToTwo(nums, nums.length - 1)) {
            return false;
        }

        // inner check
        for (int i = 1; i < (nums.length - 1); i++) {
            int v = nums[i];
            if ((v == 2) && !nextToTwo(nums, i)) {
                return false;
            }
        }

        return true;
    }

    private boolean nextToTwo(int[] nums, int i) {
        if ((i - 1) >= 0 && nums[i - 1] == 2) {
            return true;
        }

        if ((i + 1) < nums.length) {
            return nums[i + 1] == 2;
        }

        return false;

    }

}
