package com.harcyah.kata.exercism.triangle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    void equilateralTriangleHaveEqualSides() throws Exception {
        Triangle triangle = new Triangle(2, 2, 2);

        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind());
    }

    @Test
    void largerEquilateralTrianglesAlsoHaveEqualSides() throws Exception {
        Triangle triangle = new Triangle(10, 10, 10);

        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind());
    }

    @Test
    void isoscelesTrianglesHaveLastTwoSidesEqual() throws Exception {
        Triangle triangle = new Triangle(3, 4, 4);

        assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
    }

    @Test
    void isoscelesTrianglesHaveFirstAndLastSidesEqual() throws Exception {
        Triangle triangle = new Triangle(4, 3, 4);

        assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
    }

    @Test
    void isoscelesTrianglesHaveTwoFirstSidesEqual() throws Exception {
        Triangle triangle = new Triangle(4, 4, 3);

        assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
    }

    @Test
    void isoscelesTrianglesHaveInFactExactlyTwoSidesEqual() throws Exception {
        Triangle triangle = new Triangle(10, 10, 2);

        assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
    }

    @Test
    void scaleneTrianglesHaveNoEqualSides() throws Exception {
        Triangle triangle = new Triangle(3, 4, 5);

        assertEquals(TriangleKind.SCALENE, triangle.getKind());
    }

    @Test
    void scaleneTrianglesHaveNoEqualSidesAtLargerScaleEither() throws Exception {
        Triangle triangle = new Triangle(10, 11, 12);

        assertEquals(TriangleKind.SCALENE, triangle.getKind());
    }

    @Test
    void scaleneTrianglesHaveNoEqualSidesInDescendingOrderEither() throws Exception {
        Triangle triangle = new Triangle(5, 4, 2);

        assertEquals(TriangleKind.SCALENE, triangle.getKind());
    }

    @Test
    void verySmallTrianglesAreLegal() throws Exception {
        Triangle triangle = new Triangle(0.4, 0.6, 0.3);

        assertEquals(TriangleKind.SCALENE, triangle.getKind());
    }

    @Test
    void trianglesWithNoSizeAreIllegal() {
        assertThatThrownBy(() -> new Triangle(0, 0, 0))
            .isInstanceOf(TriangleException.class);
    }

    @Test
    void trianglesWithNegativeSidesAreIllegal() {
        assertThatThrownBy(() -> new Triangle(3, 4, -5))
            .isInstanceOf(TriangleException.class);
    }

    @Test
    void trianglesViolatingTriangleInequalityAreIllegal() {
        assertThatThrownBy(() -> new Triangle(1, 1, 3))
            .isInstanceOf(TriangleException.class);
    }

    @Test
    void trianglesViolatingTriangleInequalityAreIllegal2() {
        assertThatThrownBy(() -> new Triangle(2, 4, 2))
            .isInstanceOf(TriangleException.class);
    }

    @Test
    void trianglesViolatingTriangleInequalityAreIllegal3() {
        assertThatThrownBy(() -> new Triangle(7, 3, 2))
            .isInstanceOf(TriangleException.class);
    }

}
