package com.harcyah.kata.reddit.medium_2016_02_17;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class ReversiTest {

    @Test
    void testGetPossibleMovesSample1() throws Exception {
        Reversi reversi = new Reversi("/com/harcyah/kata/reddit/medium_2016_02_17/sample1");
        Set<Square> moves = reversi.getPossibleMoves();
        assertThat(moves)
            .hasSize(4)
            .contains(
                new Square(3, 2),
                new Square(2, 3),
                new Square(5, 4),
                new Square(4, 5));
    }

    @Test
    void testGetPossibleMovesSample2() throws Exception {
        Reversi reversi = new Reversi("/com/harcyah/kata/reddit/medium_2016_02_17/sample2");
        Set<Square> moves = reversi.getPossibleMoves();
        assertThat(moves).hasSize(11);
    }

    @Test
    void testGetPossibleMovesSample3() throws Exception {
        Reversi reversi = new Reversi("/com/harcyah/kata/reddit/medium_2016_02_17/sample3");
        Set<Square> moves = reversi.getPossibleMoves();
        assertThat(moves).hasSize(12);
    }

}
