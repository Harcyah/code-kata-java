package com.harcyah.kata.misc.square;

import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

public class SquareSolver {

    public List<Square> findSquares(SortedSet<Point> points) {
        Preconditions.checkArgument(points.size() >= 4);
        List<Square> squares = new ArrayList<>();
        Iterator<Point> iterator = points.iterator();
        Point a = iterator.next();
        while (a != null) {
            for (Point b : points) {
                if (a.equals(b)) {
                    continue;
                }

                Point ab = new Point(b.getX() - a.getX(), b.getY() - a.getY());

                Point normalA = new Point(ab.getY(), -ab.getX());
                testAndAdd(a, b, normalA, points, squares);

                Point normalB = new Point(-ab.getY(), ab.getX());
                testAndAdd(a, b, normalB, points, squares);
            }

            iterator.remove();
            a = iterator.hasNext() ? iterator.next() : null;
        }

        return squares;
    }

    protected void testAndAdd(Point a, Point b, Point normal, SortedSet<Point> points, List<Square> output) {
        Point c = new Point(a, normal);
        if (points.contains(c)) {
            Point d = new Point(b, normal);
            if (points.contains(d)) {
                output.add(new Square(a, b, c, d));
            }
        }
    }

}
