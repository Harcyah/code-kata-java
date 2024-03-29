package com.harcyah.kata.codingbat.logic1.answer_cell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnswerCellTest {

    @Test
    void testAnswerCell() {
        AnswerCell answerCell = new AnswerCell();
        assertTrue(answerCell.answerCell(false, false, false));
        assertFalse(answerCell.answerCell(false, false, true));
        assertFalse(answerCell.answerCell(true, false, false));
        assertTrue(answerCell.answerCell(true, true, false));
        assertTrue(answerCell.answerCell(false, true, false));
        assertFalse(answerCell.answerCell(true, true, true));
    }

}
