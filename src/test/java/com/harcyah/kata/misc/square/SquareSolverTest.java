package com.harcyah.kata.misc.square;

import com.google.common.collect.Sets;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.SortedSet;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SquareSolverTest {

    protected SquareSolver solver = new SquareSolver();

    @Test
    void testExerciseExample() {
        Point a = new Point(-1, -1);
        Point b = new Point(2, 1);
        Point c = new Point(4, -2);
        Point d = new Point(1, -4);
        List<Point> points = List.of(a, b, c, d);

        List<Square> squares = solver.findSquares(Sets.newTreeSet(points));

        assertThat(squares).isNotEmpty();
    }

    @Test
    void testObviousCaseSuccess() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, -1);
        Point c = new Point(-1, 1);
        Point d = new Point(1, 1);
        List<Point> points = List.of(a, b, c, d);

        List<Square> squares = solver.findSquares(Sets.newTreeSet(points));

        assertFalse(squares.isEmpty());
        Square square = squares.get(0);
        assertNotNull(square);
        assertEquals(a, square.getA());
        assertEquals(b, square.getC());
        assertEquals(c, square.getB());
        assertEquals(d, square.getD());
    }

    @Test
    void testSimpleCaseSuccess() {
        Point a = new Point(-2, 1);
        Point b = new Point(-1, -2);
        Point c = new Point(2, -1);
        Point d = new Point(1, 2);
        List<Point> points = List.of(a, b, c, d);

        List<Square> squares = solver.findSquares(Sets.newTreeSet(points));

        assertFalse(squares.isEmpty());
        Square square = squares.get(0);
        assertNotNull(square);
        assertEquals(a, square.getA());
        assertEquals(b, square.getB());
        assertEquals(c, square.getD());
        assertEquals(d, square.getC());
    }

    @Test
    void testObviousCaseFailure() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, -1);
        Point c = new Point(-1, 1);
        Point d = new Point(1, 10);
        List<Point> points = List.of(a, b, c, d);

        List<Square> squares = solver.findSquares(Sets.newTreeSet(points));

        assertThat(squares).isEmpty();
    }

    @Test
    @Disabled
    void testWithLaurentDataset() throws IOException {
        Reader reader = new Reader();
        SortedSet<Point> points = reader.read();

        List<Square> squares = solver.findSquares(points);

        assertThat(squares).hasSize(112);
    }

}
