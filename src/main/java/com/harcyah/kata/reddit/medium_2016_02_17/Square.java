package com.harcyah.kata.reddit.medium_2016_02_17;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Square {

    protected int col;
    protected int row;

    public Square(int col, int row) {
        this.col = col;
        this.row = row;
    }

    @Override
    public String toString() {
        return "Col: " + col + ", Row: " + row;
    }

}
