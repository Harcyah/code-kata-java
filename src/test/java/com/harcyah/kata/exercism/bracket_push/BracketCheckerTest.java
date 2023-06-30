package com.harcyah.kata.exercism.bracket_push;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BracketCheckerTest {

    @Test
    void testPairedSquareBrackets() {
        final BracketChecker bracketChecker = new BracketChecker("[]");
        assertTrue(bracketChecker.areBracketsMatchedAndNestedCorrectly());
    }

    @Test
    void testEmptyString() {
        final BracketChecker bracketChecker = new BracketChecker("");
        assertTrue(bracketChecker.areBracketsMatchedAndNestedCorrectly());
    }

    @Test
    void testUnpairedBrackets() {
        final BracketChecker bracketChecker = new BracketChecker("[[");
        assertFalse(bracketChecker.areBracketsMatchedAndNestedCorrectly());
    }

    @Test
    void testIncorrectlyOrderedBrackets() {
        final BracketChecker bracketChecker = new BracketChecker("}{");
        assertFalse(bracketChecker.areBracketsMatchedAndNestedCorrectly());
    }

    @Test
    void testPairedBracketsWithWhitespace() {
        final BracketChecker bracketChecker = new BracketChecker("{ }");
        assertTrue(bracketChecker.areBracketsMatchedAndNestedCorrectly());
    }

    @Test
    void testSimpleNestedBrackets() {
        final BracketChecker bracketChecker = new BracketChecker("{[]}");
        assertTrue(bracketChecker.areBracketsMatchedAndNestedCorrectly());
    }

    @Test
    void testSeveralPairedBrackets() {
        final BracketChecker bracketChecker = new BracketChecker("{}[]");
        assertTrue(bracketChecker.areBracketsMatchedAndNestedCorrectly());
    }

    @Test
    void testPairedAndNestedBrackets() {
        final BracketChecker bracketChecker = new BracketChecker("([{}({}[])])");
        assertTrue(bracketChecker.areBracketsMatchedAndNestedCorrectly());
    }

    @Test
    void testUnopenedClosingBracket() {
        final BracketChecker bracketChecker = new BracketChecker("{[)][]}");
        assertFalse(bracketChecker.areBracketsMatchedAndNestedCorrectly());
    }

    @Test
    void testUnpairedAndNestedBracket() {
        final BracketChecker bracketChecker = new BracketChecker("([{])");
        assertFalse(bracketChecker.areBracketsMatchedAndNestedCorrectly());
    }

    @Test
    void testPairedAndIncorrectlyNestedBrackets() {
        final BracketChecker bracketChecker = new BracketChecker("[({]})");
        assertFalse(bracketChecker.areBracketsMatchedAndNestedCorrectly());
    }

    @Test
    void testValidMathExpression() {
        final BracketChecker bracketChecker = new BracketChecker("(((185 + 223.85) * 15) - 543)/2");
        assertTrue(bracketChecker.areBracketsMatchedAndNestedCorrectly());
    }

    @Test
    void testValidComplexLaTeXExpression() {
        final BracketChecker bracketChecker = new BracketChecker(
                "\\left(\\begin{array}{cc} \\frac{1}{3} & x\\\\ \\mathrm{e}^{x} &... x^2 \\end{array}\\right)");

        assertTrue(bracketChecker.areBracketsMatchedAndNestedCorrectly());
    }

}
