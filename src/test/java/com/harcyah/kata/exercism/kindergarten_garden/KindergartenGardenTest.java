package com.harcyah.kata.exercism.kindergarten_garden;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KindergartenGardenTest {

    @Test
    void singleStudent() {
        String student = "Alice";
        String plants = "RC\nGG";
        List<Plant> expected = List.of(Plant.RADISHES, Plant.CLOVER, Plant.GRASS, Plant.GRASS);

        assertEquals(
            expected,
            new KindergartenGarden(plants).getPlantsOfStudent(student)
        );
    }

    @Test
    void singleStudent2() {
        String student = "Alice";
        String plants = "VC\nRC";
        List<Plant> expected = List.of(Plant.VIOLETS, Plant.CLOVER, Plant.RADISHES, Plant.CLOVER);

        assertEquals(
            expected,
            new KindergartenGarden(plants).getPlantsOfStudent(student)
        );
    }

    @Test
    void twoStudents() {
        String student = "Bob";
        String plants = "VVCG\nVVRC";
        List<Plant> expected = List.of(Plant.CLOVER, Plant.GRASS, Plant.RADISHES, Plant.CLOVER);

        assertEquals(
            expected,
            new KindergartenGarden(plants).getPlantsOfStudent(student)
        );
    }

    @Test
    void oneGardenSecondStudent() {
        String student = "Bob";
        String plants = "VVCCGG\nVVCCGG";
        List<Plant> expected = List.of(Plant.CLOVER, Plant.CLOVER, Plant.CLOVER, Plant.CLOVER);

        assertEquals(
            expected,
            new KindergartenGarden(plants).getPlantsOfStudent(student)
        );
    }

    @Test
    void oneGardenThirdStudent() {
        String student = "Charlie";
        String plants = "VVCCGG\nVVCCGG";
        List<Plant> expected = List.of(Plant.GRASS, Plant.GRASS, Plant.GRASS, Plant.GRASS);

        assertEquals(
            expected,
            new KindergartenGarden(plants).getPlantsOfStudent(student)
        );
    }

    @Test
    void fullGardenFirstStudent() {
        String student = "Alice";
        String plants = "VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV";
        List<Plant> expected = List.of(Plant.VIOLETS, Plant.RADISHES, Plant.VIOLETS, Plant.RADISHES);

        assertEquals(
            expected,
            new KindergartenGarden(plants).getPlantsOfStudent(student)
        );
    }

    @Test
    void fullGardenSecondStudent() {
        String student = "Bob";
        String plants = "VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV";
        List<Plant> expected = List.of(Plant.CLOVER, Plant.GRASS, Plant.CLOVER, Plant.CLOVER);

        assertEquals(
            expected,
            new KindergartenGarden(plants).getPlantsOfStudent(student)
        );
    }

    @Test
    void fullGardenSecondToLastStudent() {
        String student = "Kincaid";
        String plants = "VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV";
        List<Plant> expected = List.of(Plant.GRASS, Plant.CLOVER, Plant.CLOVER, Plant.GRASS);

        assertEquals(
            expected,
            new KindergartenGarden(plants).getPlantsOfStudent(student)
        );
    }

    @Test
    void fullGardenLastStudent() {
        String student = "Larry";
        String plants = "VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV";
        List<Plant> expected = List.of(Plant.GRASS, Plant.VIOLETS, Plant.CLOVER, Plant.VIOLETS);

        assertEquals(
            expected,
            new KindergartenGarden(plants).getPlantsOfStudent(student)
        );
    }

    @Test
    void customStudentGardenFirstStudentInAlphabeticalOrder() {
        String[] studentArray = {"Samantha", "Patricia", "Xander", "Roger"};
        String student = "Patricia";
        String plants = "VCRRGVRG\nRVGCCGCV";
        List<Plant> expected = List.of(Plant.VIOLETS, Plant.CLOVER, Plant.RADISHES, Plant.VIOLETS);

        assertEquals(
            expected,
            new KindergartenGarden(plants, studentArray).getPlantsOfStudent(student)
        );
    }

    @Test
    void customStudentGardenSecondStudentInAlphabeticalOrder() {
        String[] studentArray = {"Samantha", "Patricia", "Xander", "Roger"};
        String student = "Roger";
        String plants = "VCRRGVRG\nRVGCCGCV";
        List<Plant> expected = List.of(Plant.RADISHES, Plant.RADISHES, Plant.GRASS, Plant.CLOVER);

        assertEquals(
            expected,
            new KindergartenGarden(plants, studentArray).getPlantsOfStudent(student)
        );
    }

    @Test
    void customStudentGardenThirdStudentInAlphabeticalOrder() {
        String[] studentArray = {"Samantha", "Patricia", "Xander", "Roger"};
        String student = "Samantha";
        String plants = "VCRRGVRG\nRVGCCGCV";
        List<Plant> expected = List.of(Plant.GRASS, Plant.VIOLETS, Plant.CLOVER, Plant.GRASS);

        assertEquals(
            expected,
            new KindergartenGarden(plants, studentArray).getPlantsOfStudent(student)
        );
    }

    @Test
    void customStudentGardenFourthStudentInAlphabeticalOrder() {
        String[] studentArray = {"Samantha", "Patricia", "Xander", "Roger"};
        String student = "Xander";
        String plants = "VCRRGVRG\nRVGCCGCV";
        List<Plant> expected = List.of(Plant.RADISHES, Plant.GRASS, Plant.CLOVER, Plant.VIOLETS);

        assertEquals(
            expected,
            new KindergartenGarden(plants, studentArray).getPlantsOfStudent(student)
        );
    }

}
