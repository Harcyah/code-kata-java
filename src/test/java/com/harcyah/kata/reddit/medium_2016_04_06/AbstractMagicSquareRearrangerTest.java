package com.harcyah.kata.reddit.medium_2016_04_06;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static com.harcyah.kata.ResourceLoader.loadLines;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractMagicSquareRearrangerTest {

    private static Integer[][] square8x8Test0;
    private static Integer[][] square8x8Test1;
    private static Integer[][] square8x8Test2;
    private static Integer[][] square12x12Test0;
    private static Integer[][] square12x12Test1;
    private static Integer[][] square16x16;
    private static Integer[][] square20x20;
    private static Integer[][] square24x24;

    protected MagicSquareRearranger rearranger;

    @BeforeAll
    static void setUpClass() throws IOException {
        square8x8Test0 = readSquareFromResource("8x8_0");
        square8x8Test1 = readSquareFromResource("8x8_1");
        square8x8Test2 = readSquareFromResource("8x8_2");
        square12x12Test0 = readSquareFromResource("12x12_0");
        square12x12Test1 = readSquareFromResource("12x12_1");
        square16x16 = readSquareFromResource("16x16");
        square20x20 = readSquareFromResource("20x20");
        square24x24 = readSquareFromResource("24x24");
    }

    @BeforeEach
    void setUp() {
        rearranger = getRearranger();
    }

    protected abstract MagicSquareRearranger getRearranger();

    @Test
    void testGetSolutions() {
        Integer[][] square = {{8, 1, 6}, {4, 9, 2}, {3, 5, 7}};
        List<Integer[]> solutions = rearranger.getSolutions(square);
        assertThat(solutions).hasSize(2);
        assertThat(solutions.get(0)).isEqualTo(new Integer[]{0, 2, 1});
        assertThat(solutions.get(1)).isEqualTo(new Integer[]{1, 2, 0});
    }

    private static Integer[][] readSquareFromResource(String resourceName) throws IOException {
        List<String> lines = loadLines("/com/harcyah/kata/reddit/medium_2016_04_06/" + resourceName);
        Integer[][] square = new Integer[lines.size()][];
        for (int j = 0; j < lines.size(); j++) {
            String[] tokens = lines.get(j).split(" ");
            square[j] = new Integer[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                square[j][i] = Integer.parseInt(tokens[i]);
            }
        }
        return square;
    }

    @Test
    void testGetSolutionsForSample8x8Test0() {
        List<Integer[]> solutions = rearranger.getSolutions(square8x8Test0);
        assertThat(solutions).hasSize(2);
    }

    @Test
    void testGetSolutionsForSample8x8Test1() {
        List<Integer[]> solutions = rearranger.getSolutions(square8x8Test1);
        assertThat(solutions).hasSize(2);
    }

    @Test
    void testGetSolutionsForSample8x8Test2() {
        List<Integer[]> solutions = rearranger.getSolutions(square8x8Test2);
        assertThat(solutions).hasSize(2);
    }

    @Test
    @Disabled
    void testGetSolutionsForSample12x12Test0() {
        List<Integer[]> solutions = rearranger.getSolutions(square12x12Test0);
        assertThat(solutions).hasSize(3646);
    }

    @Test
    @Disabled
    void testGetSolutionsForSample12x12Test1() {
        List<Integer[]> solutions = rearranger.getSolutions(square12x12Test1);
        assertThat(solutions).hasSize(3212);
    }

    @Test
    @Disabled
    void testGetSolutionsForSample16x16() {
        List<Integer[]> solutions = rearranger.getSolutions(square16x16);
        assertThat(solutions).hasSize(3646);
    }

    @Test
    @Disabled
    void testGetSolutionsForSample20x20() {
        List<Integer[]> solutions = rearranger.getSolutions(square20x20);
        assertThat(solutions).hasSize(3646);
    }

    @Test
    @Disabled
    void testGetSolutionsForSample24x24() {
        List<Integer[]> solutions = rearranger.getSolutions(square24x24);
        assertThat(solutions).hasSize(3212);
    }

}
