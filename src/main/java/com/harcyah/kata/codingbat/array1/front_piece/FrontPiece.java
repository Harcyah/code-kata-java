package com.harcyah.kata.codingbat.array1.front_piece;

public class FrontPiece {

    public int[] frontPiece(int[] nums) {
        if (nums.length == 0) {
            return new int[0];
        }
        if (nums.length == 1) {
            return new int[]{nums[0]};
        }
        return new int[]{nums[0], nums[1]};
    }

}
