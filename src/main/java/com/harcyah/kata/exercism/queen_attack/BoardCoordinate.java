package com.harcyah.kata.exercism.queen_attack;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class BoardCoordinate {

    private final int rank;
    private final int file;

    public BoardCoordinate(int rank, int file) {
        if (rank < 0) {
            throw new IllegalArgumentException("Coordinate must have positive rank.");
        }
        if (rank > 7) {
            throw new IllegalArgumentException("Coordinate must have rank <= 7.");
        }
        this.rank = rank;

        if (file < 0) {
            throw new IllegalArgumentException("Coordinate must have positive file.");
        }
        if (file > 7) {
            throw new IllegalArgumentException("Coordinate must have file <= 7.");
        }
        this.file = file;
    }

    public boolean isOnSameRank(BoardCoordinate other) {
        return this.rank == other.rank;
    }

    public boolean isOnSameFile(BoardCoordinate other) {
        return this.file == other.file;
    }

    public boolean isOnSameDiagonal(BoardCoordinate other) {
        return isOnSameTopLeftToBottomRightDiagonal(other) || isOnSameBottomRightToTopLeftDiagonal(other);
    }

    private boolean isOnSameTopLeftToBottomRightDiagonal(BoardCoordinate other) {
        return (file - rank) == (other.file - other.rank);
    }

    private boolean isOnSameBottomRightToTopLeftDiagonal(BoardCoordinate other) {
        return (file - other.file) == (rank - other.file);
    }

}
