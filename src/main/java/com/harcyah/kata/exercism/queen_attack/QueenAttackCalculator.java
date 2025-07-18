package com.harcyah.kata.exercism.queen_attack;

public class QueenAttackCalculator {

    private final BoardCoordinate q1;
    private final BoardCoordinate q2;

    public QueenAttackCalculator(BoardCoordinate q1, BoardCoordinate q2) {
        if (q1 == null || q2 == null) {
            throw new IllegalArgumentException("You must supply valid board coordinates for both Queens.");
        }
        if (q1.equals(q2)) {
            throw new IllegalArgumentException("Queens may not occupy the same board coordinate.");
        }
        this.q1 = q1;
        this.q2 = q2;
    }

    public boolean canQueensAttackOneAnother() {
        return (q1.isOnSameRank(q2) || q1.isOnSameFile(q2) || q1.isOnSameDiagonal(q2));
    }

}
